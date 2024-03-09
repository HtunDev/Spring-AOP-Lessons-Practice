package com.HAH.demo.aspect;

public class CalculatorAspect {

	public void afterReturning(int result, int number1, int number2) {
		System.out.println("Number 1 : %d".formatted(number1));
		System.out.println("Number 2 : %d".formatted(number2));
		System.out.println("Total Result : %d".formatted(result));
	}

}
