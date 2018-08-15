package com.adonai.struts2.test;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class requestDemo1Action extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8952141191364725371L;

	@Override
	public String execute() throws Exception {
		ActionContext actionContext = ActionContext.getContext();
		
		Map<String, Object> parameters = actionContext.getParameters();
		
		for (String key : parameters.keySet()) {
			
			String[]values=(String[]) parameters.get(key);
			
			System.out.println(key+" "+values[0]);
			
		}
		
		
		//向request中存入数据
		actionContext.put("requestName", "张三");
		
		actionContext.getSession().put("sessionName", "王豪");
		
		actionContext.getApplication().put("applicationName", "王五");
		
		
		
		
		
		
		
		return SUCCESS;
	}

	
	
	
	
	
}
