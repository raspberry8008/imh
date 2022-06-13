package com.imh.admin.dao;

import java.util.Map;

import com.imh.admin.vo.admin.LoginVO;

public interface LoginDAO {

	/**
	 * @param adminId, adminPwd
	 * @return 회원여부 확인 결과 - 성공 : 1, 실패 :0
	 * @throws Exception
	 */
	public String adminCheck(Map<String,Object> inMap) throws Exception;
	
	/**
	 * @param adminCheck value - 1 
	 * @return LoginVO - 로그인 관리자정보 
	 * @throws Exception
	 */
	public LoginVO adminSelectOne(Map<String,Object> inMap) throws Exception;

}
