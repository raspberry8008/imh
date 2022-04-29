package kr.co.imh.respository;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.imh.domain.Order;
import kr.co.imh.utils.Criteria;

@Repository
public class OrderDAOImpl implements OrderDAO {
	
	@Inject
	SqlSession sqlSession;
	
	private static final String Namespace="kr.co.imh.orderMapper";

	@Override
	public List<Order> orderListAll(Criteria cri) { // 주문조회 전체목록
		return sqlSession.selectList(Namespace + ".orderListAll", cri);
	}

	@Override
	public List<Order> readyListAll(Criteria cri) { // 발주/발송관리 전체목록
		return sqlSession.selectList(Namespace + ".readyListAll", cri);
	}

	@Override
	public List<Order> deliveryListAll(Criteria cri) { // 배송현황관리 배송현황 전체목록
		return sqlSession.selectList(Namespace + ".deliveryListAll", cri);
	}

	@Override
	public List<Order> canselListAll(Criteria cri) { // 취소관리 취소주문내역 전체목록
		return sqlSession.selectList(Namespace + ".canselListAll", cri);
	}

	@Override
	public int listCount(Criteria cri) { // 데이터 전체 갯수
		return sqlSession.selectOne(Namespace + ".totalCount", cri);
	}
	
	@Override
	public Order getOrder(Map<String, Object> map) { // 주문내용 단일조회
		return sqlSession.selectOne(Namespace + ".getOrder", map);
	}

	@Override
	public  String getOrderCS(Order order) { // CS상태 조회
		return sqlSession.selectOne(Namespace + ".getCS", order);
	}
	
	@Override
	public Order getItemCount(Order order) { // 주문수량 조회
		return sqlSession.selectOne(Namespace + ".getItemCount", order);
	}

	@Override
	public int regDlivery(Order order) { // 배송접수
		return sqlSession.insert(Namespace + ".regDelivery", order);
	}

	@Override
	public int regCancel(Order order) { // 취소접수
		return sqlSession.insert(Namespace + ".regCancel", order);
	}

	@Override
	public int regRefund(Order order) { // 환불접수
		return sqlSession.insert(Namespace + ".regRefund", order);
	}

	@Override
	public int orderCheck(Map<String, Object> map) { // info CS 상태변경
		return sqlSession.update(Namespace + ".orderCheck", map);
	}

	@Override
	public int payCheck(Map<String, Object> map) { // pay 상태변경
		return sqlSession.update(Namespace + ".payCheck", map);
	}

	@Override
	public int refundCheck(Map<String, Object> map) {  //refunt 상태변경 
		return sqlSession.update(Namespace + ".refundCheck", map);
	}

	@Override
	public int modifyAddress(Order order) { // 발송 전 배송지 정보수정
		return sqlSession.update(Namespace + ".modifyAddress", order);
	}

	@Override
	public int modifyDlivery(Order order) { // 배송정보 수정
		return sqlSession.update(Namespace + ".modifyDlivery", order);
	}

}
