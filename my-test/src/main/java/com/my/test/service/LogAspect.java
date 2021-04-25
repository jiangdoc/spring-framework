package com.my.test.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 日志切面类
 */
@Aspect
@Component
public class LogAspect {
	@Pointcut("execution(public * com.my.test.service.*.*(..))")
	public void serviceMethod() {
	}

	@Before("serviceMethod()")
	public void Before(JoinPoint joinPoint) throws Exception {
		System.out.println("前置处理");
	}

	@After("serviceMethod()")
	public void After() throws Exception {
		System.out.println("后置处理");
	}

	@Around("serviceMethod()")
	public Object Around(ProceedingJoinPoint pjd) throws Exception {
		Object result = null;
		try {
			System.out.println("环绕通知---前");
			result = pjd.proceed();
			System.out.println("环绕通知---后");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return result;
	}

	@AfterReturning("serviceMethod()")
	public void AfterReturning() throws Exception {
		System.out.println("返回结果通知");
	}

	@AfterThrowing(value = "serviceMethod()", throwing = "ex")
	public void AfterThrowing(JoinPoint joinPoint, Exception ex) throws Exception {
		System.out.println("异常通知" + ex.getMessage());

	}
}