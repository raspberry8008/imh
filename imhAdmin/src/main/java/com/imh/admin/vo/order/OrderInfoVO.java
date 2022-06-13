package com.imh.admin.vo.order;

public class OrderInfoVO {

	// 주문 기본정보
	private String orderCode; // 주문번호
	private String orderItemId; // 상품 주문번호
	private String orderItemName; // 상품명
	private int orderItemPrice; // 상품 총 주문금액
	private String orderId; // 주문자 아이디.
	private String orderName; // 구매자명
	private String orderRegdate; // 주문일자
	private String orderPayRegdate; // 결제일자
	private String orderState; // CS 구분코드 - 1결제대기/2결제완료/3상품준비중/4발송완료/5취소접수중/6환불완료/7환불철회
	private String orderStateKor; // CS 코드 한글명
	private int orderTotalPrice; // 총 주문금액
	
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}
	public String getOrderItemName() {
		return orderItemName;
	}
	public void setOrderItemName(String orderItemName) {
		this.orderItemName = orderItemName;
	}
	public int getOrderItemPrice() {
		return orderItemPrice;
	}
	public void setOrderItemPrice(int orderItemPrice) {
		this.orderItemPrice = orderItemPrice;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderRegdate() {
		return orderRegdate;
	}
	public void setOrderRegdate(String orderRegdate) {
		this.orderRegdate = orderRegdate;
	}
	public String getOrderPayRegdate() {
		return orderPayRegdate;
	}
	public void setOrderPayRegdate(String orderPayRegdate) {
		this.orderPayRegdate = orderPayRegdate;
	}
	public String getOrderState() {
		return orderState;
	}
	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	public String getOrderStateKor() {
		return orderStateKor;
	}
	public void setOrderStateKor(String orderStateKor) {
		this.orderStateKor = orderStateKor;
	}
	public int getOrderTotalPrice() {
		return orderTotalPrice;
	}
	public void setOrderTotalPrice(int orderTotalPrice) {
		this.orderTotalPrice = orderTotalPrice;
	}
	
	@Override
	public String toString() {
		return "OrderInfoVO [orderCode=" + orderCode + ", orderItemId=" + orderItemId + ", orderItemName="
				+ orderItemName + ", orderItemPrice=" + orderItemPrice + ", orderId=" + orderId + ", orderName="
				+ orderName + ", orderRegdate=" + orderRegdate + ", orderPayRegdate=" + orderPayRegdate
				+ ", orderState=" + orderState + ", orderStateKor=" + orderStateKor + ", orderTotalPrice="
				+ orderTotalPrice + "]";
	}

}
