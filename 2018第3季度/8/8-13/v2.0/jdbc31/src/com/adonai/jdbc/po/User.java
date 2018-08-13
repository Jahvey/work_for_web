package com.adonai.jdbc.po;

import java.util.Date;

public class User {
	
	
	private int id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String sex;
	private String username;
	
	private Date birthday;
	private String address;

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", sex=" + sex + ", username=" + username + ", birthday=" + birthday + ", address="
				+ address + "]";
	}
	
	

}
