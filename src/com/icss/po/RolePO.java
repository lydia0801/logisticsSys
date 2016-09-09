package com.icss.po;

import java.sql.ResultSet;

import javax.management.relation.Role;

import com.icss.commons.RowMapper;

public class RolePO implements RowMapper<RolePO>{

	private int roleId;
	private String roleName;
	
	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public RolePO mapRow(ResultSet rs, int index) throws Exception {
		RolePO po=new RolePO();
		po.setRoleId(rs.getInt("role_id"));
		po.setRoleName(rs.getString("role_name"));
		return po;
	}

}
