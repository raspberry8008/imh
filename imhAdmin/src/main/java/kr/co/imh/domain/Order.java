package kr.co.imh.domain;

public class Order {

	    // 주문 기본정보
		private String orderCode; // 주문번호
		private String orderId; // 주문자 아이디.
		private String orderName; // 구매자명
		private String orderRegdate; // 주문일자
		private String orderRegtime; // 주문시간
		private String orderday;// 주문일+시간
		private String orderState; // CS 구분 - 1결제대기/2결제완료/3상품준비중/4발송완료/5취소접수중/6환불완료/7환불철회
		
		// 주문상세 : 주문 코드 내 상품정보
		private String itemProduct; // 상품코드
		private String productName; // 상품명
		private int itemCount; // 상품수량
		
		// 주문금액
		private String amountNo; // 주문금액코드
		private int amountProduct; // 상품금액
		private int amountDcharge; // 배송비
		private String amountCoupon; // 쿠폰할인
		private String amountTotal; // 주문금액
		
		//Order 배송지정보
		private String addressNo; // 주소코드
		private String addressName; // 수령인
		private String addressPhone; // 연락처
		private String addressShip; // 배송지
		private String addressMemo; // 메모
		private String addressSort; // 수정 구분 -1. 회원, 2. 관리자
		private String addressRegdate; // 수정일자
		private String addressRegtime; // 수정시간
		private String addressDate;// 수정일+시간
		
		// 주문 결제정보
		private String payNo; // 결제번호
		private String payKind; // 결제 수단
		private int payPoint; // 포인트 사용
		private String paySort; // 결제 구분 - 1.결제대기,2.결제완료,3.결제취소환불
		private String payPrice; // 총 실결제금액
		private String payRegdate; // 결제 일자
		private String payRegTime; // 결제 시간
		private String payDate;// 결제일+시간
		
		//Order 배송현황
		private String deliveryNo; // 배송코드
		private String deliveryState; // 배송상태 - 1. 발송완료 2.발송취소
		private String deliveryName; // 배송업체
		private String deliveryNum; // 운송장번호
		private String deliveryRegdate; // 발송일자
		private String deliveryRegtime; // 발송시간
		private String deliveryDate; // 발송일자 및 시간
		
		// 주문 취소신청 정보
		private String cancelNo; // 주문취소 코드
		private int cancelPrice; // 취소 신청 금액
		private String cancelContent; // 취소 사유 - 1.단순변심/2.상품품절/3.파손불량
		private String cancelRegdate; // 취소 요청일자
		private String cancelRegtime; // 취소 요청시간
		private String cancelDate; // 취소 요청일 및 시간
		
		// 주문 취소환불	
		private String refundNo; // 취소환불 코드
		private int refundPrice; // 취소환불 금액
		private String refundState; // 취소환불 구분 - 1.대기/2.승인/3.거부
		private String refundName; // 취소환불 처리자 - 1.시스템/2.관리자
		private String refundRegdate; // 취소환불 처리일자
		private String refundRegtime; // 취소환불 처리시간
		private String refundDate; // 취소환불 처리일 및 시간
		
