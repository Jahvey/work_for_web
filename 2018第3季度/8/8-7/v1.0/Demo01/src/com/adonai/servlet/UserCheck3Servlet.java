package com.adonai.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/system/UserCheck3Servlet")
public class UserCheck3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String[]names= {"王豪","admin1"};
		String account=request.getParameter("account");
		String pwd=request.getParameter("pwd");
		
		boolean flag=false;
		for (String user : names) {
			if(user.equals(account)&&pwd.equals("123")) {
				flag=true;
				break;
			}
		}
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
        if(flag){
            //out.println("<font color='red'>该帐号已经存在，请重新输入!</font>");
        	out.println("<font color='red'>登陆成功!</font>");
        }else{
            //out.println("<font color='green'>恭喜您，该帐号可以使用!</font>");
        	out.println("<font color='green'>用户名或密码错误!!</font>");
        }
        
        
        out.flush();
        out.close();
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
