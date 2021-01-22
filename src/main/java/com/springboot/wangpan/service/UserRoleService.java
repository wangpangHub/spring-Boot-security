package com.springboot.wangpan.service;

import com.springboot.wangpan.entity.User_Role;

import java.util.List;

public interface UserRoleService {
	List<User_Role> getUserRoles(int userId);
}
