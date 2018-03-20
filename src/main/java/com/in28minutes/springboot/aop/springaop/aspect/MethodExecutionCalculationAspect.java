package com.in28minutes.springboot.aop.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Around("com.in28minutes.springboot.aop.springaop.aspect.CommonJoinPointConfig.trackTimeExecution()")
	public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		long start = System.currentTimeMillis();
		proceedingJoinPoint.proceed();
		long timeTaken = System.currentTimeMillis() - start;
		logger.info("Time taken by {} is {}", proceedingJoinPoint, timeTaken);
	}
}
