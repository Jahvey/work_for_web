package com.adonai.struts2.demo.test;

import com.opensymphony.xwork2.ActionSupport;

public class LinkManAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5969067627335693910L;
	
	
	public String save(){
		System.out.println("������ϵ��...");
		return NONE;
	}
	public String update(){
		System.out.println("�޸���ϵ��...");
		return NONE;
	}
	public String delete(){
		System.out.println("ɾ����ϵ��...");
		return NONE;
	}
	public String find(){
		System.out.println("��ѯ��ϵ��...");
		return NONE;
	}

}
