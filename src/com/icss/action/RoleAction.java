package com.icss.action;

import java.io.IOException;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.JSONException;
import org.apache.struts2.json.JSONUtil;

import com.icss.service.RoleService;

public class RoleAction {

	private RoleService service=new RoleService();
	public String execute(){
		try {
			ServletActionContext.getResponse().getWriter().print(JSONUtil.serialize(service.findAll()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
