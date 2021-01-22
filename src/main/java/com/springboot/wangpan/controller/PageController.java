package com.springboot.wangpan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {


	@RequestMapping(value = "/unregistered/registered")
	public String registeredUserPage() {
		return "registered";
	}

	@RequestMapping(value = "/login.html")
	public String loginPage() {
		return "login";
	}

	@RequestMapping("/user/index.html")
	public String indexPage() {
		return "index";
	}

}
