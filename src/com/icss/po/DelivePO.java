package com.icss.po;

import java.sql.ResultSet;

import com.icss.commons.RowMapper;

/**
 * 配送点
 * @author lydia0801
 *
 */
public class DelivePO implements RowMapper<DelivePO>{

	private int delId; //编号
	private String delName; //配送点名称
	private String delAddress;//配送点地址
	private String delCode;   //配送点简码
	public int getDelId() {
		return delId;
	}
	public void setDelId(int delId) {
		this.delId = delId;
	}
	public String getDelName() {
		return delName;
	}
	public void setDelName(String delName) {
		this.delName = delName;
	}
	public String getDelAddress() {
		return delAddress;
	}
	public void setDelAddress(String delAddress) {
		this.delAddress = delAddress;
	}
	public String getDelCode() {
		return delCode;
	}
	public void setDelCode(String delCode) {
		this.delCode = delCode;
	}
	@Override
	public DelivePO mapRow(ResultSet rs, int index) throws Exception {
		DelivePO po=new DelivePO();
		po.setDelAddress(rs.getString("del_address"));
		po.setDelCode(rs.getString("del_code"));
		po.setDelId(rs.getInt("del_id"));
		po.setDelName(rs.getString("del_name"));
		return po;
	}
	
}
