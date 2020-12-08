package com.springboot.wangpan.entity;

/**
 * @author homolo
 * @version 1.0
 * @date 20-8-25 上午9:53
 */
public class Role {
	//角色id
	private Integer id;
	//角色名称
	private String roleName;
	//角色备注
	private String roleRemark;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleRemark() {
		return roleRemark;
	}

	public void setRoleRemark(String roleRemark) {
		this.roleRemark = roleRemark;
	}

}
