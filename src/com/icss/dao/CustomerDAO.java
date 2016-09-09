package com.icss.dao;

import java.util.List;

import com.icss.po.CustomerPO;

public class CustomerDAO extends DAOSupport<CustomerPO>{

	@Override
	public void add(CustomerPO vo) throws Exception {
		 String sql="insert into customerinfo values(null,?,?,?,?,?)";
		db.execute(sql, vo.getCusName(),vo.getLoginName(),vo.getLoginPwd(),vo.getCusAddress(),vo.getCusPhone());
	}

	@Override
	public void modify(CustomerPO vo) throws Exception {
		String sql="update customerinfo set cus_name=?,login_pwd=?,cus_address=?,cus_phone=? where cus_id=?";
		db.execute(sql, vo.getCusName(),vo.getLoginPwd(),vo.getCusAddress(),vo.getCusPhone(),vo.getCusId());
	}

	@Override
	public void delete(CustomerPO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CustomerPO> findAll() throws Exception {
		return db.list("select * from customerinfo", new CustomerPO());
	}

	@Override
	public CustomerPO findById(CustomerPO vo) throws Exception {
		 
		return db.get("select * from customerinfo where cus_id =?", new CustomerPO(),vo.getCusId());
	}

}
