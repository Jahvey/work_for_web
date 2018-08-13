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
		// 1. 创建SqlSessionFactoryBuilder对象
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

		// 2. 加载SqlMapConfig.xml配置文件
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

		// 3. 创建SqlSessionFactory对象
		this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
		
		
	}
	
	@Test
	public void testQueryUserById() throws Exception {
		// 4. 创建SqlSession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 5. 执行SqlSession对象执行查询，获取结果User
		// 第一个参数是User.xml的statement的id，第二个参数是执行sql需要的参数；
		Object user = sqlSession.selectOne("queryUserById", 10);

		// 6. 打印结果
		System.out.println(user);

		// 7. 释放资源
		sqlSession.close();
	}
	
	
	
	
	@Test
	public void testQueryByUsername1() throws Exception {
		// 4. 创建SqlSession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 5. 执行SqlSession对象执行查询，获取结果User
		List<Object> lists = sqlSession.selectList("queryUserByUsername1", "%王%");

		// 6. 打印结果
		for (Object user : lists) {
			System.out.println(user);
		}
		

		// 7. 释放资源
		sqlSession.close();
	}
	
	
	
	
	@Test
	public void testSaveUser() throws Exception {
		// 4. 创建SqlSession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 5. 执行SqlSession对象执行查询，获取结果User
		User user = new User();
		user.setUsername("张飞");
		user.setSex("2");
		user.setBirthday(new Date());
		user.setAddress("蜀国");
		sqlSession.insert("saveUser2", user);
		
		// 6. 打印结果
		System.out.println(user);
		// 需要进行事务提交
		sqlSession.commit();

		// 7. 释放资源
		sqlSession.close();
	}
	
	
	
	@Test
	public void testUpdateUserById() throws Exception {
		// 4. 创建SqlSession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 5. 执行SqlSession对象执行查询，获取结果User
		User user = new User();
		user.setId(31);
		user.setUsername("曹操");
		user.setSex("2");
		user.setBirthday(new Date());
		user.setAddress("魏国");
		sqlSession.update("updateUserById", user);
		
		// 6. 打印结果
		System.out.println(user);
		// 需要进行事务提交
		sqlSession.commit();

		// 7. 释放资源
		sqlSession.close();
	}
	
	
	
	
	
	@Test
	public void testDeleteUserById() throws Exception {
		// 4. 创建SqlSession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();

		
		sqlSession.delete("deleteUserById", 34);

		// 需要进行事务提交
		sqlSession.commit();

		// 7. 释放资源
		sqlSession.close();
	}
	
	
	
	
	

}
