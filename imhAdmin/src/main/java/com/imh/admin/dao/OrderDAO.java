package com.imh.admin.dao;

import java.util.List;

import com.imh.admin.utils.Criteria;
import com.imh.admin.vo.order.OrderCancelVO;
import com.imh.admin.vo.order.OrderDeliveryVO;
import com.imh.admin.vo.order.OrderInfoVO;
import com.imh.admin.vo.order.OrderItemVO;
import com.imh.admin.vo.order.OrderVO;


public interface OrderDAO {
	
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
	
	
	/**
	 * order CS 상태조회
	 * 
	 * @param orderCode 주문번호
	 * @return "orderState"
	 * @exception Exception
	 */
	public String getCS(String orderCode);
	
//	// 결제조회
//	public PayDetailVO getPayDetail(String orderCode);
//	
//	// 배송접수
//	public int regDlivery(OrderDeliveryVO delivery);	
//	
//	// 취소접수
//	public int regCancel(OrderCancelVO cancel);	
//	
//	// 환불접수
//	public int regRefund(PayRefundVO refund);
//	
//	// info CS 상태변경 : 1결제대기/2결제완료/3상품준비중/4발송완료/5취소접수중/6환불완료/7환불철회
//	public int orderCheck(Map<String, Object> map);
//	
//	// pay 상태변경 - 1.결제대기,2.결제완료,3.결제환불
//	public int payCheck(Map<String, Object> map);
//	
//	// refunt 상태변경  - 1.대기/2.승인/3.거부
//	public int refundCheck(Map<String, Object> map);
//	
//	// 발송 전 주소지 정보수정
//	public int modifyAddress(OrderAddressVO address);
//	
//	// 발송정보 수정
//	public int modifyDelivery(OrderDeliveryVO delivery);


}
