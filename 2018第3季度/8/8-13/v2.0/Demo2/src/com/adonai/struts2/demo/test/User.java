package com.adonai.struts2.demo.test;

import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3725445627821302088L;
	
	
	public String save(){
		System.out.println("�����û�...");
		return NONE;
	}
	public String update(){
		System.out.println("�޸��û�...");
		return NONE;
	}
	public String delete(){
		System.out.println("ɾ���û�...");
		return NONE;
	}
	public String find(){
		System.out.println("��ѯ�û�...");
		return NONE;
	}

}
