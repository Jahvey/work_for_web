package com.adonai.factory;

import com.adonai.pojo.UserDao;
import com.adonai.pojo.impl.UserDaoImpl;

public class Bean2Factory {
	
	//ʹ��ʵ������ʵ�����ķ�ʽ������ Ŀ�����
	public  UserDao getBean2() {
		return new UserDaoImpl();
	}

}
