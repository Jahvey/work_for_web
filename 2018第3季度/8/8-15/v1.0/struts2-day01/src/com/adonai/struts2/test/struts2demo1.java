package com.adonai.struts2.test;

import com.opensymphony.xwork2.ActionSupport;

public class struts2demo1 extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1814101936344448299L;
	
	public String execute() {
		System.out.println("struts2 cretae finished...");
		return "success";
		
	}
}
