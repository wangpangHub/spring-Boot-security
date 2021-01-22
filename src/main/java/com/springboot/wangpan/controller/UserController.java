package com.springboot.wangpan.controller;

import com.springboot.wangpan.entity.User;
import com.springboot.wangpan.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("/userService/controller")
public class UserController {
	@Autowired
	UserServiceImpl userServiceImpl;

	/**
	 * 判断用户是否存在,如果存在进入首页.
	 *
	 * @param httpServletRequest 页面传参.
	 * @return ModelAndView 返回此参数RestController不会
	 * 影响返回页面，但是返回类型如果是其他类型则会以JSON格式返回.
	 */
	@RequestMapping("/unregistered/searchUser")
	public ModelAndView userLogin(HttpServletRequest httpServletRequest) {
		HttpSession session = httpServletRequest.getSession();
		User userEntity = (User) session.getAttribute("user");
		ModelAndView modelAndView = new ModelAndView();
		if (userEntity == null) {
			modelAndView.setViewName("login");
			return modelAndView;
		}
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping("/createUser")
	public String createUser(HttpServletRequest httpServletRequest) {
		Map<String, String[]> parameterMap = httpServletRequest.getParameterMap();
//		userService.insetUser();
		return "";
	}
}
