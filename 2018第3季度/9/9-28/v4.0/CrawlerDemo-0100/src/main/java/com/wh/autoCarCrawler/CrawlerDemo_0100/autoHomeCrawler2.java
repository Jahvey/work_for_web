package com.wh.autoCarCrawler.CrawlerDemo_0100;

import java.net.URI;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

//
/**
 * 带参数的访问get
 * 
 * @author Adonai
 * @qq 2807867265
 * @time 2018年9月28日 下午4:14:04
 * @address chengdu
 */
public class autoHomeCrawler2 {

	public static void main(String[] args) throws Exception {

		// 1.创建一个httpClient对象 相当于浏览器
		CloseableHttpClient httpClient = HttpClients.createDefault();

		// 2.创建一个httpGet对象 用作请求的封装 相当于请求地址
		// HttpGet httpGet = new HttpGet("https://www.autohome.com.cn/chengdu/");
		URIBuilder uriBuilder = new URIBuilder("http://www.baidu.com/s").setParameter("wd", "google");

		URI uri = uriBuilder.build();

		System.out.println(uri);
		HttpGet httpGet = new HttpGet(uri);

		// 3.使用httpClient执行 httpget请求 得到结果response (相当于浏览器输入Url按回车按钮)

		CloseableHttpResponse response = httpClient.execute(httpGet);

		// 4.如果相应结果正常实现 则打印相应结果
		if (response.getStatusLine().getStatusCode() == 200) {

			String html = EntityUtils.toString(response.getEntity());
			System.out.println(html);
		}

		if (response != null) {
			response.close();
		}

		if (httpClient != null) {
			httpClient.close();
		}

	}

}
