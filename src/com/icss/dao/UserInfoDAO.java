package com.icss.dao;

import java.util.List;

import com.icss.po.UserInfoPO;
import com.icss.vo.PageVO;

public class UserInfoDAO extends DAOSupport<UserInfoPO> {

	@Override
	public void add(UserInfoPO vo) throws Exception {
		String sql="insert into userinfo values(null,?,?,?,?,?,?)";
		db.execute(sql, vo.getRoleId(),vo.getUserName(),vo.getUserPwd(),vo.getUserState(),vo.getUserUnit());
	}

	@Override
	public void modify(UserInfoPO vo) throws Exception {
		String sql="update userinfo set user_pwd = ? ,user_state =? , role_id =?,user_unit =?  where user_id =?";
		db.execute(sql,vo.getUserPwd(),vo.getUserState(), vo.getRoleId(),vo.getUserUnit(),vo.getUserId());
		
	}

	@Override
	public void delete(UserInfoPO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserInfoPO> findAll() throws Exception {
		 
		return db.list("select * from userinfo", new UserInfoPO());
	}

	@Override
	public UserInfoPO findById(UserInfoPO vo) throws Exception {
		 String sql="select u.* ,r.role_name from userinfo u ,roleinfo r  where u.role_id = r.role_id and user_id =?";
		return db.get(sql, new UserInfoPO(), vo.getUserId());
	
	}
	
	public UserInfoPO login(UserInfoPO po) throws Exception{
		return db.get("select * from userinfo where user_name = ? and user_pwd = ?",new UserInfoPO(), po.getUserName(),po.getUserPwd());
	}
	
	public List<UserInfoPO> queryUserByTerm(UserInfoPO po) throws Exception{
		 
		return db.list("select * from userinfo where role_id=?", new UserInfoPO(), po.getRoleId());
	}
	
	public PageVO<UserInfoPO> findAllByPage(int page,int rowMax) throws Exception{
		return page("select * from userinfo", page, rowMax, new UserInfoPO());
	}
	

}
