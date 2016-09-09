package test.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.icss.dao.UserInfoDAO;
import com.icss.po.UserInfoPO;

public class UserInfoDAOTest {

	private UserInfoDAO dao;
	
	@Before
	public void testBefore(){
		dao=new UserInfoDAO();
	}
	
	@Ignore
	@Test
	public void testAddUserInfoPO() throws Exception {
		UserInfoPO po=new UserInfoPO();
		po.setRoleId(2);
		po.setUserName("测试用户");
		po.setUserPwd("123456");
		po.setUserState("在职");
		po.setUserUnit("");
		po.setUserRealName("测试");
		dao.add(po);
		
	}

	@Ignore
	@Test
	public void testModifyUserInfoPO() throws Exception {
		UserInfoPO po=new UserInfoPO();
		po.setUserId(1005);
		po.setRoleId(2);
		po.setUserName("测试用户");
		po.setUserPwd("123456");
		po.setUserState("在职");
		po.setUserUnit("省公司");
		dao.modify(po);
	}

	@Test
	public void testDeleteUserInfoPO() {
		 
	}

	@Ignore
	@Test
	public void testFindAll() throws Exception {
		System.out.println(dao.findAll().size());
	}

	@Ignore
	@Test
	public void testFindByIdUserInfoPO() throws Exception {
		UserInfoPO vo=new UserInfoPO();
		vo.setUserId(1001);
		System.out.println(dao.findById(vo).getUserName());
	}

}
