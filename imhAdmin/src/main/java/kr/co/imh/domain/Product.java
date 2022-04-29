package kr.co.imh.domain;

public class Product {
	
	//상품 정보
	private String productCode; // 상품 코드
	private String pCateCode; // 상품 카테고리
	private String productName; // 상품 이름
	private int productPrice; // 상품 판매가
	private int productPeriod; // 판매 여부 -1. 판매/ 2.중단 
	private String productDis; // 할인코드
	private String productMaker; // 상품 제조사
	private String productImage; // 상품 이미지
	private int productAaut; // 상품 권한 -1.관리자 2.회원
	private String productRegdate; // 작성일
	private String productWriter; // 작성자
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getpCateCode() {
		return pCateCode;
	}
	public void setpCateCode(String pCateCode) {
		this.pCateCode = pCateCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductPeriod() {
		return productPeriod;
	}
	public void setProductPeriod(int productPeriod) {
		this.productPeriod = productPeriod;
	}
	public String getProductDis() {
		return productDis;
	}
	public void setProductDis(String productDis) {
		this.productDis = productDis;
	}
	public String getProductMaker() {
		return productMaker;
	}
	public void setProductMaker(String productMaker) {
		this.productMaker = productMaker;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public int getProductAaut() {
		return productAaut;
	}
	public void setProductAaut(int productAaut) {
		this.productAaut = productAaut;
	}
	public String getProductRegdate() {
		return productRegdate;
	}
	public void setProductRegdate(String productRegdate) {
		this.productRegdate = productRegdate;
	}
	public String getProductWriter() {
		return productWriter;
	}
	public void setProductWriter(String productWriter) {
		this.productWriter = productWriter;
	}
	
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", pCateCode=" + pCateCode + ", productName=" + productName
				+ ", productPrice=" + productPrice + ", productPeriod=" + productPeriod + ", productDis=" + productDis
				+ ", productMaker=" + productMaker + ", productImage=" + productImage + ", productAaut=" + productAaut
				+ ", productRegdate=" + productRegdate + ", productWriter=" + productWriter + "]";
	}

}