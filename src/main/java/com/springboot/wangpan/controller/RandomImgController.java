package com.springboot.wangpan.controller;

import com.springboot.wangpan.utils.VerifyCodeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class RandomImgController {
	private static final Logger LOGGER = LoggerFactory.getLogger(RandomImgController.class);


	@RequestMapping("/unregistered/getRandoImg")
	public void getRandomImg(HttpServletResponse response, HttpServletRequest request) {
		try {
			response.setHeader("Pragma", "No-cache");
			response.setHeader("Cache-Control", "no-cache");
			response.setDateHeader("Expires", 0);
			response.setContentType("image/jpeg");
			String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
			request.getSession().setAttribute("_code", verifyCode.toLowerCase());
			//生成图片
			int width = 146, high = 33;
			VerifyCodeUtils.outputImage(width,high,response.getOutputStream(),verifyCode);
		} catch (Exception e) {
			LOGGER.error(RandomImgController.class.getName() + "------" + e.getMessage());
		}

	}
}
