package com.springboot.wangpan.service;

import com.springboot.wangpan.entity.User_Role;
import com.springboot.wangpan.mapper.UserRoleMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {
	@Autowired
	UserRoleMapper userRoleMapper;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());


	@Override
	public List<User_Role> getUserRoles(int user_id) {
		return this.userRoleMapper.getUserRoles(user_id);
	}
}
