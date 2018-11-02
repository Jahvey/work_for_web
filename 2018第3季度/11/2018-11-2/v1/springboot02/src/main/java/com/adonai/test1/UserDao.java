package com.adonai.test1;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
	
	public List<User> queryUserlist() {
		
		
		
		List<User> result= new ArrayList<User>();
		
		for (int i = 0; i < 10; i++) {
			
			User user=new User();
			user.setAge(i);
			user.setPassword("pass_"+i);
			user.setUsername("name_"+i);
			
			
			result.add(user);
		}
		
		
		return result;
	}
	
	

}
