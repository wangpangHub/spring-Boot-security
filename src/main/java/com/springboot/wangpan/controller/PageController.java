package com.springboot.wangpan.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class PageController {


	@RequestMapping(value = "/unregistered/registered")
	public String registeredUserPage() {
		return "registered";
	}

	@RequestMapping(value = "/login.html")
	public String loginPage() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Object principal = authentication.getPrincipal();
		if (principal.equals("anonymousUser")) {
			return "login";
		}
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		return "index";
	}

	@RequestMapping("/user/index.html")
	public String indexPage() {
		return "index";
	}

}
