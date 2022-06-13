package com.imh.admin.service;

import java.util.List;
import java.util.Map;

import com.imh.admin.utils.Criteria;
import com.imh.admin.vo.admin.AdminVO;

/**
 * @author : hyeseo
 * @Project : imhAdmin
 * @Date : 2022. 4. 19. 
 */
public interface AdminService {
	
	/**
	 * admin list 조회
	 * @param searchVO - 조회할 정보가 담긴 SampleDefaultVO
	 * @param model
	 * @return "List<AdminVO>"
	 * @exception Exception
	 */
	public List<AdminVO> list(Criteria cri) throws Exception;
	
	/**
	 * admin 총 row를 조회한다.
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return totalCount
	 * @exception
	 */
	public int listCount(Criteria cri) throws Exception;
	
	/**
	 * admin 상세조회
	 * 
	 * @param model
	 * @return "AdminVO"
	 * @exception Exception
	 */
	public AdminVO getDetail(String adminId) throws Exception;
	
	/**
	 * admin 등록 
	 * @param AdminVO - 관리자 등록정보
	 * @return 관리자등록 결과 - String result value 실패 : 0
	 * @throws Exception
	 */
	public String register(AdminVO adminVO) throws Exception;
	
	/**
	 * admin 수정
	 * @param adminVO - 수정할 정보가 담긴 VO
	 * @param status
	 * @return admin 수정결과 - 실패 : 0
	 * @exception Exception
	 */
	public int update(AdminVO adminVO) throws Exception;
	
	// admin 삭제
	public int delete(String adminId) throws Exception;
	
	/**
	 * 아이디 중복 조회
	 * 
	 * @param adminId - id 정보
	 * @param request
	 * @return 중복확인 결과 (inOutMap value - txt1 : id 중복 , txt0 : id 사용가능)
	 * @throws Exception
	 */	
	public Map<String, Object> idCheck (String adminId) throws Exception;
	
	/**
	 * 사원번호 중복 조회
	 * 
	 * @param adminEno - 사원번호를 조회할 정보
	 * @param request
	 * @return 중복확인 결과 (inOutMap value - txt1 : id 중복 , txt0 : id 사용가능)
	 * @throws Exception
	 */	
	public Map<String, Object> enoCheck (String adminEno) throws Exception;


}
