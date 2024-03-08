package com.HAH.demo.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.HAH.demo.Employee;

public class LogTest {

	@Test
	void demoTest() {
		
		try(var context = new GenericXmlApplicationContext()){
			context.load("EmpApp.xml");
			context.refresh();
			var bean = context.getBean(Employee.class);
			bean.createAccount();
		}
		
	}
}
