package com.springboot.wangpan.mapper;

import com.springboot.wangpan.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
	int insetUser(User user);

	User getLoginIdSearchUser(String loginId);

}
