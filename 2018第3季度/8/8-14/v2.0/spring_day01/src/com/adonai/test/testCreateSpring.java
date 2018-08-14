package com.adonai.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adonai.pojo.Car1;
import com.adonai.pojo.Person1;
import com.adonai.pojo.UserDao;
import com.adonai.pojo.impl.UserDaoImpl;

public class testCreateSpring {
	
	@Test
	public void demo1() {
		ClassPathXmlApplicationContext ctx = new //
				ClassPathXmlApplicationContext("applicationContext.xml");

		UserDao user = (UserDao) ctx.getBean("userDao");
		
		user.sayHello();
		
		System.out.println("=============");
		System.out.println("ʹ�þ�̬�����ķ�ʽ�����Ķ���");
		UserDao bean1 = (UserDao) ctx.getBean("bean1");
		bean1.sayHello();
		
		System.out.println("=============");
		System.out.println("ʹ��ʵ�������ķ�ʽ�����Ķ���");
		UserDao bean2 = (UserDao) ctx.getBean("bean2");
		bean2.sayHello();
		System.out.println("=============");
		
		Car1 car2 = (Car1)ctx.getBean("car1");
		System.out.println(car2);
		
		Person1 p1 = (Person1)ctx.getBean("person1");
		
		System.out.println(p1);
		
		System.out.println("===================");
		
		
		
		
	}

}
