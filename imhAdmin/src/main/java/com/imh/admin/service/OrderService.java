package com.imh.admin.service;

import java.util.List;
import java.util.Map;

import com.imh.admin.utils.Criteria;
import com.imh.admin.vo.order.OrderAddressVO;
import com.imh.admin.vo.order.OrderCancelVO;
import com.imh.admin.vo.order.OrderDeliveryVO;
import com.imh.admin.vo.order.OrderInfoVO;
import com.imh.admin.vo.order.OrderItemVO;
import com.imh.admin.vo.order.OrderVO;
import com.imh.admin.vo.pay.PayRefundVO;


public interface OrderService {
	
	/**
	 * order AllList 조회
	 * @param cri - 조회할 정보가 담긴 cri
	 * @return List<OrderInfoVO>
	 * @exception Exception
	 */
	public List<OrderInfoVO> orderList(Criteria cri);
	
	/**
	 * order readyList 조회
	 * @param cri - 조회할 정보가 담긴 cri
	 * @return List<OrderInfoVO>
	 * @exception Exception
	 */
	public List<OrderInfoVO> readyList(Criteria cri);
	
	
	/**
	 * order deliveryList 조회
	 * @param cri - 조회할 정보가 담긴 cri
	 * @return List<OrderDeliveryVO>
	 * @exception Exception
	 */
	public List<OrderDeliveryVO> deliveryList(Criteria cri);
	
	/**
	 * order calselList 조회
	 * @param cri - 조회할 정보가 담긴 cri
	 * @return List<OrderCancelVO>
	 * @exception Exception
	 */
	public List<OrderCancelVO> canselList(Criteria cri);
	
	/**
	 * order refundList 조회
	 * @param cri - 조회할 정보가 담긴 cri
	 * @return List<OrderInfoVO>
	 * @exception Exception
	 */
	public List<OrderInfoVO> refundList(Criteria cri);
	
	/**
	 * list count
	 * 
	 * @param list
	 * @return totalList Count
	 * @exception Exception
	 */
	public int listCount(Criteria cri);
	
	/**
	 * order 상세조회
	 * 
	 * @param orderCode 주문번호
	 * @return OrderVO
	 * @exception Exception
	 */
	public OrderVO getOrder(String orderCode);
	
	
	/**
	 * order item 상세조회
	 * 
	 * @param itemId 상품주문번호
	 * @return "order/itemDetail"
	 * @exception Exception
	 */
	public OrderItemVO getItem(String itemId);

//	/**
//	 * delivery 등록 
//	 * @param delivery - 배송 등록정보
//	 * @return 배송등록 결과 - String result value 실패 : 0 , 성공 : "order/deliveryList"
//	 * @throws Exception
//	 */
//	public String regDelivery(OrderDeliveryVO delivery);
//
//	// 취소환불접수
//	public String regCancel(OrderCancelVO cancel);
//	
//	// 발송 전 배송지 정보수정
//	public String modifyAddress(OrderAddressVO address);
//	
//	// 배송정보 수정
//	public String modifyDelivery(OrderDeliveryVO delivery);
//		
//	// 수동 환불처리
//	public String modifyRefund(PayRefundVO refund);
//	
//	// 주문확인 처리
//	public String orderReady(Map<String, Object> map);
	
	
}
