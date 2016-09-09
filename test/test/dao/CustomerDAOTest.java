package test.dao;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.icss.dao.CustomerDAO;
import com.icss.po.CarInfoPO;
import com.icss.po.CustomerPO;

public class CustomerDAOTest {

	private CustomerDAO dao=new CustomerDAO();
	@Ignore
	@Test
	public void testAddCustomerPO() throws Exception {
		CustomerPO po=new CustomerPO();
		po.setCusAddress("湖南");
		po.setCusName("lydia");
		po.setLoginName("lydia");
		po.setCusPhone("15096098010");
		po.setLoginPwd("123456");
		dao.add(po);
	}

	@Ignore
	@Test
	public void testModifyCustomerPO() throws Exception {
		CustomerPO po=new CustomerPO();
		po.setCusId(1);
		po.setCusAddress("湖南1");
		po.setCusName("张三1");
		po.setLoginName("zhangsan");
		po.setCusPhone("15096098011");
		po.setLoginPwd("111111");
		dao.modify(po);
	}

	
	@Test
	public void testDeleteCustomerPO() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testFindAll() throws Exception {
		System.out.println(dao.findAll().size());
	}

	@Ignore
	@Test
	public void testFindByIdCustomerPO() throws Exception {
		 CustomerPO po= new CustomerPO();
		 po.setCusId(1);
		 System.out.println(dao.findById(po).getCusName());
	}

}
