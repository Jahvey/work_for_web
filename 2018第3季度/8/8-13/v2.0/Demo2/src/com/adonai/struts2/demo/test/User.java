package com.adonai.struts2.demo.test;

import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3725445627821302088L;
	
	
	public String save(){
		System.out.println("保存用户...");
		return NONE;
	}
	public String update(){
		System.out.println("修改用户...");
		return NONE;
	}
	public String delete(){
		System.out.println("删除用户...");
		return NONE;
	}
	public String find(){
		System.out.println("查询用户...");
		return NONE;
	}

}
