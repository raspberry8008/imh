package com.imh.admin.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.imh.admin.dao.AdminDAO;
import com.imh.admin.service.AdminService;
import com.imh.admin.utils.Criteria;
import com.imh.admin.vo.admin.AdminVO;


/**
 * @author : hyeseo
 * @Project : imhAdmin
 * @Date : 2022. 4. 19. 
 */

@Service
public class AdminServiceImpl implements AdminService {
	
	@Inject
	private AdminDAO adminDAO;


	@Override
	public List<AdminVO> list(Criteria cri) throws Exception {
		return adminDAO.list(cri);
	}
	
	@Override
	public int listCount(Criteria cri) throws Exception {
		return adminDAO.listCount(cri);
	}

	@Override 
	public AdminVO getDetail(String adminId) throws Exception {
		return adminDAO.getDetail(adminId);
	}

	@Override 
	public String register(AdminVO adminVO) throws Exception {
		String phone = adminVO.getAdminPhone().replaceAll("(\\d{3})(\\d{3,4})(\\d{4})", "$1-$2-$3");
		adminVO.setAdminPhone(phone);
		adminVO.setAdminAuth("Y");
		adminVO.setAdminState("Y");
		String result = String.valueOf(adminDAO.register(adminVO));
		return result;
	}

	@Override 
	public int update(AdminVO adminVO) throws Exception {
		return adminDAO.update(adminVO);
	}

	@Override // admin 삭제
	public int delete(String adminId) throws Exception {
		return adminDAO.delete(adminId);
	}

	@Override
	public Map<String, Object> idCheck(String adminId) throws Exception {
		Map<String, Object> inOutMap = new HashMap<String, Object>();
		if (adminId!="" || adminId!=null ) {
			String result = adminDAO.idCheck(adminId);
			if (result != null) {
				 if ("1".equals(result)) {
					inOutMap.put(adminId, "txt1");
				} else {
					inOutMap.put(adminId, "txt0");
				} 
			} 		
		}
		return inOutMap;
	}
	
	@Override
	public Map<String, Object> enoCheck(String adminEno) throws Exception {
		Map<String, Object> inOutMap = new HashMap<String, Object>();
		if (adminEno!="" || adminEno!=null ) {
			String result = adminDAO.enoCheck(adminEno);
			if (result != null) {
				if ("1".equals(result)) {
					inOutMap.put(adminEno, "txt1");
				} else {
					inOutMap.put(adminEno, "txt0");
				} 
			} 		
		}
		return inOutMap;
	}

}
