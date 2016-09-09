package com.icss.action;

import com.icss.po.UserInfoPO;
import com.icss.service.UserInfoService;
import com.opensymphony.xwork2.ModelDriven;

public class DemoAction implements ModelDriven<UserInfoPO>{

	private UserInfoPO po=new UserInfoPO();
	private String msg;
	private UserInfoService service=new UserInfoService();
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String execute(){
		System.out.println(po.getUserName()+"密码："+po.getUserPwd());
		try {
			service.login(po);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			msg=e.getMessage();
		}
		return "json";
	}

	@Override
	public UserInfoPO getModel() {
		// TODO Auto-generated method stub
		return po;
	}
}
