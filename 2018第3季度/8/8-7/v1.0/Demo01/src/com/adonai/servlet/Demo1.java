package com.adonai.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Demo1
 */
@WebServlet("/system/usercheck")
public class Demo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
        //设置字符编码集
         request.setCharacterEncoding("utf-8");
         //模拟存在数据库里面的账号
        String[] arr={"张三","李四","王五","admin","王豪"};
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
         out.print(account+"<br/>");
         if(mark){
             out.print("true");
         }else{
             out.print("false");
        }
        out.flush();//刷新流
       out.close();//关闭流
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
