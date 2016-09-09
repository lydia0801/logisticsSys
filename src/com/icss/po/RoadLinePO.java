package com.icss.po;

import java.sql.ResultSet;

import com.icss.commons.RowMapper;

public class RoadLinePO implements RowMapper<RoadLinePO>{

	private int roadId;   // 线路编号
	private int priceId;  //价格编号
	private String roadName; //线路名称
	private String roadStart;  //起点
	private String roadEnd;    //终点
	public int getRoadId() {
		return roadId;
	}
	public void setRoadId(int roadId) {
		this.roadId = roadId;
	}
	public int getPriceId() {
		return priceId;
	}
	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	public String getRoadStart() {
		return roadStart;
	}
	public void setRoadStart(String roadStart) {
		this.roadStart = roadStart;
	}
	public String getRoadEnd() {
		return roadEnd;
	}
	public void setRoadEnd(String roadEnd) {
		this.roadEnd = roadEnd;
	}
	@Override
	public RoadLinePO mapRow(ResultSet rs, int index) throws Exception {
		RoadLinePO po=new RoadLinePO();
		po.setPriceId(rs.getInt("price_id"));
		po.setRoadEnd(rs.getString("road_end"));
		po.setRoadId(rs.getInt("road_id"));
		po.setRoadName(rs.getString("road_name"));
		po.setRoadStart(rs.getString("road_start"));
		return po;
	}
	
}
