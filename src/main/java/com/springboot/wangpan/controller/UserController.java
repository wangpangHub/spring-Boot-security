package com.springboot.wangpan.controller;

import com.springboot.wangpan.entity.User;
import com.springboot.wangpan.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/userService/controller")
public class UserController {
	@Autowired
	UserServiceImpl userService;

	@RequestMapping("/unregistered/searchUser")
	public Integer userLogin(HttpServletRequest httpServletRequest) {
		String loginId = httpServletRequest.getParameter("loginId");
		User user = userService.getLoginIdSearchUser(loginId);
		if (user != null) {
		return 1;
		}
		return 0;
	}

	@RequestMapping("/createUser")
	public String createUser(HttpServletRequest httpServletRequest) {
		Map<String, String[]> parameterMap = httpServletRequest.getParameterMap();
//		userService.insetUser();
		return "";
	}
}
