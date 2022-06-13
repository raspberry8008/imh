package com.imh.admin.vo.order;

public class OrderItemVO {
	
	// 상품별 내역
	private String itemId; // 상품 주문번호
	private String itemOrder; // 통합 주문번호
	private String itemProduct; // 상품코드
	private String productName; // 상품명
	private int itemPrice; // 상품 판매가
	private int itemDiscount; // 상품 할인액
	private int itemCount; // 상품수량
	private int itemTotalPrice; // 상품 총 금액
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemOrder() {
		return itemOrder;
	}
	public void setItemOrder(String itemOrder) {
		this.itemOrder = itemOrder;
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
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getItemDiscount() {
		return itemDiscount;
	}
	public void setItemDiscount(int itemDiscount) {
		this.itemDiscount = itemDiscount;
	}
	public int getItemCount() {
		return itemCount;
	}
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	public int getItemTotalPrice() {
		return itemTotalPrice;
	}
	public void setItemTotalPrice(int itemTotalPrice) {
		this.itemTotalPrice = itemTotalPrice;
	}
	
	@Override
	public String toString() {
		return "OrderItem [itemId=" + itemId + ", itemOrder=" + itemOrder + ", itemProduct=" + itemProduct
				+ ", productName=" + productName + ", itemPrice=" + itemPrice + ", itemDiscount=" + itemDiscount
				+ ", itemCount=" + itemCount + ", itemTotalPrice=" + itemTotalPrice + "]";
	}


}
