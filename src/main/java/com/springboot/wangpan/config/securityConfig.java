package com.springboot.wangpan.config;

import com.springboot.wangpan.custom.CustomPassWordEncoder;
import com.springboot.wangpan.custom.CustomUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * spring security java 配置
 *
 * @author homolo
 * @version 1.0
 * @date 20-8-25 上午10:02
 */
@Configuration
@EnableWebSecurity
public class securityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	UserDetailsService userDetails() {
		return new CustomUserService();
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new CustomPassWordEncoder();
	}

	@Override
	public void configure(WebSecurity webSecurity) throws Exception {
		webSecurity.ignoring().antMatchers("/", "/css/**", "/img/**", "/js/**");
	}

	@Override
	public void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests()
				.antMatchers("/login.html").permitAll()//所有用户可以访问的路径/是进入的pageController 跳入login.html
				.antMatchers("/unregistered/**").permitAll()//所有unregistered开头的路径都可以访问
				.antMatchers("/userService/controller/**").permitAll()//同上
				.antMatchers("/user/**").hasAnyRole("USER")
				.anyRequest().authenticated().and()
				.formLogin().loginPage("/login.html")//设置登录页面的路径
				.loginProcessingUrl("/userService/controller/unregistered/searchUser")//登录处理的url
				.failureUrl("/login.html?error=true")//登录失败地址
				.defaultSuccessUrl("/user/index.html")//登录成功默认进入的地址
				.usernameParameter("loginId")
				.passwordParameter("passWord")
				.permitAll()
				.and().logout().permitAll();
		httpSecurity.csrf().disable();
	}


	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetails()).passwordEncoder(passwordEncoder());
	}


}
