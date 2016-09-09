package com.icss.dao;

import java.util.List;

import com.icss.po.CarInfoPO;

public class CarInfoDAO extends DAOSupport<CarInfoPO> {

	@Override
	public void add(CarInfoPO vo) throws Exception {
		String sql="insert into carinfo values(?,?,?,?,?,?,?)";
		db.execute(sql,vo.getCarId(), vo.getCarName(),vo.getCarType(),vo.getCarWeight(),vo.getCarV(),vo.getCarState(),vo.getCarUnit());
	}

	@Override
	public void modify(CarInfoPO vo) throws Exception {
		String sql="update carinfo set car_name=? ,car_weight=?,car_type=?,car_v=?,car_state =?,car_unit=? where car_id=?";
		db.execute(sql, vo.getCarName(),vo.getCarWeight(),vo.getCarType(),vo.getCarV(),vo.getCarState(),vo.getCarUnit(),vo.getCarId());
	}

	@Override
	public void delete(CarInfoPO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CarInfoPO> findAll() throws Exception {
		return db.list("select * from carinfo ", new CarInfoPO());
	}

	@Override
	public CarInfoPO findById(CarInfoPO vo) throws Exception {
		return db.get("select * from carinfo where car_id = ?", new CarInfoPO(),vo.getCarId());
	}

}
