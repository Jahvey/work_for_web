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
		System.out.println("使用静态工厂的方式创建的对象；");
		UserDao bean1 = (UserDao) ctx.getBean("bean1");
		bean1.sayHello();
		
		System.out.println("=============");
		System.out.println("使用实例工厂的方式创建的对象；");
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
