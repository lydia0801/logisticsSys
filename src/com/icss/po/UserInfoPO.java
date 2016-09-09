package com.icss.po;

import java.sql.ResultSet;

import com.icss.commons.RowMapper;

public class UserInfoPO implements RowMapper<UserInfoPO>{

	private int userId;     //用户编号
	private String userName; //用户名
	private String userPwd;  //密码
	private int  roleId;     //角色Id
	private String userState;//用户状态
	private String userUnit; //所属单位
	private String userRealName; //真实姓名
	public String getUserRealName() {
		return userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public String getUserUnit() {
		return userUnit;
	}
	public void setUserUnit(String userUnit) {
		this.userUnit = userUnit;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	@Override
	public UserInfoPO mapRow(ResultSet rs, int index) throws Exception {
		UserInfoPO po=new UserInfoPO();
		po.setUserId(rs.getInt("user_id"));
		po.setRoleId(rs.getInt("role_id"));
		po.setUserName(rs.getString("user_name"));
		po.setUserPwd(rs.getString("user_pwd"));
		po.setUserState(rs.getString("user_state"));
		po.setUserUnit(rs.getString("user_unit"));
		po.setUserRealName(rs.getString("user_real_name"));
		return po;
	}
	 
	
}
