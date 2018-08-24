package cd.itcast.ajax.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cd.itcast.ajax.domain.City;
import cd.itcast.ajax.domain.Province;

@WebServlet("/CityXMLServlet")
public class CityXMLServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/xml;charset=utf-8");
		PrintWriter out = response.getWriter();
		/**
		 * cmd=listProvince 获取所有省份列表
		 * cmd=listCity     获取某个省份对应的城市列表    provinceId省份的id.
		 */
		String cmd = request.getParameter("cmd");
		if("listProvince".equals(cmd)){
			
			List<Province> provinces = Province.getAllProvince();
			/**
			 * xml 描述一个对象
			 * <datas>
				 * <data id="1">四川 </data>
				 * <data id="2">云南</data>
			 * </datas>
			 */
			out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			out.println("<datas>");
			for (Province province : provinces) {
				out.println("<data id=\"" +province.getId()+"\">" +province.getName()+"</data>");
			}
			out.println("</datas>");
		}else if("listCity".equals(cmd)){
			String id = request.getParameter("provinceId");
			
		}
	}
}
