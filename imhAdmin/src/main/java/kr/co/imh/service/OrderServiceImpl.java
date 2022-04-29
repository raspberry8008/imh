package kr.co.imh.service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.imh.domain.Order;
import kr.co.imh.respository.OrderDAO;
import kr.co.imh.utils.Criteria;
import kr.co.imh.utils.StateMessage;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Inject
	private OrderDAO orderDAO;
	
	@Inject
	private StateMessage msg;

	@Override
	public List<Order> orderListAll(Criteria cri) { // 주문조회 전체목록
		
		List<Order> list = new ArrayList<Order>();
		
		for (Order order :  orderDAO.orderListAll(cri)) {
			list.add(msg.message(order));
		}
		return list;
	}

	@Override
	public Order getOrder(Map<String, Object> map) { // 주문단일 조회
		
		Order order = new Order ();
		StateMessage msg = new StateMessage();
		order =msg.message(orderDAO.getOrder(map));
		
		return order;
	}

	@Override
	public List<Order> readyListAll(Criteria cri) { // 발주/발송관리 전체목록
		
		StateMessage msg = new StateMessage();
		List<Order> list = new ArrayList<Order>();
		
		for (Order order : orderDAO.readyListAll(cri)) {
			list.add(msg.message(order));
		}
		return list;
	}

	@Override
	public List<Order> deliveryListAll(Criteria cri) { // 배송현황관리 배송현황 전체목록
		
		StateMessage msg = new StateMessage();
		List<Order> list = new ArrayList<Order>();
		
		for (Order order : orderDAO.deliveryListAll(cri)) {
			list.add(msg.message(order));
		}
		return list;
	}

	@Override
	public List<Order> canselListAll(Criteria cri) { // 취소관리 취소주문내역 전체목록
		StateMessage msg = new StateMessage();
		List<Order> list = new ArrayList<Order>();
		
		for (Order order : orderDAO.canselListAll(cri)) {
			list.add(msg.message(order));
		}
		return list;
	}

	@Override
	public int listCount(Criteria cri) { // 데이터 전체 갯수
		return orderDAO.listCount(cri);
	}

	@Override
	public Order getItemCount(Order order) { // 주문수량 조회
		return orderDAO.getItemCount(order);
	}

	@Override
	public int regDlivery(Order order) { // 배송접수
		return orderDAO.regDlivery(order);
	}

	@Override
	public int regCancel(Order order) { // 취소접수 및 환불접수
		if ("2".equals(order.getOrderState())) { // 주문확인전이라면 자동취소
			orderDAO.regCancel(order); // 취소 접수
			order.setOrderCode(order.getOrderCode());
			order.setRefundPrice(order.getCancelPrice());
			order.setRefundState("2");
			order.setRefundName("1");
			order.setRefundRegdate(LocalDate.now().toString());
			order.setRefundRegtime(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
			orderDAO.regRefund(order); // 환불완료처리
			Map<String, Object> pay = new HashMap<String, Object>();
			pay.put(order.getOrderCode(), "3");
			orderDAO.payCheck(pay);
			Map<String, Object> cs  = new HashMap<String, Object>();
			cs.put(order.getOrderCode(), "6"); // 환불완료
			return orderDAO.orderCheck(cs);
		} else {
			orderDAO.regCancel(order); // 취소 접수
			order.setOrderCode(order.getOrderCode());
			order.setRefundPrice(order.getCancelPrice());
			order.setRefundState("1");
			order.setRefundName("1");
			order.setRefundRegdate(LocalDate.now().toString());
			order.setRefundRegtime(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
			return  orderDAO.regRefund(order); // 환불 접수 	
		}
	}
	
	@Override
	public int modifyAddress(Order order) { // 발송 전 배송지 정보수정
		return orderDAO.modifyAddress(order);
	}

	@Override
	public int modifyRefund(Order order) { // 수동 환불처리
		if("3".equals(order.getRefundState())) { // 취소거부 
			orderDAO.regRefund(order);
			Map<String, Object> cs  = new HashMap<String, Object>();
			cs.put(order.getOrderCode(), "7"); // cs 환불철회
			return orderDAO.orderCheck(cs);
		} else if ("2".equals(order.getRefundState())) {
			orderDAO.regRefund(order);
			Map<String, Object> pay = new HashMap<String, Object>();
			pay.put(order.getOrderCode(), "3");
			orderDAO.payCheck(pay);
			Map<String, Object> cs  = new HashMap<String, Object>();
			cs.put(order.getOrderCode(), "6"); // cs 환불철회
			
			return orderDAO.orderCheck(cs);			
		}
		return 0;
	}

	@Override
	public int orderReady(Map<String, Object> map) { // 주문확인 처리
		return orderDAO.orderCheck(map);
	}

	@Override
	public int modifyDlivery(Order order) { // 발송정보수정
		return orderDAO.modifyDlivery(order);
	}
}
