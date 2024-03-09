package com.HAH.demo.aspect;

public class StringAspect {

	public void afterReturning(String result, String str1, String str2) {
		System.out.println("First string : %s".formatted(str1));
		System.out.println("Second string : %s".formatted(str2));
		System.out.println("String Concat : %s".formatted(result));
	}

}
