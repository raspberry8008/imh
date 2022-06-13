package com.imh.admin.vo.order;

public class OrderDeliveryVO {
	
	//Order 배송정보
	private String deliveryId; // 배송 접수번호
	private String deliveryOrder; // 통합 주문번호
	private String deliveryState; // 배송상태 - DE001. 발송준비중 DE002. 발송완료 DE003.발송취소
	private String deliver; // 배송업체
	private String deliveryNum; // 운송장번호
	private String deliveryRegdate; // 최초 발송일
	private String deliveryUpdate; // 최종 발송일
	
	public String getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDeliveryOrder() {
		return deliveryOrder;
	}
	public void setDeliveryOrder(String deliveryOrder) {
		this.deliveryOrder = deliveryOrder;
	}
	public String getDeliveryState() {
		return deliveryState;
	}
	public void setDeliveryState(String deliveryState) {
		this.deliveryState = deliveryState;
	}
	public String getDeliver() {
		return deliver;
	}
	public void setDeliver(String deliver) {
		this.deliver = deliver;
	}
	public String getDeliveryNum() {
		return deliveryNum;
	}
	public void setDeliveryNum(String deliveryNum) {
		this.deliveryNum = deliveryNum;
	}
	public String getDeliveryRegdate() {
		return deliveryRegdate;
	}
	public void setDeliveryRegdate(String deliveryRegdate) {
		this.deliveryRegdate = deliveryRegdate;
	}
	public String getDeliveryUpdate() {
		return deliveryUpdate;
	}
	public void setDeliveryUpdate(String deliveryUpdate) {
		this.deliveryUpdate = deliveryUpdate;
	}
	
	@Override
	public String toString() {
		return "OrderDelivery [deliveryId=" + deliveryId + ", deliveryOrder=" + deliveryOrder + ", deliveryState="
				+ deliveryState + ", deliver=" + deliver + ", deliveryNum=" + deliveryNum + ", deliveryRegdate="
				+ deliveryRegdate + ", deliveryUpdate=" + deliveryUpdate + "]";
	}
	
}
