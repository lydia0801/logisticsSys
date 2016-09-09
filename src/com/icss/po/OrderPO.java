package com.icss.po;

import java.sql.ResultSet;
import java.util.Date;


import com.icss.commons.RowMapper;

public class OrderPO  implements RowMapper<OrderPO>{

	private String orderId;   //订单编号
	private String cusId;     //客户编号
	private String carId;     //车辆编号
	private String orderName; // 订单名称
	private Date  orderDate ; //下单时间
	private String ordergoods;  //邮寄物品
	private int orderWeight;   //重量
	private int orderV;        //重量
	private String orderPerson; //下单人
	private String sendPerson;  //寄件人
	private String sendAddress;  //寄件地址
	private String sendPhone;    //寄件人手机号码
	private String recivePerson;  //收件人
	private String reciveAddress;  //收件人地址
	private String recivePhone;  //收件人联系方式
	private String orderState;   //订单状态
	private String delivePerson;  //配送人
	private float  orderFee;  //订单费用
	private String orderRemark; //备注信息
	private String orderWay;  //支付方式
	private Date orderEndTime;  //订单完成日期
 
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrdergoods() {
		return ordergoods;
	}

	public void setOrdergoods(String ordergoods) {
		this.ordergoods = ordergoods;
	}

	public int getOrderWeight() {
		return orderWeight;
	}

	public void setOrderWeight(int orderWeight) {
		this.orderWeight = orderWeight;
	}

	public int getOrderV() {
		return orderV;
	}

	public void setOrderV(int orderV) {
		this.orderV = orderV;
	}

	public String getOrderPerson() {
		return orderPerson;
	}

	public void setOrderPerson(String orderPerson) {
		this.orderPerson = orderPerson;
	}

	public String getSendPerson() {
		return sendPerson;
	}

	public void setSendPerson(String sendPerson) {
		this.sendPerson = sendPerson;
	}

	public String getSendAddress() {
		return sendAddress;
	}

	public void setSendAddress(String sendAddress) {
		this.sendAddress = sendAddress;
	}

	public String getSendPhone() {
		return sendPhone;
	}

	public void setSendPhone(String sendPhone) {
		this.sendPhone = sendPhone;
	}

	public String getRecivePerson() {
		return recivePerson;
	}

	public void setRecivePerson(String recivePerson) {
		this.recivePerson = recivePerson;
	}

	public String getReciveAddress() {
		return reciveAddress;
	}

	public void setReciveAddress(String reciveAddress) {
		this.reciveAddress = reciveAddress;
	}

	public String getRecivePhone() {
		return recivePhone;
	}

	public void setRecivePhone(String recivePhone) {
		this.recivePhone = recivePhone;
	}

	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public String getDelivePerson() {
		return delivePerson;
	}

	public void setDelivePerson(String delivePerson) {
		this.delivePerson = delivePerson;
	}

	public float getOrderFee() {
		return orderFee;
	}

	public void setOrderFee(float orderFee) {
		this.orderFee = orderFee;
	}

	public String getOrderRemark() {
		return orderRemark;
	}

	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}

	public String getOrderWay() {
		return orderWay;
	}

	public void setOrderWay(String orderWay) {
		this.orderWay = orderWay;
	}

	public Date getOrderEndTime() {
		return orderEndTime;
	}

	public void setOrderEndTime(Date orderEndTime) {
		this.orderEndTime = orderEndTime;
	}

	@Override
	public OrderPO mapRow(ResultSet rs, int index) throws Exception {
		OrderPO po=new OrderPO();
		po.setCarId(rs.getString("car_id"));
		po.setCusId(rs.getString("cus_id"));
		po.setDelivePerson(rs.getString("delive_person"));
		po.setOrderDate(rs.getDate("order_date"));
		po.setOrderEndTime(rs.getDate("order_end_time"));
		po.setOrderFee(rs.getFloat("order_fee"));
		po.setOrdergoods(rs.getString("order_goods"));
		po.setOrderId(rs.getString("order_id"));
		po.setOrderName(rs.getString("order_name"));
		po.setOrderPerson(rs.getString("order_person"));
		po.setOrderRemark(rs.getString("order_remark"));
		po.setOrderState(rs.getString("order_state"));
		po.setOrderV(rs.getInt("order_v"));
		po.setOrderWay(rs.getString("order_way"));
		po.setOrderWeight(rs.getInt("order_weight"));
		return po;
	}

}
