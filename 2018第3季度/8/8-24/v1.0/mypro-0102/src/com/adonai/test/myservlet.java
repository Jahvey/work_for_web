package com.adonai.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myservlet")
public class myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("utf-8");
		
		String username = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter writer = response.getWriter();
		if(username.equals("adonai")&&pwd.equals("123")) {
			
			writer.write("<b style='color:red'>恭喜你,用户名可用</b>");
		}else {
			writer.write("<b style='color:blue'>恭喜你,用户名不可用</b>");
		}
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
