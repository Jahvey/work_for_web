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
		//创建了一个session 和本地线程LocalThread绑定的方法，
		//线程执行完成之后自动关闭session不需要手动释放。
		return SESSION_FACTORY.getCurrentSession();
	}
	
	/**
	 * 
	 * 提供获得session的方法
	 * */
	public static Session openSession() {
		return SESSION_FACTORY.openSession();
		
	}
	
	
	

}
