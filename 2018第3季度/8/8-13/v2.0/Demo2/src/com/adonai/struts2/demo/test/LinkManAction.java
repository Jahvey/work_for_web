package com.adonai.struts2.demo.test;

import com.opensymphony.xwork2.ActionSupport;

public class LinkManAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5969067627335693910L;
	
	
	public String save(){
		System.out.println("保存联系人...");
		return NONE;
	}
	public String update(){
		System.out.println("修改联系人...");
		return NONE;
	}
	public String delete(){
		System.out.println("删除联系人...");
		return NONE;
	}
	public String find(){
		System.out.println("查询联系人...");
		return NONE;
	}

}
