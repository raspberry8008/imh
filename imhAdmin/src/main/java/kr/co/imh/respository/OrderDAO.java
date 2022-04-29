package kr.co.imh.respository;

import java.util.List;
import java.util.Map;

import kr.co.imh.domain.Order;
import kr.co.imh.utils.Criteria;


/**
 * @author : hyeseo
 * @Project : imhAdmin
 * @Date : 2022. 4. 19. 
 */


public interface OrderDAO {
	
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
	
	// CS 조회
	public String getOrderCS(Order order);
	
	// 주문수량 조회
	public Order getItemCount(Order order);
	
	// 배송접수
	public int regDlivery(Order order);	
	
	// 취소접수
	public int regCancel(Order order);	
	
	// 환불접수
	public int regRefund(Order order);
	
	// info CS 상태변경 : 1결제대기/2결제완료/3상품준비중/4발송완료/5취소접수중/6환불완료/7환불철회
	public int orderCheck(Map<String, Object> map);
	
	// pay 상태변경 - 1.결제대기,2.결제완료,3.결제환불
	public int payCheck(Map<String, Object> map);
	
	// refunt 상태변경  - 1.대기/2.승인/3.거부
	public int refundCheck(Map<String, Object> map);
	
	// 발송 전 주소지 정보수정
	public int modifyAddress(Order order);
	
	// 발송정보 수정
	public int modifyDlivery(Order order);


}
