package com.HAH.demo.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.HAH.demo.bean.Student;


public class StudentTest {
	
	@Test
	void demoTest() {
		try(var context = new ClassPathXmlApplicationContext("classpath:app.xml")){
			context.refresh();
			var bean = context.getBean(Student.class);
			bean.create();
			bean.register("Htun Aung Hlaing", 23);
			bean.multiple(17, 8);
		}
	}

}
