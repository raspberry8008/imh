package com.imh.admin.service.impl;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.imh.admin.dao.LoginDAO;
import com.imh.admin.service.LoginService;
import com.imh.admin.utils.CommUtils;
import com.imh.admin.vo.admin.LoginVO;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Inject
	private LoginDAO loginDAO;

	@Override
	public LoginVO adminLogin(Map<String,Object> inMap) throws Exception {
		LoginVO loginVO = new LoginVO();
		if (!CommUtils.isNull(inMap)) {
			String result = loginDAO.adminCheck(inMap);
			if (!("0".equals(result))) {
				return loginDAO.adminSelectOne(inMap);
			} 
		}	
		loginVO.setAdminId("");
		return loginVO;
	}

}
