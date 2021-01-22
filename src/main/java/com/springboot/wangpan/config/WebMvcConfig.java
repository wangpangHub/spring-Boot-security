package com.springboot.wangpan.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 实现 WebMvcConfigurer 重写addViewControllers()
 * 可以实现Spring boot默认跳入index.html页面,
 * 指定默认跳入的页面路径 .
 *
 * @author pan wang .
 * @version 1.0
 * @date 20-8-25 上午10:02
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


	/**
	 * Configure simple automated controllers pre-configured with the response
	 * status code and/or a view to render the response body. This is useful in
	 * cases where there is no need for custom controller logic -- e.g. render a
	 * home page, perform simple site URL redirects, return a 404 status with
	 * HTML content, a 204 with no content, and more.
	 *
	 * @param registry 视图预配置 .
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/","/login.html");
	}
}
