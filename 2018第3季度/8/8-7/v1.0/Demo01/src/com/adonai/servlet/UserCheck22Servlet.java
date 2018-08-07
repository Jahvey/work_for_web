package com.adonai.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/system/usercheck2")
public class UserCheck22Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
         //设置字符编码集
         request.setCharacterEncoding("utf-8");
        //模拟存在数据库里面的账号
         String[] arr={"张三","李四","王五","admin1","王豪"};
         //获取前台传来的数据
         String account=request.getParameter("account");
         
         //模拟和数据库里面的信息匹配
         boolean mark=false;
         for(String user:arr){
             if(user.equals(account)){
                 mark=true;
                 break;
             }
         }
         
         //响应前台
         response.setCharacterEncoding("utf-8");
         response.setContentType("text/html");
         PrintWriter out=response.getWriter();
         if(mark){
             out.println("<font color='red'>该帐号已经存在，请重新输入!</font>");
         }else{
             out.println("<font color='green'>恭喜您，该帐号可以使用!</font>");
         }
         out.flush();//刷新流
         out.close();//关闭流
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
