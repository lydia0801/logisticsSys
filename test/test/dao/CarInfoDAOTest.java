package test.dao;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.icss.dao.CarInfoDAO;
import com.icss.po.CarInfoPO;

public class CarInfoDAOTest {

	private CarInfoDAO dao=new CarInfoDAO();
	
	@Ignore
	@Test
	public void testAddCarInfoPO() throws Exception {
		CarInfoPO po=new CarInfoPO();
		po.setCarId("HN002");
		po.setCarName("莲花汽车2");
		po.setCarState("空闲");
		po.setCarType("大卡车");
		po.setCarUnit("省公司");
		po.setCarV(20);
		po.setCarWeight(20);
		dao.add(po);
	}

	@Test
	public void testModifyCarInfoPO() throws Exception {
		CarInfoPO po=new CarInfoPO();
		po.setCarId("HN002");
		po.setCarName("莲花汽车2");
		po.setCarState("运输中");
		po.setCarType("大卡车");
		po.setCarUnit("省公司");
		po.setCarV(20);
		po.setCarWeight(20);
		dao.modify(po);
	}

	@Test
	public void testDeleteCarInfoPO() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testFindAll() throws Exception {
		System.out.println(dao.findAll().size());
	}

	@Ignore
	@Test
	public void testFindByIdCarInfoPO() throws Exception {
		CarInfoPO po=new CarInfoPO();
		po.setCarId("HN001");
		System.out.println(dao.findById(po).getCarName());
	}

}
