package com.imh.admin.vo.order;

public class OrderAddressVO {
	
	//Order 배송지정보
	private String addressId; // 주소코드
	private String addressOrder; // 통합 주문번호
	private String addressName; // 수령인
	private String addressPhone; // 연락처
	private String addressPost; // 우편번호
	private String addressFirst; // 주소
	private String addressSecond; // 상세주소
	private String addressMemo; // 메모
	private String addressRegName; // 최종등록자
	private String addressRegdate; // 최초등록일
	private String addressUpdate; // 최종수정일
	
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getAddressOrder() {
		return addressOrder;
	}
	public void setAddressOrder(String addressOrder) {
		this.addressOrder = addressOrder;
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
	public String getAddressPost() {
		return addressPost;
	}
	public void setAddressPost(String addressPost) {
		this.addressPost = addressPost;
	}
	public String getAddressFirst() {
		return addressFirst;
	}
	public void setAddressFirst(String addressFirst) {
		this.addressFirst = addressFirst;
	}
	public String getAddressSecond() {
		return addressSecond;
	}
	public void setAddressSecond(String addressSecond) {
		this.addressSecond = addressSecond;
	}
	public String getAddressMemo() {
		return addressMemo;
	}
	public void setAddressMemo(String addressMemo) {
		this.addressMemo = addressMemo;
	}
	public String getAddressRegName() {
		return addressRegName;
	}
	public void setAddressRegName(String addressRegName) {
		this.addressRegName = addressRegName;
	}
	public String getAddressRegdate() {
		return addressRegdate;
	}
	public void setAddressRegdate(String addressRegdate) {
		this.addressRegdate = addressRegdate;
	}
	public String getAddressUpdate() {
		return addressUpdate;
	}
	public void setAddressUpdate(String addressUpdate) {
		this.addressUpdate = addressUpdate;
	}
	
	@Override
	public String toString() {
		return "OrderAddress [addressId=" + addressId + ", addressOrder=" + addressOrder + ", addressName="
				+ addressName + ", addressPhone=" + addressPhone + ", addressPost=" + addressPost + ", addressFirst="
				+ addressFirst + ", addressSecond=" + addressSecond + ", addressMemo=" + addressMemo
				+ ", addressRegName=" + addressRegName + ", addressRegdate=" + addressRegdate + ", addressUpdate="
				+ addressUpdate + "]";
	}

}
