package com.springboot.wangpan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {


	@RequestMapping(value = "/unregistered/registered")
	public String registeredUserPage() {
		return "registered";
	}

	@RequestMapping(value = "/")
	public String loginPage() {
		return "login";
	}

}
