/**
 * 
 */
package com.wh.autoCarCrawler.CrawlerDemo_0100;

import java.io.BufferedWriter;
import java.io.FileWriter;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * @author Adonai
 * @qq 2807867265
 * @time 2018年9月28日 下午3:23:57
 * @address chengdu
 */
public class autoHomeCrawler1 {

	/**
	 * @time 2018年9月28日 下午3:23:57
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		// 创建httpClient对象
		CloseableHttpClient httpClient = //
				HttpClients.createDefault();

		// 声明httpGet对象

		HttpGet httpGet = //
				new HttpGet("https://www.autohome.com.cn/beijing/");
		// 发起Httpget请求，获取response
		CloseableHttpResponse response = httpClient.execute(httpGet);

		BufferedWriter writer = new BufferedWriter(new FileWriter("d:\\res.txt"));

		if (response.getStatusLine().getStatusCode() == 200) {
			// 判断响应的状态吗是不是200,如果是200,则需要进行处理
			String html = EntityUtils.toString(response.getEntity(), "utf-8");
			System.out.println(html);
			writer.write(html);

		}

	}

}
