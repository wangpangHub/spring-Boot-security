package com.springboot.wangpan.entity;

import java.io.Serializable;

/**
 * @author homolo
 * @version 1.0
 * @date 20-8-25 上午9:58
 */
public class User_Role implements Serializable {
	public User_Role() {

	}

	//id
	private Integer id;
	//所属用户id
	private Integer user_id;
	//所属角色id
	private Integer role_id;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

}
