package com.imh.admin.vo.pay;

public class PayRefundVO {
	
	// 주문 취소환불	
	private String refundId; // 환불 접수번호
	private String refundCancal; // 취소 접수번호
	private String refundOrder; // 취소 주문번호
	private String refundPay; // 취소 결제번호
	private int refundPrice; // 취소환불 금액
	private String refundState; // 취소환불 구분 - 1.대기/2.승인/3.거부
	private String refundName; // 취소환불 처리자 - 1.시스템/2.관리자
	private String refundRegdate; // 취소환불 처리일자
	public String getRefundId() {
		return refundId;
	}
	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}
	public String getRefundCancal() {
		return refundCancal;
	}
	public void setRefundCancal(String refundCancal) {
		this.refundCancal = refundCancal;
	}
	public String getRefundOrder() {
		return refundOrder;
	}
	public void setRefundOrder(String refundOrder) {
		this.refundOrder = refundOrder;
	}
	public String getRefundPay() {
		return refundPay;
	}
	public void setRefundPay(String refundPay) {
		this.refundPay = refundPay;
	}
	public int getRefundPrice() {
		return refundPrice;
	}
	public void setRefundPrice(int refundPrice) {
		this.refundPrice = refundPrice;
	}
	public String getRefundState() {
		return refundState;
	}
	public void setRefundState(String refundState) {
		this.refundState = refundState;
	}
	public String getRefundName() {
		return refundName;
	}
	public void setRefundName(String refundName) {
		this.refundName = refundName;
	}
	public String getRefundRegdate() {
		return refundRegdate;
	}
	public void setRefundRegdate(String refundRegdate) {
		this.refundRegdate = refundRegdate;
	}
	
	@Override
	public String toString() {
		return "PayRefund [refundId=" + refundId + ", refundCancal=" + refundCancal + ", refundOrder=" + refundOrder
				+ ", refundPay=" + refundPay + ", refundPrice=" + refundPrice + ", refundState=" + refundState
				+ ", refundName=" + refundName + ", refundRegdate=" + refundRegdate + "]";
	}

}
