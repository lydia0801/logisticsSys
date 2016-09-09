package com.icss.po;

import java.sql.ResultSet;

import com.icss.commons.RowMapper;

public class CarInfoPO implements RowMapper<CarInfoPO>{

	private String carId; //汽车编号
	private String carName;//汽车名称
	private String carType; //汽车类型
	private int carWeight; //最大载重
	private int carV;      //最大容积
	private String carState; //车辆状态
	private String carUnit;  //直属单位
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getCarWeight() {
		return carWeight;
	}
	public void setCarWeight(int carWeight) {
		this.carWeight = carWeight;
	}
	public int getCarV() {
		return carV;
	}
	public void setCarV(int carV) {
		this.carV = carV;
	}
	public String getCarState() {
		return carState;
	}
	public void setCarState(String carState) {
		this.carState = carState;
	}
	public String getCarUnit() {
		return carUnit;
	}
	public void setCarUnit(String carUnit) {
		this.carUnit = carUnit;
	}
	@Override
	public CarInfoPO mapRow(ResultSet rs, int index) throws Exception {
		CarInfoPO carPO=new CarInfoPO();
		carPO.setCarId(rs.getString("car_id"));
		carPO.setCarName(rs.getString("car_name"));
		carPO.setCarState(rs.getString("car_state"));
		carPO.setCarType(rs.getString("car_type"));
		carPO.setCarUnit(rs.getString("car_unit"));
		carPO.setCarV(rs.getInt("car_V"));
		carPO.setCarWeight(rs.getInt("car_weight"));
		return carPO;
	}
	
	
}
