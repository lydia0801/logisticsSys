package com.icss.po;

import java.sql.ResultSet;

import com.icss.commons.RowMapper;

public class CustomerPO  implements RowMapper<CustomerPO>{

	private int cusId;   //编号
	private String cusName; //姓名
	private String loginName; //登录名
	private String loginPwd;  //登陆密码
	private String cusAddress; //地址
	private String cusPhone; //手机号码
	
	public int getCusId() {
		return cusId;
	}

	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getCusAddress() {
		return cusAddress;
	}

	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}

	public String getCusPhone() {
		return cusPhone;
	}

	public void setCusPhone(String cusPhone) {
		this.cusPhone = cusPhone;
	}

	@Override
	public CustomerPO mapRow(ResultSet rs, int index) throws Exception {
		CustomerPO customerPO=new CustomerPO();
		customerPO.setCusAddress(rs.getString("cus_address"));
		customerPO.setCusId(rs.getInt("cus_id"));
		customerPO.setCusName(rs.getString("cus_name"));
		customerPO.setLoginName(rs.getString("login_name"));
		customerPO.setLoginPwd(rs.getString("login_pwd"));
		customerPO.setCusPhone(rs.getString("cus_phone"));
		return customerPO;
	}
}
