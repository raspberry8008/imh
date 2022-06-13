package com.imh.admin.controller;

import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.imh.admin.service.LoginService;
import com.imh.admin.utils.CommUtils;
import com.imh.admin.vo.admin.LoginVO;


@Controller
public class LoginController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
//	@Inject
//	private MappingJackson2JsonView jsonView;
	
	@Inject
	LoginService loginService;
	
	
	/**
	 * 로그인 화면 조회
	 * 
	 * @param model
	 * @return "/login/login"
	 * @exception Exception
	 */

	@RequestMapping(value = "login/login")
	public String loginView(HttpServletRequest request) {
		LOGGER.debug("login/login");
		return "login/login";
	}

	/**
	 * 로그인 
	 * 
	 * @param adminId- 관리자 ID , adminPwd - 관리자 id의 비밀번호
	 * @param request
	 * @return 회원조회결과 (성공 /home.do, 실패: forward:/login/login.do 로그인 실패 메세지 출력)      
	 * @throws Exception
	 */

	@RequestMapping(value = "admin/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, ModelMap model) throws Exception {

		LOGGER.debug("admin/login");
		Map inMap = CommUtils.getFormParam(request);
		LoginVO resultVO = loginService.adminLogin(inMap);
		if (resultVO != null && resultVO.getAdminId() != null && !resultVO.getAdminId().equals("")) {
			request.getSession().setAttribute("LoginVO", resultVO);
			
			LOGGER.debug("로그인성공");
			return "home";
		} else {
			model.addAttribute("message", "아이디와 패스워드를 다시 확인해주세요.");
			LOGGER.debug("로그인실패");
			return "login/login";
			
		}
	}

	/**
	 * 로그아웃
	 * 
	 * @param loginVO - 로그인 되어 있는 관리자 정보
	 * @param request
	 * @return 세션초기화
	 * @throws Exception
	 */

	@RequestMapping(value = "login/logout")
	public String logout(HttpServletRequest request, ModelMap model) throws Exception {
		RequestContextHolder.getRequestAttributes().removeAttribute("LoginVO", RequestAttributes.SCOPE_SESSION);
		request.getSession().invalidate();
		return "login/login";
	}
}






