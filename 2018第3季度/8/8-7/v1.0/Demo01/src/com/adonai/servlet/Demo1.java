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

		
        //�����ַ����뼯
         request.setCharacterEncoding("utf-8");
         //ģ��������ݿ�������˺�
        String[] arr={"����","����","����","admin","����"};
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
         out.print(account+"<br/>");
         if(mark){
             out.print("true");
         }else{
             out.print("false");
        }
        out.flush();//ˢ����
       out.close();//�ر���
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
