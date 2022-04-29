package kr.co.imh.utils;

import org.springframework.stereotype.Service;

import kr.co.imh.domain.Order;

@Service
public class StateMessage {
	
	private Order order;

	public Order message(Order order) {
		if ("1".equals(order.getOrderState())) {
			order.setOrderState("결제대기");
		}
		if ("2".equals(order.getOrderState())) {
			order.setOrderState("결제완료");
		}
		if ("3".equals(order.getOrderState())) {
			order.setOrderState("상품준비중");
		}
		if ("4".equals(order.getOrderState())) {
			order.setOrderState("발송완료");
		}
		if ("5".equals(order.getOrderState())) {
			order.setOrderState("취소접수중");
		}
		if ("6".equals(order.getOrderState())) {
			order.setOrderState("환불완료");
		}
		if ("7".equals(order.getOrderState())) {
			order.setOrderState("환불철회");
		}
		
		// paySort
		if ("1".equals(order.getPaySort())) {
			order.setOrderState("결제대기");
		}
		if ("2".equals(order.getPaySort())) {
			order.setOrderState("결제완료");
		}
		if ("3".equals(order.getPaySort())) {
			order.setOrderState("결제취소환불");
		}
		
		// addressSort
		if ("1".equals(order.getAddressSort())) {
			order.setOrderState("회원");
		}
		if ("2".equals(order.getAddressSort())) {
			order.setOrderState("관리자");
		}
		
		// cancelContent
		if ("1".equals(order.getCancelContent())) {
			order.setOrderState("단순변심");
		}
		if ("2".equals(order.getCancelContent())) {
			order.setOrderState("상품품절");
		}
		if ("3".equals(order.getCancelContent())) {
			order.setOrderState("파손불량");
		}
		// refundState
		if ("1".equals(order.getRefundState())) {
			order.setOrderState("대기중");
		}
		if ("2".equals(order.getRefundState())) {
			order.setOrderState("환불승인");
		}
		if ("3".equals(order.getRefundState())) {
			order.setOrderState("취소철회");
		}
		
		return order;
		
	}
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}

}
