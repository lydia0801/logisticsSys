package com.icss.service;

import java.util.List;

import com.icss.dao.RoleDAO;
import com.icss.po.RolePO;

public class RoleService {

	private RoleDAO dao=new RoleDAO();
	public List<RolePO> findAll() throws Exception{
		return dao.findAll();
	}
}
