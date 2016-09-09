package com.icss.dao;

import java.util.List;

import com.icss.po.DelivePO;

public class DeliveDAO extends DAOSupport<DelivePO> {

	@Override
	public void add(DelivePO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(DelivePO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(DelivePO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DelivePO> findAll() throws Exception {
		 return db.list("select * from deliveinfo ", new DelivePO());
	}

	@Override
	public DelivePO findById(DelivePO vo) throws Exception {
		return db.get("select * from deliveinfo where del_id =? ", new DelivePO(),vo.getDelId());
	}

}
