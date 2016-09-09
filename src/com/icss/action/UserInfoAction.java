package com.icss.action;

import java.io.IOException;
import java.util.List;


import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.JSONException;
import org.apache.struts2.json.JSONUtil;

import com.icss.po.UserInfoPO;
import com.icss.service.UserInfoService;
import com.opensymphony.xwork2.ActionContext;

public class UserInfoAction {
	
	private String userName;
	private String userPwd;
	private int roleId;
	private int page;
	private int rows;
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	private String msg;
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	private UserInfoService service=new UserInfoService();
	
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

	public String execute(){
		System.out.println("execute");
		return null;
	}
	
	//用户登录
	public String  login(){
		UserInfoPO po=new UserInfoPO();
		po.setUserName(userName);
		po.setUserPwd(userPwd);
		try {
			UserInfoPO user=service.login(po);
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
		} catch (Exception e) {
			e.printStackTrace();
			msg="登陆失败";
		} 
		return "json";
	}
	
	//用户安全退出
	public String outLogin(){
		ServletActionContext.getRequest().getSession().removeAttribute("user");
		return null;
	}
	
	//查看所有用户
	public String  queryUserInfo(){
		try {
			List<UserInfoPO> list=service.queryAllUser();
			String str=JSONUtil.serialize(list);
			ServletActionContext.getResponse().getWriter().print(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	//根据条件查找
	public String queryUserByTerm(){
		
		
		try {
			if(roleId==0){
				ServletActionContext.getResponse().getWriter().print(JSONUtil.serialize(service.queryAllUser()));
			}else{
				UserInfoPO po=new UserInfoPO();
				po.setRoleId(roleId);
			ServletActionContext.getResponse().getWriter().print(JSONUtil.serialize(service.queryUserByterm(po)));
		}} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public String pageAll(){
		try {
			ServletActionContext.getResponse().getWriter().print(JSONUtil.serialize(service.findAllByPage(page, rows)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
}
