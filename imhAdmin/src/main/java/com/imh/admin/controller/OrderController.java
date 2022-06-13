package com.imh.admin.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.imh.admin.service.OrderService;
import com.imh.admin.utils.Criteria;
import com.imh.admin.utils.PageMaker;
import com.imh.admin.vo.order.OrderCancelVO;
import com.imh.admin.vo.order.OrderDeliveryVO;
import com.imh.admin.vo.order.OrderInfoVO;
import com.imh.admin.vo.order.OrderVO;

@Controller
public class OrderController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);
	
	@Inject
	private OrderService orderService;
	
	@Inject
	private PageMaker pageMaker;
	
	/**
	 * order AllList 조회
	 * @param cri - 조회할 정보가 담긴 cri
	 * @return "order/AllList"
	 * @exception Exception
	 */
	@RequestMapping(value="order/list/all", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView orderAllList(Criteria cri , HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		LOGGER.debug("order/list/all");

		pageMaker.setCri(cri);
		pageMaker.setTotalCount(orderService.listCount(cri));
		pageMaker.makeQuery(cri.getPage());
		

		List<OrderInfoVO> list=orderService.orderList(cri);

		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", list);
		mav.addObject("pageMaker", pageMaker);
		mav.setViewName("order/allList");
		return mav;
	}
	
	/**
	 * order readyList 조회
	 * @param cri - 조회할 정보가 담긴 cri
	 * @return "order/readyList"
	 * @exception Exception
	 */
	@RequestMapping(value="order/list/ready", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView orderReadyList( Criteria cri, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		LOGGER.debug("order/list/ready");
		
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(orderService.listCount(cri));
		pageMaker.makeQuery(cri.getPage());
		
		List<OrderInfoVO> list=orderService.readyList(cri);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", list);
		mav.addObject("pageMaker", pageMaker);
		mav.setViewName("order/readyList");
		return mav;
	}
	
    
	/**
	 * order deliveryList 조회
	 * @param cri - 조회할 정보가 담긴 cri
	 * @return "order/deliveryList"
	 * @exception Exception
	 */
	@RequestMapping(value="order/list/delivery",  method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView deliveryList( Criteria cri, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		LOGGER.debug("order/list/delivery");

		pageMaker.setCri(cri);
		pageMaker.setTotalCount(orderService.listCount(cri));
		pageMaker.makeQuery(cri.getPage());

		List<OrderDeliveryVO> list = orderService.deliveryList(cri);

		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.addObject("pageMaker", pageMaker);
		mav.setViewName("order/deliveryList");
		return mav;
	}
	
	/**
	 * order calselList 조회
	 * @param cri - 조회할 정보가 담긴 cri
	 * @return "order/calselList"
	 * @exception Exception
	 */
	@RequestMapping(value="order/list/calsel", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView canselList( Criteria cri, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		LOGGER.debug("order/list/calsel");

		pageMaker.setCri(cri);
		pageMaker.setTotalCount(orderService.listCount(cri));
		pageMaker.makeQuery(cri.getPage());

		List<OrderCancelVO> list = orderService.canselList(cri);

		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.addObject("pageMaker", pageMaker);
		mav.setViewName("order/calselList");
		return mav;
	}
	
	/**
	 * order calselList 조회
	 * @param cri - 조회할 정보가 담긴 cri
	 * @return "order/refundList"
	 * @exception Exception
	 */
	@RequestMapping(value="order/list/refund", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView refundList( Criteria cri, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		LOGGER.debug("order/list/refund");
		
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(orderService.listCount(cri));
		pageMaker.makeQuery(cri.getPage());
		
		List<OrderInfoVO> list = orderService.refundList(cri);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.addObject("pageMaker", pageMaker);
		mav.setViewName("order/refundList");
		return mav;
	}
	
	/**
	 * order 상세조회
	 * 
	 * @param orderCode 주문번호
	 * @return "order/orderDetail"
	 * @exception Exception
	 */
	@RequestMapping(value = "order/detail", method = RequestMethod.GET)
	public ModelAndView getOrder(@RequestParam("orderCode") String orderCode, HttpServletRequest request, HttpServletResponse response) {
		LOGGER.debug("order/detail");
		
		OrderVO resultVO= orderService.getOrder(orderCode);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("OrderVO", resultVO );
		mav.setViewName("order/orderDetail");
		return mav;
	}
	
	/**
	 * order item 상세조회
	 * 
	 * @param itemId 상품주문번호
	 * @return "order/itemDetail"
	 * @exception Exception
	 */
	@RequestMapping(value="order/item",method=RequestMethod.POST)
	public ModelAndView getItem(@RequestParam("itemId") String itemId, HttpServletRequest request, HttpServletResponse response) {
		LOGGER.debug("order/item");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("item",orderService.getItem(itemId));
		mav.setViewName("order/itemDetail");
		return mav;
	}
	

//	/**
//	 * delivery 등록 
//	 * @param delivery - 배송 등록정보
//	 * @return 배송등록 결과 - String result value 실패 : 0 , 성공 : "order/deliveryList"
//	 * @throws Exception
//	 */
//	@RequestMapping(value="order/complete/order", method=RequestMethod.POST)
//	public String regDlivery(OrderDeliveryVO delivery) {
//		LOGGER.debug("order/complete/order");
//		return orderService.regDelivery(delivery);
//	}
//	
//	/**
//	 * cancel 등록 
//	 * @param cancel - 취소요청 정보
//	 * @return 취소접수 결과 - String result value 실패 : 0 , 성공 : "order/calselList"
//	 * @throws Exception
//	 */
//	@RequestMapping(value="order/cancel", method=RequestMethod.POST)
//	public ModelAndView regCancel(OrderCancelVO cancel) {
//		LOGGER.debug("order/cancel");
//		Map<String, Object> result = new HashMap<String, Object>();
//		orderService.regCancel(cancel);
//		
//		ModelAndView mav = new ModelAndView();
//		
//		try {
//			orderService.regCancel(cancel);
//			result.put("status", "OK");
//			mav.setViewName("order/orderlist");
//		} catch (Exception e) {
//			e.printStackTrace();
//			result.put("status", "Fail");
//			mav.setViewName("order/orderlist");
//		}
//		return mav;
//	}
//	
//	/**
//	 * 주문확인 처리
//	 * @param cancel - 취소요청 정보
//	 * @return 취소접수 결과 - String result value 실패 : 0 , 성공 : "order/readyList"
//	 * @throws Exception
//	 */
//	@RequestMapping(value = "order/check", method = RequestMethod.POST)
//	public Map<String, Object> orderReady(OrderInfoVO orderData) {
//		LOGGER.debug("order/check");
//		Map<String, Object> result = new HashMap<String, Object>();
//		
//		try {
//			orderService.orderReady(result);
//			result.put("status", "OK");
//		} catch (Exception e) {
//			e.printStackTrace();
//			result.put("status", "Fail");
//		}
//		return result;
//	}
//
//	/**
//	 * 주문자정보 수정 - 발송전 배송지 정보 수정
//	 * @param addressVO - 수정할 정보가 담긴 VO
//	 * @return "order/detail"
//	 * @exception Exception
//	 */
//	@RequestMapping(value = "order/update/order", method = RequestMethod.POST)
//	public Map<String, Object> modifyOrder(OrderAddressVO addressVO) {
//		LOGGER.debug("order/update/order");
//		Map<String, Object> result = new HashMap<String, Object>();
//
//		try {
//			orderService.modifyAddress(addressVO);
//			result.put("status", "OK");
//		} catch (Exception e) {
//			e.printStackTrace();
//			result.put("status", "Fail");
//		}
//		return result;
//	}
//	
//	/**
//	 * 수동환불처리
//	 * @param refundVO - 환불정보가 담긴 VO
//	 * @return "order/calselList"
//	 * @exception Exception
//	 */
//	@RequestMapping(value = "admin/check/calsel", method = RequestMethod.POST)
//	public Map<String, Object> modifyRefund(PayRefundVO refund) {
//		Map<String, Object> result = new HashMap<String, Object>();
//		
//		try {
//			orderService.modifyRefund(refund);
//			result.put("status", "OK");
//		} catch (Exception e) {
//			e.printStackTrace();
//			result.put("status", "Fail");
//		}
//		return result;
//	}
//	

}
