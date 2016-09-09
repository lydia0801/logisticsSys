package com.icss.service;

import java.util.List;

import sun.print.resources.serviceui;

import com.icss.dao.UserInfoDAO;
import com.icss.po.UserInfoPO;
import com.icss.vo.PageVO;

public class UserInfoService {

	private UserInfoDAO dao=new UserInfoDAO();
	
	public UserInfoPO login(UserInfoPO po) throws Exception{
		return dao.login(po);
	}
	
	public List<UserInfoPO> queryAllUser() throws Exception{
		return dao.findAll();
	}
	
	public List<UserInfoPO> queryUserByterm(UserInfoPO po) throws Exception{
		return dao.queryUserByTerm(po);
	}
	
	public PageVO<UserInfoPO> findAllByPage(int page,int rowMax) throws Exception{
		return dao.findAllByPage(page, rowMax);
	}
}
