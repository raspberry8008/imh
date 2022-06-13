package com.imh.admin.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.imh.admin.dao.OrderDAO;
import com.imh.admin.utils.Criteria;
import com.imh.admin.vo.order.OrderCancelVO;
import com.imh.admin.vo.order.OrderDeliveryVO;
import com.imh.admin.vo.order.OrderInfoVO;
import com.imh.admin.vo.order.OrderItemVO;
import com.imh.admin.vo.order.OrderVO;

@Repository
public class OrderDAOImpl implements OrderDAO {
	
	@Inject
	SqlSession sqlSession;
	
	private static final String Namespace="com.imh.admin.orderMapper";

	@Override
	public List<OrderInfoVO> orderList(Criteria cri) { 
		return sqlSession.selectList(Namespace + ".orderListAll", cri);
	}
	
	@Override
	public List<OrderInfoVO> readyList(Criteria cri) {
		return sqlSession.selectList(Namespace + ".readyList", cri);
	}

	@Override
	public List<OrderDeliveryVO> deliveryList(Criteria cri) { 
		return sqlSession.selectList(Namespace + ".deliveryList", cri);
	}

	@Override
	public List<OrderCancelVO> canselList(Criteria cri) { 
		return sqlSession.selectList(Namespace + ".canselList", cri);
	}
	
	@Override
	public List<OrderInfoVO> refundList(Criteria cri) { 
		return sqlSession.selectList(Namespace + ".refundList", cri);
	}

	@Override
	public int listCount(Criteria cri) { 
		return sqlSession.selectOne(Namespace + ".totalCount", cri);
	}
	

	@Override
	public OrderVO getOrder(String orderCode) { 
		return sqlSession.selectOne(Namespace + ".getOrder", orderCode);
	}
	
	@Override
	public OrderItemVO getItem(String itemId) { 
		return sqlSession.selectOne(Namespace + ".getItem", itemId);
	}
	
	@Override
	public String getCS(String orderCode) { 
		return sqlSession.selectOne(Namespace + ".getCS", orderCode);
	}
//	@Override
//	public PayDetailVO getPayDetail(String orderCode) { // 결제조회
//		return sqlSession.selectOne(Namespace + ".getPayDetail", orderCode);
//	}
//
//	@Override
//	public int regDlivery(OrderDeliveryVO delivery) { // 배송접수
//		return sqlSession.insert(Namespace + ".regDelivery", delivery);
//	}
//
//	@Override
//	public int regCancel(OrderCancelVO cancel) { // 취소접수
//		return sqlSession.insert(Namespace + ".regCancel", cancel);
//	}
//
//	@Override
//	public int regRefund(PayRefundVO refund) { // 환불접수
//		return sqlSession.insert(Namespace + ".regRefund", refund);
//	}
//
//	@Override
//	public int orderCheck(Map<String, Object> map) { // info CS 상태변경
//		return sqlSession.update(Namespace + ".orderCheck", map);
//	}
//
//	@Override
//	public int payCheck(Map<String, Object> map) { // pay 상태변경
//		return sqlSession.update(Namespace + ".payCheck", map);
//	}
//
//	@Override
//	public int refundCheck(Map<String, Object> map) {  //refunt 상태변경 
//		return sqlSession.update(Namespace + ".refundCheck", map);
//	}
//
//	@Override
//	public int modifyAddress(OrderAddressVO address) { // 발송 전 배송지 정보수정
//		return sqlSession.update(Namespace + ".modifyAddress", address);
//	}
//
//	@Override
//	public int modifyDelivery(OrderDeliveryVO delivery) { // 배송정보 수정
//		return sqlSession.update(Namespace + ".modifyDelivery", delivery);
//	}





}
