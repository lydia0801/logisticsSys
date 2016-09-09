package com.icss.dao;

import java.util.List;

import com.icss.po.RolePO;

public class RoleDAO extends DAOSupport<RolePO> {

	@Override
	public void add(RolePO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(RolePO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(RolePO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<RolePO> findAll() throws Exception {
		return db.list("select * from roleinfo", new RolePO());
	}

	@Override
	public RolePO findById(RolePO vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
