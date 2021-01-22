package com.springboot.wangpan.mapper;

import com.springboot.wangpan.entity.User_Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserRoleMapper {

	List<User_Role> getUserRoles(Integer userId);
}
