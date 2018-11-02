package com.adonai.test1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	//注入spring容器种的bean对象
	@Autowired
	private UserDao userDao; //因为在spring 容器里面又bean对象了
	
	
	public List<User> queryUserlist() {
		
		//调用userdao种的方法进行查询
		return this.userDao.queryUserlist();
		
	}
	
	
	
	
	
	

}
