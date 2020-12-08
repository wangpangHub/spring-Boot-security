package com.springboot.wangpan.service;

import com.springboot.wangpan.entity.User;

public interface UserService {
	int insetUser(User user);

	User getLoginIdSearchUser(String loginId);
}
