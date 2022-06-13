package com.imh.admin.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.imh.admin.dao.OrderDAO;
import com.imh.admin.service.OrderService;
import com.imh.admin.utils.Criteria;
import com.imh.admin.vo.order.OrderCancelVO;
import com.imh.admin.vo.order.OrderDeliveryVO;
import com.imh.admin.vo.order.OrderInfoVO;
import com.imh.admin.vo.order.OrderItemVO;
import com.imh.admin.vo.order.OrderVO;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Inject
	private OrderDAO orderDAO;
	
	@Override
	public List<OrderInfoVO> orderList(Criteria cri) { 
		return orderDAO.orderList(cri);
	}
	
	@Override
	public List<OrderInfoVO> readyList(Criteria cri) {
		return orderDAO.readyList(cri);
	}

	@Override
	public List<OrderDeliveryVO> deliveryList(Criteria cri) { 
		return orderDAO.deliveryList(cri);
	}

	@Override
	public List<OrderCancelVO> canselList(Criteria cri) { 
		return orderDAO.canselList(cri);
	}
	
	@Override
	public List<OrderInfoVO> refundList(Criteria cri) { 
		return orderDAO.refundList(cri);
	}

	@Override
	public int listCount(Criteria cri) { 
		return orderDAO.listCount(cri);
	}

	@Override
	public OrderVO getOrder(String orderCode) { 
		return orderDAO.getOrder(orderCode);
	}
	
	@Override
	public OrderItemVO getItem(String itemId) { 
		return orderDAO.getItem(itemId);
	}



//	@Override
//	public int regDelivery(OrderDeliveryVO delivery) { 
//		return orderDAO.regDlivery(delivery);
//	}
//
//	@Override
//	public int regCancel(OrderCancelVO cancel) { // 취소접수 및 환불접수
//		String orderCode=cancel.getCancelOrder(); // 주문번호
//		String cancelId="OC"+orderCode; // 취소접수번호 생성
//		
//		if ("2".equals(orderDAO.getCS(cancel.getCancelOrder()))) { // 주문확인전이라면 자동취소
//
//			cancel.setCancelId(cancelId);
//			orderDAO.regCancel(cancel); // 취소 접수
//			
//			PayRefundVO refund = new PayRefundVO();
//			refund.setRefundId("PR"+cancel.getCancelOrder());
//			refund.setRefundCancal(cancelId);
//			refund.setRefundPay(orderDAO.getPayDetail(orderCode).getPayId());
//			refund.setRefundPrice(cancel.getCancelPrice());
//			refund.setRefundState("2");
//			refund.setRefundName("1");
//			orderDAO.regRefund(refund); // 환불완료처리
//			Map<String, Object> pay = new HashMap<String, Object>();
//			pay.put(orderCode, "3");
//			orderDAO.payCheck(pay);
//			Map<String, Object> cs  = new HashMap<String, Object>();
//			cs.put(orderCode, "6"); // 환불완료
//			return orderDAO.orderCheck(cs);
//		} else {
//			orderDAO.regCancel(cancel); // 취소 접수
//			PayRefundVO refund = new PayRefundVO();
//			refund.setRefundId("PR"+cancel.getCancelOrder());
//			refund.setRefundCancal(cancelId);
//			refund.setRefundPay(orderDAO.getPayDetail(orderCode).getPayId());
//			refund.setRefundPrice(cancel.getCancelPrice());
//			refund.setRefundState("1");
//			return  orderDAO.regRefund(refund); // 환불 접수 	
//		}
//	}
//	
//	@Override
//	public int modifyAddress(OrderAddressVO address) { // 배송지 정보수정
//		if ("1".equals(orderDAO.getCS(address.getAddressOrder()))
//				|| "2".equals(orderDAO.getCS(address.getAddressOrder()))) { // 결제대기,결제완료일때만 주소수정가능
//			return orderDAO.modifyAddress(address);
//		} else {
//			return 0;
//		}
//	}
//
//	@Override
//	public int modifyRefund(PayRefundVO refund) { // 수동 환불처리
//		
//		if("3".equals(refund.getRefundState())) { // 취소거부 
//			orderDAO.regRefund(refund);
//			Map<String, Object> cs  = new HashMap<String, Object>();
//			cs.put(refund.getRefundOrder() , "7"); // cs 환불철회
//			return orderDAO.orderCheck(cs);
//		} else if ("2".equals(refund.getRefundState())) { //환불승인
//			orderDAO.regRefund(refund);
//			Map<String, Object> pay = new HashMap<String, Object>();
//			pay.put(refund.getRefundOrder(), "3");
//			orderDAO.payCheck(pay);
//			Map<String, Object> cs  = new HashMap<String, Object>();
//			cs.put(refund.getRefundOrder(), "6"); // cs 환불철회
//			
//			return orderDAO.orderCheck(cs);			
//		}
//		return 0;
//	}
//
//	@Override
//	public int orderReady(Map<String, Object> map) { // 주문확인 처리
//		return orderDAO.orderCheck(map);
//	}
//
//	@Override
//	public int modifyDelivery(OrderDeliveryVO delivery) { // 발송정보수정
//		return orderDAO.modifyDelivery(delivery);
//	}

}
