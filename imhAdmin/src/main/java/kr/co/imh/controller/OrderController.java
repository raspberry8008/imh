package kr.co.imh.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.co.imh.domain.Order;
import kr.co.imh.service.OrderService;
import kr.co.imh.utils.Criteria;
import kr.co.imh.utils.PageMaker;

@Controller
public class OrderController {
	
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Inject
	private OrderService orderService;
	
	@Inject
	private PageMaker pageMaker;
	
	// 주문조회 전체목록
	@RequestMapping(value="admin/list/order", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView orderListAll( Criteria cri, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		logger.info("주문내역 전체목록");
		logger.info(cri.toString());

		pageMaker.setCri(cri);
		pageMaker.setTotalCount(orderService.listCount(cri));
		pageMaker.makeQuery(cri.getPage());
		

		List<Order> list=orderService.orderListAll(cri);

		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", list);
		mav.addObject("pageMaker", pageMaker);
		mav.setViewName("order/orderlist");
		return mav;
	}
	
	// 발주/발송관리 전체목록
	@RequestMapping(value="admin/list/ready",  method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView readyListAll( Criteria cri, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		logger.info("발주발송관리 전체목록");
		logger.info(cri.toString());
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(orderService.listCount(cri));
		pageMaker.makeQuery(cri.getPage());
		
		List<Order> list = orderService.readyListAll(cri);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.addObject("pageMaker", pageMaker);
		mav.setViewName("order/ready");
		return mav;
	}
    
	// 배송현황관리 배송현황 전체목록
	@RequestMapping(value="admin/list/delivery",  method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView deliveryListAll( Criteria cri, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		logger.info("배송현황 전체목록");
		logger.info(cri.toString());

		pageMaker.setCri(cri);
		pageMaker.setTotalCount(orderService.listCount(cri));
		pageMaker.makeQuery(cri.getPage());

		List<Order> list = orderService.deliveryListAll(cri);

		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.addObject("pageMaker", pageMaker);
		mav.setViewName("order/delivery");
		return mav;
	}
	
	// 취소관리 취소주문내역 전체목록
	@RequestMapping(value="admin/list/calsel", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView canselListAll( Criteria cri, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		logger.info("취소주문내역 전체목록");
		logger.info(cri.toString());

		pageMaker.setCri(cri);
		pageMaker.setTotalCount(orderService.listCount(cri));
		pageMaker.makeQuery(cri.getPage());

		List<Order> list = orderService.canselListAll(cri);

		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.addObject("pageMaker", pageMaker);
		mav.setViewName("order/calsel");
		return mav;
	}
	
	// 주문 전체 상세조회
	@ResponseBody
	@RequestMapping(value = "admin/order", method = RequestMethod.GET)
	public ModelAndView getOrder(@RequestParam Map<String, Object> map) {
		logger.info("주문 상세보기");
		ModelAndView mav = new ModelAndView();
		mav.addObject("order", orderService.getOrder(map));
		mav.setViewName("order/orderRead");
		return mav;
	}
	
	// 주문 수량 상세조회
	@ResponseBody
	@RequestMapping(value="admin/list/moaModal",method=RequestMethod.POST)
	public ModelAndView getItem(Order order) {
		logger.info("주문 수량 상세보기");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("order",orderService.getItemCount(order));
		mav.setViewName("order/ready");
		return mav;
	}
	

	// 배송접수
	@ResponseBody
	@RequestMapping(value="admin/complete/order", method=RequestMethod.POST)
	public int regDlivery(Order order) {
		logger.info("배송 접수");
		return orderService.regDlivery(order);
	}
	// 취소접수
	@ResponseBody
	@RequestMapping(value="admin/cancel", method=RequestMethod.POST)
	public ModelAndView regCancel(Order order) {
		logger.info("취소 접수");
		Map<String, Object> result = new HashMap<String, Object>();
		orderService.regCancel(order);
		
		ModelAndView mav = new ModelAndView();
		
		try {
			orderService.regCancel(order);
			result.put("status", "OK");
			mav.setViewName("order/orderlist");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("status", "Fail");
			mav.setViewName("order/orderlist");
		}
		return mav;
	}
	
	// 주문확인처리
	@ResponseBody
	@RequestMapping(value = "admin/check/order", method = RequestMethod.POST)
	public Map<String, Object> orderReady(Order order) {
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			orderService.orderReady(result);
			result.put("status", "OK");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("status", "Fail");
		}
		return result;
	}

	// 주문자정보 수정하기 - 발송전 배송지 정보 수정
	@ResponseBody
	@RequestMapping(value = "admin/update/order", method = RequestMethod.POST)
	public Map<String, Object> modifyOrder(Order order) {
		Map<String, Object> result = new HashMap<String, Object>();

		try {
			orderService.modifyAddress(order);
			result.put("status", "OK");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("status", "Fail");
		}
		return result;
	}
	
	// 수동환불처리
	@ResponseBody
	@RequestMapping(value = "admin/check/calsel", method = RequestMethod.POST)
	public Map<String, Object> modifyRefund(Order order) {
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			orderService.modifyRefund(order);
			result.put("status", "OK");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("status", "Fail");
		}
		return result;
	}
	

	
	// 발송정보 수정
	@ResponseBody
	@RequestMapping(value = "admin/update/delivery", method = RequestMethod.POST)
	public Map<String, Object> modifyDlivery(Order order) {
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			orderService.orderReady(result);
			result.put("status", "OK");
		} catch (Exception e) {
			e.printStackTrace();
			result.put("status", "Fail");
		}
		return result;
	}
	
		
	
	

}
