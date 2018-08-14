package com.adonai.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.adonai.pojo.Customer;
import com.adonai.util.HibernateUtils;

public class HibernateDemo1 {
	
	
	@Test
	public void demo1() {
		Configuration cfg=new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Customer customer = new Customer();
		customer.setCust_name("����");
		customer.setCust_source("�����ƹ�2");
		
		session.save(customer);
		
		tx.commit();
		
		session.close();
		
	}
	
	
	@Test
	//֤��hibernate��һ�������Ǵ��ڵ�
	public void demo2() {
		Session session = HibernateUtils.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Customer customer1 = session.get(Customer.class	, 1);
		
		System.out.println(customer1);
		
		
		Customer customer2 = session.get(Customer.class, 1);
		System.out.println(customer2);
		
		System.out.println("==============");
		System.out.println(customer1==customer2);
		
		tx.commit();
		session.close();
		
	}
	
	
	//hibernate �﷨����ѯ���м�¼��hibernate api creatQuery(String str)
	@Test
	public void testQueryAllRecords() {
		Session session = HibernateUtils.openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("from Customer");
		List<Customer> list = query.list();
		
		for (Customer customer : list) {
			System.out.println(customer);
		}
		
		transaction.commit();
		session.close();
		
		
		
		
		
	}
	
	
	//������ѯ
	@Test
	public void testQuerybyCondition() {
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Customer where cust_name=?");
		
		query.setString(0, "С��");
		List<Customer> list = query.list();
		
		for (Customer customer : list) {
			System.out.println(customer);
		}
		tx.commit();
		
		
		
	}
	
	//��ҳ��ѯ
	@Test
	public void testQuerybyPages()
	{
		
		Session session = HibernateUtils.getCurrentSession();
		
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Customer");
		
		query.setFirstResult(0);//��ҳ����0��ʼ
		query.setMaxResults(4);
		
		List<Customer> list = query.list();
		
		for (Customer customer : list) {
			System.out.println(customer);
		}
		
			
		tx.commit();
		
	}
	
	
	
	
}
