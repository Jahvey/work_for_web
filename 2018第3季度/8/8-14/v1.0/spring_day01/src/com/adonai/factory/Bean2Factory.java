package com.adonai.factory;

import com.adonai.pojo.UserDao;
import com.adonai.pojo.impl.UserDaoImpl;

public class Bean2Factory {
	
	//使用实例工厂实例化的方式来创建 目标对象
	public  UserDao getBean2() {
		return new UserDaoImpl();
	}

}
