package com.imh.admin.controller;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.imh.admin.service.AdminService;
import com.imh.admin.utils.CommUtils;
import com.imh.admin.utils.Criteria;
import com.imh.admin.utils.PageMaker;
import com.imh.admin.vo.admin.AdminVO;


@Controller
public class AdminController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AdminController.class);
	
	@Inject
	private AdminService adminService;
	
	
	@Inject
	private PageMaker pageMaker;
	
	/**
	 * admin list 조회
	 * @param cri - 조회할 정보가 담긴 cri
	 * @param model
	 * @return "admin/list"
	 * @exception Exception
	 */
	@RequestMapping(value="admin/list/admin", method = {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView adminList( Criteria cri, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		LOGGER.debug("admin/list");
		LOGGER.debug(cri.toString());

		pageMaker.setCri(cri);
		pageMaker.setTotalCount(adminService.listCount(cri));
		pageMaker.makeQuery(cri.getPage());
		

		List<AdminVO> list=adminService.list(cri);

		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", list);
		mav.addObject("pageMaker", pageMaker);
		mav.setViewName("admin/list");
		return mav;
	}

	/**
	 * admin 상세조회
	 * 
	 * @param model
	 * @return "/admin/detail"
	 * @exception Exception
	 */
	@RequestMapping(value="admin/detail",method=RequestMethod.GET)
	public ModelAndView getAdmin(@RequestParam("adminId") String adminId, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		LOGGER.debug("admin/detail");
		
		AdminVO resultVO= adminService.getDetail(adminId);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("AdminVO",resultVO);
		mav.setViewName("admin/detail");
		return mav;
	}
	
	
	/**
	 * admin 등록화면 조회
	 * 
	 * @return "admin/register"
	 * @exception Exception
	 */
	@RequestMapping(value="admin/register/admin", method=RequestMethod.GET)
	public String adminRegisterView() throws Exception {
		LOGGER.debug("adminRegisterView");
		return "admin/register";
	}
	

	/**
	 * admin 등록 
	 * @param AdminVO - 관리자 등록정보
	 * @return 관리자등록 결과 - String result value 실패 : 0 "forward:/admin/register", 성공 : "admin/list"
	 * @throws Exception
	 */
	@RequestMapping(value = "admin/register", method = RequestMethod.POST)
	public String adminRegister(@ModelAttribute("AdminVO") AdminVO adminVO, HttpServletRequest request) throws Exception {
		LOGGER.debug("admin/register");
		
		MultipartFile uploadFile = adminVO.getUploadFile();
		
		
		if (!uploadFile.isEmpty()) {
			String fileName=uploadFile.getOriginalFilename();
			UUID uuid = UUID.randomUUID();
			String savedName = uuid.toString()+"_"+fileName;
			adminVO.setAdminImage(savedName);
			uploadFile.transferTo(new File(request.getSession().getServletContext().getRealPath("/resources/adminImg")));
		}
		
		String result = adminService.register(adminVO);
		if (result=="0") {
			LOGGER.debug("등록 실패");
			return "forward:/admin/register";
		} else {
			LOGGER.debug("등록 성공");
			return "redirect:/admin/list/admin";
		}
	}
	
	/**
	 * admin 수정화면 조회
	 * 
	 * @param model
	 * @return "/admin/update"
	 * @exception Exception
	 */
	@RequestMapping(value="admin/update/admin",method=RequestMethod.GET)
	public ModelAndView adminUpadateView(@RequestParam("adminId") String adminId, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		LOGGER.debug("admin/update/admin");
		
		AdminVO resultVO= adminService.getDetail(adminId);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("AdminVO",resultVO);
		mav.setViewName("admin/update");
		return mav;
	}
	
	/**
	 * admin 수정
	 * @param adminVO - 수정할 정보가 담긴 VO
	 * @return "admin/detail"
	 * @exception Exception
	 */
	@RequestMapping(value="admin/update", method = RequestMethod.POST)
	public String updateAccount(@ModelAttribute("AdminVO") AdminVO adminVO, HttpServletRequest request) throws Exception {
		LOGGER.debug("admin/update");
		
		MultipartFile uploadFile = adminVO.getUploadFile();
		
		if (!uploadFile.isEmpty()) {
			String fileName=uploadFile.getOriginalFilename();
			UUID uuid = UUID.randomUUID();
			String savedName = uuid.toString()+"_"+fileName;
			adminVO.setAdminImage(savedName);
			uploadFile.transferTo(new File(request.getSession().getServletContext().getRealPath("/resources/adminImg")));
		}
		
		int result = adminService.update(adminVO);
		
		if (result==0){
			LOGGER.debug("수정 실패");
			return "forward:/admin/update";
		} else {
			LOGGER.debug("수정 성공");
			return "admin/detail";
		}
		
	}
	
	/**
	 * 아이디 중복 조회
	 * 
	 * @param adminId - id 정보
	 * @param request
	 * @return 중복확인 결과 (inOutMap value - txt1 : id 중복 , txt0 : id 사용가능)
	 * @throws Exception
	 */

	@RequestMapping(value = "admin/idCheck", method = RequestMethod.POST)
	@ResponseBody
	public String ajaxIdCheck(HttpServletRequest request) throws Exception {
		LOGGER.debug("admin/idCheck");

		Map<String, Object> inOutMap = adminService.idCheck((String) CommUtils.getFormParam(request).get("adminId"));
		
		return  new Gson().toJson(inOutMap);
	}
	
	/**
	 * 사원번호 중복 조회
	 * 
	 * @param adminEno - 사원번호를 조회할 정보
	 * @param request
	 * @return 중복확인 결과 (inOutMap value - txt1 : id 중복 , txt0 : id 사용가능)
	 * @throws Exception
	 */

	@RequestMapping(value = "admin/enoCheck", method = RequestMethod.POST)
	@ResponseBody
	public String ajaxEnoCheck(HttpServletRequest request) throws Exception {
		LOGGER.debug("admin/idCheck");

		Map<String, Object> inOutMap = adminService.enoCheck((String) CommUtils.getFormParam(request).get("adminEno"));
		
		return  new Gson().toJson(inOutMap);
	}
	

}