		public String getOrderCode() {
			return orderCode;
		}
		public void setOrderCode(String orderCode) {
			this.orderCode = orderCode;
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
		public String getOrderRegtime() {
			return orderRegtime;
		}
		public void setOrderRegtime(String orderRegtime) {
			this.orderRegtime = orderRegtime;
		}
		public String getOrderday() {
			return orderday;
		}
		public void setOrderday(String orderday) {
			this.orderday = orderday;
		}
		public String getOrderState() {
			return orderState;
		}
		public void setOrderState(String orderState) {
				
			this.orderState = orderState;
		}
		public String getItemProduct() {
			return itemProduct;
		}
		public void setItemProduct(String itemProduct) {
			this.itemProduct = itemProduct;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public int getItemCount() {
			return itemCount;
		}
		public void setItemCount(int itemCount) {
			this.itemCount = itemCount;
		}
		public String getAmountNo() {
			return amountNo;
		}
		public void setAmountNo(String amountNo) {
			this.amountNo = amountNo;
		}
		public int getAmountProduct() {
			return amountProduct;
		}
		public void setAmountProduct(int amountProduct) {
			this.amountProduct = amountProduct;
		}
		public int getAmountDcharge() {
			return amountDcharge;
		}
		public void setAmountDcharge(int amountDcharge) {
			this.amountDcharge = amountDcharge;
		}
		public String getAmountCoupon() {
			return amountCoupon;
		}
		public void setAmountCoupon(String amountCoupon) {
			this.amountCoupon = amountCoupon;
		}
		public String getAmountTotal() {
			return amountTotal;
		}
		public void setAmountTotal(String amountTotal) {
			this.amountTotal = amountTotal;
		}
		public String getAddressNo() {
			return addressNo;
		}
		public void setAddressNo(String addressNo) {
			this.addressNo = addressNo;
		}
		public String getAddressName() {
			return addressName;
		}
		public void setAddressName(String addressName) {
			this.addressName = addressName;
		}
		public String getAddressPhone() {
			return addressPhone;
		}
		public void setAddressPhone(String addressPhone) {
			this.addressPhone = addressPhone;
		}
		public String getAddressShip() {
			return addressShip;
		}
		public void setAddressShip(String addressShip) {
			this.addressShip = addressShip;
		}
		public String getAddressMemo() {
			return addressMemo;
		}
		public void setAddressMemo(String addressMemo) {
			this.addressMemo = addressMemo;
		}
		public String getAddressSort() {
			return addressSort;
		}
		public void setAddressSort(String addressSort) {
			this.addressSort = addressSort;
		}
		public String getAddressRegdate() {
			return addressRegdate;
		}
		public void setAddressRegdate(String addressRegdate) {
			this.addressRegdate = addressRegdate;
		}
		public String getAddressRegtime() {
			return addressRegtime;
		}
		public void setAddressRegtime(String addressRegtime) {
			this.addressRegtime = addressRegtime;
		}
		public String getAddressDate() {
			return addressDate;
		}
		public void setAddressDate(String addressDate) {
			this.addressDate = addressDate;
		}
		public String getPayNo() {
			return payNo;
		}
		public void setPayNo(String payNo) {
			this.payNo = payNo;
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
		public String getPaySort() {
			return paySort;
		}
		public void setPaySort(String paySort) {
			this.paySort = paySort;
		}
		public String getPayPrice() {
			return payPrice;
		}
		public void setPayPrice(String payPrice) {
			this.payPrice = payPrice;
		}
		public String getPayRegdate() {
			return payRegdate;
		}
		public void setPayRegdate(String payRegdate) {
			this.payRegdate = payRegdate;
		}
		public String getPayRegTime() {
			return payRegTime;
		}
		public void setPayRegTime(String payRegTime) {
			this.payRegTime = payRegTime;
		}
		public String getPayDate() {
			return payDate;
		}
		public void setPayDate(String payDate) {
			this.payDate = payDate;
		}
		public String getDeliveryNo() {
			return deliveryNo;
		}
		public void setDeliveryNo(String deliveryNo) {
			this.deliveryNo = deliveryNo;
		}
		public String getDeliveryState() {
			return deliveryState;
		}
		public void setDeliveryState(String deliveryState) {
			this.deliveryState = deliveryState;
		}
		public String getDeliveryName() {
			return deliveryName;
		}
		public void setDeliveryName(String deliveryName) {
			this.deliveryName = deliveryName;
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
		public String getDeliveryRegtime() {
			return deliveryRegtime;
		}
		public void setDeliveryRegtime(String deliveryRegtime) {
			this.deliveryRegtime = deliveryRegtime;
		}
		public String getDeliveryDate() {
			return deliveryDate;
		}
		public void setDeliveryDate(String deliveryDate) {
			this.deliveryDate = deliveryDate;
		}
		public String getCancelNo() {
			return cancelNo;
		}
		public void setCancelNo(String cancelNo) {
			this.cancelNo = cancelNo;
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
		public String getCancelRegtime() {
			return cancelRegtime;
		}
		public void setCancelRegtime(String cancelRegtime) {
			this.cancelRegtime = cancelRegtime;
		}
		public String getCancelDate() {
			return cancelDate;
		}
		public void setCancelDate(String cancelDate) {
			this.cancelDate = cancelDate;
		}
		public String getRefundNo() {
			return refundNo;
		}
		public void setRefundNo(String refundNo) {
			this.refundNo = refundNo;
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
		public String getRefundRegtime() {
			return refundRegtime;
		}
		public void setRefundRegtime(String refundRegtime) {
			this.refundRegtime = refundRegtime;
		}
		public String getRefundDate() {
			return refundDate;
		}
		public void setRefundDate(String refundDate) {
			this.refundDate = refundDate;
		}
		
		@Override
		public String toString() {
			return "Order [orderCode=" + orderCode + ", orderId=" + orderId + ", orderName=" + orderName
					+ ", orderRegdate=" + orderRegdate + ", orderRegtime=" + orderRegtime + ", orderday=" + orderday
					+ ", orderState=" + orderState
					+ ", itemProduct=" + itemProduct + ", productName=" + productName
					+ ", itemCount=" + itemCount + ", amountNo=" + amountNo + ", amountProduct=" + amountProduct
					+ ", amountDcharge=" + amountDcharge + ", amountCoupon=" + amountCoupon + ", amountTotal="
					+ amountTotal + ", addressNo=" + addressNo + ", addressName=" + addressName + ", addressPhone="
					+ addressPhone + ", addressShip=" + addressShip + ", addressMemo=" + addressMemo + ", addressSort="
					+ addressSort + ", addressRegdate=" + addressRegdate + ", addressRegtime=" + addressRegtime
					+ ", addressDate=" + addressDate + ", payNo=" + payNo + ", payKind=" + payKind + ", payPoint="
					+ payPoint + ", paySort=" + paySort + ", payPrice=" + payPrice + ", payRegdate=" + payRegdate
					+ ", payRegTime=" + payRegTime + ", payDate=" + payDate + ", deliveryNo=" + deliveryNo
					+ ", deliveryState=" + deliveryState + ", deliveryName=" + deliveryName + ", deliveryNum="
					+ deliveryNum + ", deliveryRegdate=" + deliveryRegdate + ", deliveryRegtime=" + deliveryRegtime
					+ ", deliveryDate=" + deliveryDate + ", cancelNo=" + cancelNo + ", cancelPrice=" + cancelPrice
					+ ", cancelContent=" + cancelContent + ", cancelRegdate=" + cancelRegdate + ", cancelRegtime="
					+ cancelRegtime + ", cancelDate=" + cancelDate + ", refundNo=" + refundNo + ", refundPrice="
					+ refundPrice + ", refundState=" + refundState + ", refundName=" + refundName + ", refundRegdate="
					+ refundRegdate + ", refundRegtime=" + refundRegtime + ", refundDate=" + refundDate + "]";
		}

}
