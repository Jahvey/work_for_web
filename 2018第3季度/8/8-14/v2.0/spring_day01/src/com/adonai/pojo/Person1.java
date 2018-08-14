package com.adonai.pojo;

public class Person1 {
	
	private String name;
	private Car1 car;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car1 getCar() {
		return car;
	}
	public void setCar(Car1 car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", car=" + car + "]";
	}
	

}
