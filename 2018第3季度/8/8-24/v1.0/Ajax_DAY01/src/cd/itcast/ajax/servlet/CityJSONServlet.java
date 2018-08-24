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

@WebServlet("/CityJSONServlet")
public class CityJSONServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		response.setContentType("text/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		/**
		 * cmd=listProvince 获取所有省份列表
		 * cmd=listCity     获取某个省份对应的城市列表    provinceId省份的id.
		 */
		String cmd = request.getParameter("cmd");
		if("listProvince".equals(cmd)){
			List<Province> provinces = Province.getAllProvince();
			/*
				 * 		[
					 * 	{
					 * 		"id":1,
					 * 		"name":"四川"
					 *  },
					 * 	{
					 * 		"id":2,
					 * 		"name":"云南"
					 * 	}
					 * ]
			*/
			StringBuilder jsonSb = new StringBuilder("[");
			for (Province province : provinces) {
				jsonSb.append("{\"id\":").append(province.getId());
				jsonSb.append(",\"name\":\"");
				jsonSb.append(province.getName());
				jsonSb.append("\"},");
			}
			jsonSb.deleteCharAt(jsonSb.length()-1);
			jsonSb.append("]");
			
			out.print(jsonSb);
			
		}else if("listCity".equals(cmd)){
			String id = request.getParameter("provinceId");
			List<City> citys = City.getCityByProvinceId(Long.parseLong(id));
			for (City city : citys) {
				out.println("<option value='" +city.getId()+"'>"+city.getName()+"</option>");
			}
		}
	}
}
