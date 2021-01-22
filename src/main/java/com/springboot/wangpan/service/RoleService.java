package com.springboot.wangpan.service;

import com.springboot.wangpan.entity.Role;

public interface RoleService {
	int insetSole(Role role);

	Role getRole(String id);
}
