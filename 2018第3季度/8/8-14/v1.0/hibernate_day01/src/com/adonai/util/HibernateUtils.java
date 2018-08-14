package com.adonai.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	
	private static final Configuration CONFIGURATION;
	
	private static final SessionFactory SESSION_FACTORY;
	
	static {
		
		CONFIGURATION=new Configuration().configure();
		SESSION_FACTORY=CONFIGURATION.buildSessionFactory();
		
	}
	
	
	
	
	public static Session getCurrentSession() {
		//������һ��session �ͱ����߳�LocalThread�󶨵ķ�����
		//�߳�ִ�����֮���Զ��ر�session����Ҫ�ֶ��ͷš�
		return SESSION_FACTORY.getCurrentSession();
	}
	
	/**
	 * 
	 * �ṩ���session�ķ���
	 * */
	public static Session openSession() {
		return SESSION_FACTORY.openSession();
		
	}
	
	
	

}
