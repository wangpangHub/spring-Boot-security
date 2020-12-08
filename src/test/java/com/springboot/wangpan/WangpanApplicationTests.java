package com.springboot.wangpan;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@SpringBootTest
class WangpanApplicationTests {
	//	https://www.baidu.com/s?cl=3&tn=baidutop10&fr=top1000&wd=%E7%8E%9B%E8%8E%8E%E6%8B%89%E8%92%82%E6%A1%88%E6%AD%BB%E8%80%85%E5%AE%B6%E5%B1%9E%E5%B8%8C%E6%9C%9B%E5%8F%B8%E6%9C%BA%E6%AD%BB%E5%88%91&rsv_idx=2&rsv_dl=fyb_n_homepage&hisfilter=1
	@Test
	void contextLoads() {
		try {
			Document doc=Jsoup.connect("http://www.jb51.net").data("query", "java").userAgent("Chrome").cookie("auth", "token").timeout(3000).post();
			Elements allElements = doc.getAllElements();
			System.out.println(doc.getElementById("topbar"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
