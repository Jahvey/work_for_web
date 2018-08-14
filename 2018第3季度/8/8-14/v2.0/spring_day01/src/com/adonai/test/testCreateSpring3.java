package com.adonai.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.adonai.pojo.CollectionBean1;


public class testCreateSpring3 {
	
	@Test
	public void demo1() {
		ClassPathXmlApplicationContext ctx = new //
				ClassPathXmlApplicationContext("spring-el2.xml");

		CollectionBean1 bean1 = (CollectionBean1)ctx.getBean("collectionBean");
		System.out.println(bean1);
		
		System.out.println("===================");
		
		
		
		
	}

}
