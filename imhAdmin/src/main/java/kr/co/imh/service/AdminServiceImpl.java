package kr.co.imh.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.imh.domain.Admin;
import kr.co.imh.respository.AdminDAO;
import kr.co.imh.utils.Criteria;


/**
 * @author : hyeseo
 * @Project : imhAdmin
 * @Date : 2022. 4. 19. 
 */

@Service
public class AdminServiceImpl implements AdminService {
	
	@Inject
	private AdminDAO adminDAO;

	@Override // admin 로그인
	public Map login(Map<String, Object> map) {
		return adminDAO.login(map);
	}

	@Override // admin 전체목록
	public List<Admin> list(Criteria cri) {
		return adminDAO.list(cri);
	}
	
	@Override
	public int listCount(Criteria cri) {
		return adminDAO.listCount(cri);
	}

	@Override // admin 상세조회
	public Admin getRead(String adminId) {
		return adminDAO.getRead(adminId);
	}

	@Override // admin 등록
	public int register(Admin admin) {
		return adminDAO.register(admin);
	}

	@Override // admin 수정
	public int modify(Admin admin) {
		return adminDAO.modify(admin);
	}

	@Override // admin 삭제
	public int delete(String adminId) {
		return adminDAO.delete(adminId);
	}

}
