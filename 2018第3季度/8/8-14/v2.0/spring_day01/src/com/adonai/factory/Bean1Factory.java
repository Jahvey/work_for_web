package com.adonai.factory;

import com.adonai.pojo.UserDao;
import com.adonai.pojo.impl.UserDaoImpl;

public class Bean1Factory {
	
	//使用静态工厂实例化的方式来创建 目标对象
	public static UserDao getBean1() {
		return new UserDaoImpl();
	}

}
