package com.adonai.struts2.demo;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class StrutsDemo1 extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5643652735263930568L;
	
	// 接收参数:
	private String name;
	private Integer age;
	private Date birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	

}
