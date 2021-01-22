package com.springboot.wangpan.custom;

import com.springboot.wangpan.entity.Role;
import com.springboot.wangpan.entity.User;
import com.springboot.wangpan.service.UserServiceImpl;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.util.DigestUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * 重写spring security  UserDetailsService
 *
 * @author pan wang
 * @version 1.0
 * @date 21-1-19 下午2:47
 */
public class CustomUserService implements UserDetailsService {

	@Autowired
	UserServiceImpl userService;

	@Bean
	CustomPassWordEncoder getPassWordEncoder() {
		return new CustomPassWordEncoder();
	}


	@Override
	public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {
		User user = userService.getLoginIdSearchUser(loginId);
		if (user == null) {
			throw new UsernameNotFoundException("用户名不存在");
		}
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		for (Role role : user.getUserRoleList()) {
			authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
		}
		//这个地方可以在user 中加上是否锁定,是否过期,是否禁用这个三个属性用来动态控制,user中有构造方法
		return new org.springframework.security.core.userdetails.User(user.getLoginName(), DigestUtils.md5DigestAsHex(user.getPassWord().getBytes()), authorities);
	}
}
