package kr.co.imh.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.imh.domain.Admin;
import kr.co.imh.service.AdminService;
import kr.co.imh.utils.Criteria;

@Component
@Controller
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Inject
	private AdminService adminService;

	
	// 관리자 전체목록
	@RequestMapping(value="admin/list/admin", method = RequestMethod.GET)
	public ModelAndView listPage( Criteria cri, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		logger.info("관리자 전체목록");
		logger.info(cri.toString());
		
		List<Admin> list=adminService.list(cri);  // 게시판의 글 리스트
		
		ModelAndView mav = new ModelAndView ();
		mav.addObject("list", list);
		mav.setViewName("admin/list/admin");
		return mav;
	}
	
	// 관리자 상세조회
	
	@RequestMapping(value="admin/readPage",method=RequestMethod.GET)
	public ModelAndView read(@RequestParam("adminId") String adminId, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		logger.info("관리자"+adminId);
		
		Admin admin= adminService.getRead(adminId);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("admin",admin);
		mav.setViewName("admin/readPage");
		return mav;
	}
	
	
	// 관리자 등록
	
	// 관리자 수정
	
	// 관리자 삭제 ( 계정 미사용으로 상태 변경)

}
