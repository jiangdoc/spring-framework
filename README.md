# 源码学习
[Spring 的主要流程都在这里]org.springframework.context.support.AbstractApplicationContext.refresh

## SpringIOC
[IOC入口]
org.springframework.beans.factory.support.AbstractBeanFactory.getBean(java.lang.String)

## SpringAOP
[生成代理对象]
org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(java.lang.String, java.lang.Object, org.springframework.beans.factory.support.RootBeanDefinition)
org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator#postProcessAfterInitialization(java.lang.Object, java.lang.String)
[jdk动态代理]
org.springframework.aop.framework.JdkDynamicAopProxy.invoke
[CGLIB动态代理]
org.springframework.aop.framework.CglibAopProxy.DynamicAdvisedInterceptor.java.intercept

## Spring事务
[源码逻辑入口](spring-tx/src/main/java/org/springframework/transaction/interceptor/TransactionInterceptor.java).invoke()