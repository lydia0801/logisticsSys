package com.icss.po;

import java.sql.ResultSet;

import com.icss.commons.RowMapper;

public class RoadLinePricePO implements RowMapper<RoadLinePricePO>{

	private int priceId;
	private float priceFristK;   //首公斤价格
	private float priceOtherK;    //次公斤价格
	private float priceFristV;    //首立方价格
	private float priceOtherV;    //次立方价格
	public int getPriceId() {
		return priceId;
	}
	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}
	public float getPriceFristK() {
		return priceFristK;
	}
	public void setPriceFristK(float priceFristK) {
		this.priceFristK = priceFristK;
	}
	public float getPriceOtherK() {
		return priceOtherK;
	}
	public void setPriceOtherK(float priceOtherK) {
		this.priceOtherK = priceOtherK;
	}
	public float getPriceFristV() {
		return priceFristV;
	}
	public void setPriceFristV(float priceFristV) {
		this.priceFristV = priceFristV;
	}
	public float getPriceOtherV() {
		return priceOtherV;
	}
	public void setPriceOtherV(float priceOtherV) {
		this.priceOtherV = priceOtherV;
	}
	@Override
	public RoadLinePricePO mapRow(ResultSet rs, int index) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
