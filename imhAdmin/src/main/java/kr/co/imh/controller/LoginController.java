package kr.co.imh.controller;

import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.imh.service.AdminService;

@Component
@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Inject
	AdminService adminService;
	
	
	@RequestMapping(value="login/login", method= RequestMethod.GET)
	public String login() {
		logger.info("login view 이동");
		return "login/login";
	}
	
	@RequestMapping(value="login/login", method= RequestMethod.POST)
	public String login(@RequestParam Map<String,Object> map,
			HttpServletRequest request, HttpServletResponse response,HttpSession session) throws Exception {
		logger.info("요청정보 받아서 보내기");
		Map admin = adminService.login(map);
		
		if(admin == null) { //로그인 실패
			logger.info("로그인 안됨");
			return "redirect:/";
		}else {  // 로그인 성공
			//세션부여
			session.setAttribute("admin", admin);
			return "redirect:/home";
		}		
	}


	@RequestMapping(value = "login/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}






