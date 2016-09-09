package test.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.icss.dao.UserInfoDAO;
import com.icss.po.UserInfoPO;

public class UserInfoServiceTest {

	@Test
	public void testLogin() throws Exception {
		 UserInfoPO po=new UserInfoPO();
		 po.setUserName("lydia");
		 po.setUserPwd("123456");
		 UserInfoDAO dao=new UserInfoDAO();
		 System.out.println(dao.login(po).getUserName());
	}

}
