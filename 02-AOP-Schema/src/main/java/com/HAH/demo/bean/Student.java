package com.HAH.demo.bean;

public class Student {

	public void create() {
		System.out.println("Create Student");
	}
	
	public void register(String name, int age) {
		System.out.println("Register Student");
		System.out.println("Name is %s".formatted(name));
		System.out.println("Age is %d".formatted(age));
	}
	
	public int multiple(int num1,int num2) {
		var result = num1*num2;
		return result;
	}
}
