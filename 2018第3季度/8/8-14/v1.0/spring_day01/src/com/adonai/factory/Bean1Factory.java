package com.adonai.factory;

import com.adonai.pojo.UserDao;
import com.adonai.pojo.impl.UserDaoImpl;

public class Bean1Factory {
	
	//ʹ�þ�̬����ʵ�����ķ�ʽ������ Ŀ�����
	public static UserDao getBean1() {
		return new UserDaoImpl();
	}

}
