package com.imh.admin.service;

import java.util.Map;

import com.imh.admin.vo.admin.LoginVO;

public interface LoginService {
	
	/**
	 * 로그인  - 입력받은 ID, PWD 일치하는 관리자 정보를 검색한다.
	 * @param inMap
	 * @return inOutMap value - 성공 : loginVO, 실패 - txt0
	 * @throws Exception
	 */
	
	LoginVO adminLogin(Map<String,Object> inMap) throws Exception;

}
