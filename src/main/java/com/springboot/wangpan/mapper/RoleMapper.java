package com.springboot.wangpan.mapper;

import com.springboot.wangpan.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RoleMapper {
	int insetSole(Role role);

	Role getRole(String id);

}
