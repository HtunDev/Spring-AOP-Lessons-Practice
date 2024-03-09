package com.HAH.demo.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.HAH.demo.bean.Calculator;

public class CalculatorTest {
	
	@Test
	void demoTest() {
		try(var context = new GenericXmlApplicationContext()){
			context.load("app.xml");
			context.refresh();
			var bean = context.getBean(Calculator.class);
			bean.multiply(18, 9);
		}
	}

}
