package com.adonai.jdbc.test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.adonai.jdbc.po.User;

public class MybatisTest1 {

	private SqlSessionFactory sqlSessionFactory = null;
	
	@Before
	public void init() throws Exception{
		// 1. ����SqlSessionFactoryBuilder����
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

		// 2. ����SqlMapConfig.xml�����ļ�
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

		// 3. ����SqlSessionFactory����
		this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
		
		
	}
	
	@Test
	public void testQueryUserById() throws Exception {
		// 4. ����SqlSession����
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 5. ִ��SqlSession����ִ�в�ѯ����ȡ���User
		// ��һ��������User.xml��statement��id���ڶ���������ִ��sql��Ҫ�Ĳ�����
		Object user = sqlSession.selectOne("queryUserById", 10);

		// 6. ��ӡ���
		System.out.println(user);

		// 7. �ͷ���Դ
		sqlSession.close();
	}
	
	
	
	
	@Test
	public void testQueryByUsername1() throws Exception {
		// 4. ����SqlSession����
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 5. ִ��SqlSession����ִ�в�ѯ����ȡ���User
		List<Object> lists = sqlSession.selectList("queryUserByUsername1", "%��%");

		// 6. ��ӡ���
		for (Object user : lists) {
			System.out.println(user);
		}
		

		// 7. �ͷ���Դ
		sqlSession.close();
	}
	
	
	
	
	@Test
	public void testSaveUser() throws Exception {
		// 4. ����SqlSession����
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 5. ִ��SqlSession����ִ�в�ѯ����ȡ���User
		User user = new User();
		user.setUsername("�ŷ�");
		user.setSex("2");
		user.setBirthday(new Date());
		user.setAddress("���");
		sqlSession.insert("saveUser2", user);
		
		// 6. ��ӡ���
		System.out.println(user);
		// ��Ҫ���������ύ
		sqlSession.commit();

		// 7. �ͷ���Դ
		sqlSession.close();
	}
	
	
	
	@Test
	public void testUpdateUserById() throws Exception {
		// 4. ����SqlSession����
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 5. ִ��SqlSession����ִ�в�ѯ����ȡ���User
		User user = new User();
		user.setId(31);
		user.setUsername("�ܲ�");
		user.setSex("2");
		user.setBirthday(new Date());
		user.setAddress("κ��");
		sqlSession.update("updateUserById", user);
		
		// 6. ��ӡ���
		System.out.println(user);
		// ��Ҫ���������ύ
		sqlSession.commit();

		// 7. �ͷ���Դ
		sqlSession.close();
	}
	
	
	
	
	
	@Test
	public void testDeleteUserById() throws Exception {
		// 4. ����SqlSession����
		SqlSession sqlSession = sqlSessionFactory.openSession();

		
		sqlSession.delete("deleteUserById", 34);

		// ��Ҫ���������ύ
		sqlSession.commit();

		// 7. �ͷ���Դ
		sqlSession.close();
	}
	
	
	
	
	

}
