package com.HAH.demo.aspect;

import org.aspectj.lang.JoinPoint;

public class LogAspects {

	public void logMethodStart(JoinPoint joinPoint) {
		System.out.println("Starting Log Method :" + joinPoint.getSignature().toShortString());
	}
	
	public void logMethodComplete(JoinPoint joinPoint) {
		System.out.println("Completing Log Method :" + joinPoint.getSignature().toShortString());
	}
	
	public void logMethodFail(JoinPoint joinPoint, RuntimeException exception) {
		System.out.println("Method Execution Fail :" + joinPoint.getSignature().toShortString());
		System.out.println("Error Message :" + exception.toString());
	}
}
