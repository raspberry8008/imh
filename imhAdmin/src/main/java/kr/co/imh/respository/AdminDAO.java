package kr.co.imh.respository;

import java.util.List;
import java.util.Map;

import kr.co.imh.domain.Admin;
import kr.co.imh.utils.Criteria;


/**
 * @author : hyeseo
 * @Project : imhAdmin
 * @Date : 2022. 4. 19. 
 */

public interface AdminDAO {
	
	// admin 로그인
	public Map login(Map<String,Object> map);
	
	// admin 전체목록
	public List<Admin> list(Criteria cri);
	
	// 데이터 전체 갯수
	public int listCount(Criteria cri);
	
	// admin 상세조회
	public Admin getRead(String adminId);
	
	// admin 등록
	public int register(Admin admin);
	
	// admin 수정
	public int modify(Admin admin);
	
	// admin 삭제
	public int delete(String adminId);


}
