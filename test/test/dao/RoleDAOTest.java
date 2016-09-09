package test.dao;

import org.junit.Test;

import com.icss.dao.RoleDAO;

public class RoleDAOTest {

	private RoleDAO dao=new RoleDAO();
	@Test
	public void testFindAll() throws Exception{
		System.out.println(dao.findAll().size());
	}
}
