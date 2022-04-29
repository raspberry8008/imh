package kr.co.imh.respository;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kr.co.imh.domain.Admin;
import kr.co.imh.utils.Criteria;

/**
 * @author : hyeseo
 * @Project : imhAdmin
 * @Date : 2022. 4. 19. 
 */

@Component
@Repository
public class AdminDAOImpl implements AdminDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String nameSpace="kr.co.imh.adminMapper";
	
	

	@Override // admin 로그인
	public Map login(Map<String, Object> map) {
		return sqlSession.selectOne(nameSpace + ".login", map);
	}

	@Override // admin 전체목록
	public List<Admin> list(Criteria cri) {
		return  sqlSession.selectList(nameSpace + ".list", cri);
	}
	
	@Override // 데이터 전체 갯수
	public int listCount(Criteria cri) {
		return sqlSession.selectOne(nameSpace + ".listCount", cri);
	}

	@Override // admin 상세조회
	public Admin getRead(String adminId) {
		return sqlSession.selectOne(nameSpace + ".read", adminId);
	}

	@Override // admin 등록
	public int register(Admin admin) {
		return sqlSession.insert(nameSpace + ".register", admin);
	}

	@Override // admin 수정
	public int modify(Admin admin) {
		return sqlSession.update(nameSpace + ".modify" , admin);
	}

	@Override // admin 삭제
	public int delete(String adminId) {
		return sqlSession.update(nameSpace + "delete", adminId);
	}



}
