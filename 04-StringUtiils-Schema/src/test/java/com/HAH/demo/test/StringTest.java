package com.HAH.demo.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.HAH.demo.bean.StringUtils;

public class StringTest {
	
	@Test
	void demoTest() {
		try(var context = new GenericXmlApplicationContext()){
			context.load("app.xml");
			context.refresh();
			var bean = context.getBean(StringUtils.class);
			bean.concat("My girlfriend name is", "Hsu Lae Hnin");
		}
	}

}
