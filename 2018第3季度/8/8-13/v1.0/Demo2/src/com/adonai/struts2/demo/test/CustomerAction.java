package com.adonai.struts2.demo.test;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5382583227011451117L;
	
	
	public String save(){
		System.out.println("CustomerAction��save����ִ����...");
		return NONE;
	}
	public String update(){
		System.out.println("CustomerAction��update����ִ����...");
		return NONE;
	}
	public String delete(){
		System.out.println("CustomerAction��delete����ִ����...");
		return NONE;
	}
	public String find(){
		System.out.println("CustomerAction��find����ִ����...");
		return NONE;
	}

}
