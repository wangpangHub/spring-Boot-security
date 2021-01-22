package com.springboot.wangpan.service;

import com.springboot.wangpan.entity.Role;
import com.springboot.wangpan.entity.User;
import com.springboot.wangpan.mapper.RoleMapper;
import com.springboot.wangpan.mapper.UserMapper;
import com.springboot.wangpan.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.util.UUID;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleMapper roleMapper;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());


	@Override
	public int insetSole(Role role) {
		return 0;
	}

	@Override
	public Role getRole(String id) {
		try {
			if (!StringUtils.isEmpty(id)) {
				this.roleMapper.getRole(id);
			}
		} catch (RuntimeException e) {
			logger.error(e.getMessage());
		}
		return null;
	}
}
