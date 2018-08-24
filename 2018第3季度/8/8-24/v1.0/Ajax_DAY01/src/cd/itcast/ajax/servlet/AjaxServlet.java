package cd.itcast.ajax.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AjaxServlet")
public class AjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AjaxServlet() {
        super();
    }

	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ajax..... get");
		Date date = new Date();
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>哈哈</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//获取请求内容的类型,没有对应的setContentType方法,因为这个值的设置是由"请求头"设定.
		//如果是普通form表单提交才使用是application/x-www-form-urlencoded
		//x-www-form-urlencoded提交的数据是通过url进行编码的.
		//System.out.println(request.getContentType());
		
		//如果是ajax提交的时候使用是text/plain,
		//text/plain提交的数据是文本.
		System.out.println(request.getContentType());
		
		//request.getParameter 获取请求数转换为参数,通过urldecode进行解码.
		System.out.println(request.getParameter("username"));
		System.out.println(request.getParameter("password"));
	}
}
