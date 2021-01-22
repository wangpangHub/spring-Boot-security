package com.springboot.wangpan.entity;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
	private String userName;
	private String loginName;
	private String userId;
	private Integer id;
	private String createTime;
	private String passWord;
	private List<Role> roles;

	public User() {

	}

	public List<Role> getUserRoleList() {
		return roles;
	}

	public void setUserRoleList(List<Role> roles) {
		this.roles = roles;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserId() {
		return userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

}
