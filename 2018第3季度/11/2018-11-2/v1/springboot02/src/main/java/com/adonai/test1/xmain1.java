package com.adonai.test1;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.adonai.config.springconfig;

public class xmain1 {
	
	
	public static void main(String[] args) {
		
		
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(springconfig.class);
		
		//从spring 容器种取到相应的bean对象
		UserService userService=context.getBean(UserService.class);
		
		
		List<User> list=userService.queryUserlist();
		
		for (User user : list) {
			System.out.println(user.getPassword()+" , "+user.getUsername()+" , "+user.getAge());
		}
		
		
	}

}
