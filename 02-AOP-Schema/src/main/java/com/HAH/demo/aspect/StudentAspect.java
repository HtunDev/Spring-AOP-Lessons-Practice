package com.HAH.demo.aspect;

public class StudentAspect {

	public void beforeExecution() {
		System.out.println("Before Execution");
	}

	public void afterExecution() {
		System.out.println("After Execution");
	}

	public void afterReturnig(String name, Integer ageNumber) {
		System.out.println("After Returning");
	}
	
	public void afterReturn(Integer result,Integer number1,Integer number2) {
		System.out.println("after return");
		System.out.println("Num 1 : %d".formatted(number1));
		System.out.println("Num 2 : %d".formatted(number2));
		System.out.println("Total result : %d".formatted(result));
	}
}