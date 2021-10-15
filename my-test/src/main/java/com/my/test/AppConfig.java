package com.my.test;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionValidationException;
import org.springframework.beans.factory.support.NullBean;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author jiangwenjie
 * @date 2021/4/24
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.my.test"})
public class AppConfig extends AbstractAutowireCapableBeanFactory {
	private boolean allowCircularReferences;
	private boolean allowRawInjectionDespiteWrapping;

	protected Object doCreateBean(String beanName, RootBeanDefinition mbd, @Nullable Object[] args) throws BeanCreationException {
		// TODO 1. 实例化Bean : 反射
		// 真实对象
		BeanWrapper instanceWrapper = createBeanInstance(beanName, mbd, args);
		Object bean = instanceWrapper.getWrappedInstance();

		// 提前缓存 半成品的Bean ，解决循环依赖
		boolean earlySingletonExposure = (mbd.isSingleton() && this.allowCircularReferences && isSingletonCurrentlyInCreation(beanName));
		if (earlySingletonExposure) {
			/**
			 * TODO 这里是解决循环依赖的关键地方，这里会将Bean放入到三级缓存：这样在循环getBean 会在一个getSingleton()中触发getEarlyBeanReference函数
			 * 里面会执行 singletonFactories.put(beanName, singletonFactory);
			 * getEarlyBeanReference 里面获取正在最终的Bean
			 */
			addSingletonFactory(beanName, () -> getEarlyBeanReference(beanName, mbd, bean));
		}

		Object exposedObject = bean;
		// TODO 2.属性注入 ：如果实现了 执行Aware
		populateBean(beanName, mbd, instanceWrapper);
		// TODO 3. 初始化 : 如果实现了代理，这里代理对象会替换真实对象
		exposedObject = initializeBean(beanName, exposedObject, mbd);

		// TODO: 提前暴露的 bean 检查
		if (earlySingletonExposure) {
			// 获取到提前暴露的 Bean,如果需要代理，就是代理后的bean
			Object earlySingletonReference = getSingleton(beanName, false);
			if (earlySingletonReference != null) {
				// 如果实例化的 bean 和初始后的bean 不一致，违反bean 单例
				if (exposedObject == bean) {
					// 将提前暴露的bean赋值给最终bean
					exposedObject = earlySingletonReference;
				} else if (!this.allowRawInjectionDespiteWrapping && hasDependentBean(beanName)) {
					//....省略
					if (!actualDependentBeans.isEmpty()) {
						throw new BeanCurrentlyInCreationException(beanName, "Bean with name '" + beanName + "' has been injected into other beans [" + StringUtils.collectionToCommaDelimitedString(actualDependentBeans) + "] in its raw version as part of a circular reference, but has eventually been " + "wrapped. This means that said other beans do not use the final version of the " + "bean. This is often the result of over-eager type matching - consider using " + "'getBeanNamesForType' with the 'allowEagerInit' flag turned off, for example.");
					}
				}
			}
		}
		return exposedObject;
	}
	protected Object initializeBean(String beanName, Object bean, @Nullable RootBeanDefinition mbd) throws Throwable {
		Object wrappedBean = bean;
		if (mbd == null || !mbd.isSynthetic()) {
			// TODO 1. 执行BeanPostProcessor 的 初始化前置处理器
			wrappedBean = applyBeanPostProcessorsBeforeInitialization(wrappedBean, beanName);
		}

		/**
		 * TODO 2.初始化方法
		 * 会执行 InitializingBean.afterPropertiesSet()、init-method
		 */
		invokeInitMethods(beanName, wrappedBean, mbd);

		if (mbd == null || !mbd.isSynthetic()) {
			/**
			 * TODO 3. 执行BeanPostProcessor 的 初始化后置处理器
			 *  3.1 AOP会在这里把 真实对象替换成 代理后对象
			 * @see org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator
			 * @see org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator#postProcessAfterInitialization(java.lang.Object, java.lang.String)
			 *  3.2 事务
			 */
			wrappedBean = applyBeanPostProcessorsAfterInitialization(wrappedBean, beanName);
		}

		return wrappedBean;
	}
}
