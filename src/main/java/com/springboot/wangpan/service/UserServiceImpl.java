package com.springboot.wangpan.service;

import com.springboot.wangpan.entity.User;
import com.springboot.wangpan.mapper.UserMapper;
import com.springboot.wangpan.utils.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public int insetUser(User user) {
		try {
			String createTime = user.getCreateTime();
			String userName = user.getUserName();
			String loginName = user.getLoginName();
			boolean isOk = DateUtils.timeStampIsDate(createTime);
			if (isOk && StringUtils.isEmpty(userName) && StringUtils.isEmpty(loginName)) {
				user.setUserId(UUID.randomUUID().toString());
				return userMapper.insetUser(user);
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return 0;
	}

	@Override
	public User getLoginIdSearchUser(String loginId) {
		User loginIdSearchUser = userMapper.getLoginIdSearchUser(loginId);
		if(loginIdSearchUser!=null){
			return loginIdSearchUser;
		}
		return null;
	}
}
