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
		
		
         //�����ַ����뼯
         request.setCharacterEncoding("utf-8");
        //ģ��������ݿ�������˺�
         String[] arr={"����","����","����","admin1","����"};
         //��ȡǰ̨����������
         String account=request.getParameter("account");
         
         //ģ������ݿ��������Ϣƥ��
         boolean mark=false;
         for(String user:arr){
             if(user.equals(account)){
                 mark=true;
                 break;
             }
         }
         
         //��Ӧǰ̨
         response.setCharacterEncoding("utf-8");
         response.setContentType("text/html");
         PrintWriter out=response.getWriter();
         if(mark){
             out.println("<font color='red'>���ʺ��Ѿ����ڣ�����������!</font>");
         }else{
             out.println("<font color='green'>��ϲ�������ʺſ���ʹ��!</font>");
         }
         out.flush();//ˢ����
         out.close();//�ر���
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}

}
