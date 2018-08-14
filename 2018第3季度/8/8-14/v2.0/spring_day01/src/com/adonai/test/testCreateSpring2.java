package com.adonai.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adonai.pojo.Car1;
import com.adonai.pojo.Person1;
import com.adonai.pojo.TestSpringEL1;
import com.adonai.pojo.UserDao;
import com.adonai.pojo.impl.UserDaoImpl;

public class testCreateSpring2 {
	
	@Test
	public void demo1() {
		ClassPathXmlApplicationContext ctx = new //
				ClassPathXmlApplicationContext("spring-el.xml");

		TestSpringEL1 bean1 = (TestSpringEL1)ctx.getBean("eldemo1");
		System.out.println(bean1);
		
		System.out.println("===================");
		
		
		
		
	}

}
