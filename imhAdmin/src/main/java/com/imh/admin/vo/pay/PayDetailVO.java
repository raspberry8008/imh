package com.imh.admin.vo.pay;

public class PayDetailVO {
	
	// 주문 결제정보
	private String payId; // 결제번호
	private String payOrder; // 통합 주문번호
	private String payKind; // 결제 수단
	private int payPoint; // 포인트 사용
	private int payDelivery; // 배송비
	private String payCoupon; // 쿠폰번호
	private int payDiscount; // 쿠폰할인금액
	private String payPrice; // 총 실결제금액
	private String payState; // 결제 상태 - 1.결제대기,2.결제완료,3.결제취소환불
	private String payRegdate; // 결제일
	
	public String getPayId() {
		return payId;
	}
	public void setPayId(String payId) {
		this.payId = payId;
	}
	public String getPayOrder() {
		return payOrder;
	}
	public void setPayOrder(String payOrder) {
		this.payOrder = payOrder;
	}
	public String getPayKind() {
		return payKind;
	}
	public void setPayKind(String payKind) {
		this.payKind = payKind;
	}
	public int getPayPoint() {
		return payPoint;
	}
	public void setPayPoint(int payPoint) {
		this.payPoint = payPoint;
	}
	public int getPayDelivery() {
		return payDelivery;
	}
	public void setPayDelivery(int payDelivery) {
		this.payDelivery = payDelivery;
	}
	public String getPayCoupon() {
		return payCoupon;
	}
	public void setPayCoupon(String payCoupon) {
		this.payCoupon = payCoupon;
	}
	public int getPayDiscount() {
		return payDiscount;
	}
	public void setPayDiscount(int payDiscount) {
		this.payDiscount = payDiscount;
	}
	public String getPayPrice() {
		return payPrice;
	}
	public void setPayPrice(String payPrice) {
		this.payPrice = payPrice;
	}
	public String getPayState() {
		return payState;
	}
	public void setPayState(String payState) {
		this.payState = payState;
	}
	public String getPayRegdate() {
		return payRegdate;
	}
	public void setPayRegdate(String payRegdate) {
		this.payRegdate = payRegdate;
	}
	
	@Override
	public String toString() {
		return "PayDetails [payId=" + payId + ", payOrder=" + payOrder + ", payKind=" + payKind + ", payPoint="
				+ payPoint + ", payDelivery=" + payDelivery + ", payCoupon=" + payCoupon + ", payDiscount="
				+ payDiscount + ", payPrice=" + payPrice + ", payState=" + payState + ", payRegdate=" + payRegdate
				+ "]";
	}

}
