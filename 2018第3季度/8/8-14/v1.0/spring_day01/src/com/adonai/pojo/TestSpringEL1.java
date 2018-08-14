package com.adonai.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("eldemo1")
public class TestSpringEL1 {
	@Value("#{5}")
	private Integer num;
	@Value("#{'ÍõºÀ'}")
	private String name;

	private Double salary;



	@Override
	public String toString() {
		return "TestSpringEL1 [num=" + num + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	
	

}
