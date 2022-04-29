package kr.co.imh.service;

import java.util.List;
import java.util.Map;

import kr.co.imh.domain.Order;
import kr.co.imh.utils.Criteria;

/**
 * @author : hyeseo
 * @Project : imhAdmin
 * @Date : 2022. 4. 19. 
 */


public interface OrderService {
	
	// 주문조회 전체목록
	public List<Order> orderListAll(Criteria cri);
	
	// 주문단일 조회
	public Order getOrder(Map<String, Object> map);
	
	// 발주/발송관리 전체목록
	public List<Order> readyListAll(Criteria cri);
	
	// 배송현황관리 배송현황 전체목록
	public List<Order> deliveryListAll(Criteria cri);
	
	// 취소관리 취소주문내역 전체목록
	public List<Order> canselListAll(Criteria cri);
	
	// 데이터 전체 갯수
	public int listCount(Criteria cri);
	
	// 주문수량 조회
	public Order getItemCount(Order order);

	// 배송접수
	public int regDlivery(Order order);

	// 취소환불접수
	public int regCancel(Order order);
	
	// 발송 전 배송지 정보수정
	public int modifyAddress(Order order);
	
	// 발송정보 수정
	public int modifyDlivery(Order order);
		
	// 수동 환불처리
	public int modifyRefund(Order order);
	
	// 주문확인 처리
	public int orderReady(Map<String, Object> map);
	
	
}
