package com.imh.admin.vo.order;

public class OrderCancelVO {
	
	// 주문 취소환불내역
	private String cancelId; // 취소 접수번호
	private String cancelOrder; // 취소 주문번호
	private String cancelItem; // 취소 상품번호
	private int cancelPrice; // 취소 신청 금액
	private String cancelContent; // 취소 사유 - CC001.단순변심/CC002.상품품절/CC003.파손불량
	private String cancelRegdate; // 취소 접수일
	private String refundState; // 취소환불 구분 - RE001.대기/RE002.승인/RE003.환불철회,거부
	private String refundName; // 취소환불 처리자 - AD001.시스템/AD002.관리자
	private String refundRegdate; // 취소환불 처리일자
	
	public String getCancelId() {
		return cancelId;
	}
	public void setCancelId(String cancelId) {
		this.cancelId = cancelId;
	}
	public String getCancelOrder() {
		return cancelOrder;
	}
	public void setCancelOrder(String cancelOrder) {
		this.cancelOrder = cancelOrder;
	}
	public String getCancelItem() {
		return cancelItem;
	}
	public void setCancelItem(String cancelItem) {
		this.cancelItem = cancelItem;
	}
	public int getCancelPrice() {
		return cancelPrice;
	}
	public void setCancelPrice(int cancelPrice) {
		this.cancelPrice = cancelPrice;
	}
	public String getCancelContent() {
		return cancelContent;
	}
	public void setCancelContent(String cancelContent) {
		this.cancelContent = cancelContent;
	}
	public String getCancelRegdate() {
		return cancelRegdate;
	}
	public void setCancelRegdate(String cancelRegdate) {
		this.cancelRegdate = cancelRegdate;
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
		return "OrderCancel [cancelId=" + cancelId + ", cancelOrder=" + cancelOrder + ", cancelItem=" + cancelItem
				+ ", cancelPrice=" + cancelPrice + ", cancelContent=" + cancelContent + ", cancelRegdate="
				+ cancelRegdate + ", refundState=" + refundState + ", refundName=" + refundName + ", refundRegdate="
				+ refundRegdate + "]";
	}
	
}
