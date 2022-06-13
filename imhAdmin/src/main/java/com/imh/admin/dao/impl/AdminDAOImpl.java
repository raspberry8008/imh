package com.imh.admin.dao.impl;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.imh.admin.dao.AdminDAO;
import com.imh.admin.utils.Criteria;
import com.imh.admin.vo.admin.AdminVO;


@Repository
public class AdminDAOImpl implements AdminDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String nameSpace="com.imh.admin.adminMapper";
	

	@Override // admin 전체목록
	public List<AdminVO> list(Criteria cri) {
		return  sqlSession.selectList(nameSpace + ".adminlistAll", cri);
	}
	
	@Override // 데이터 전체 갯수
	public int listCount(Criteria cri) {
		return sqlSession.selectOne(nameSpace + ".listCount", cri);
	}

	@Override 
	public AdminVO getDetail(String adminId) {
		return sqlSession.selectOne(nameSpace + ".getDetail", adminId);
	}

	@Override
	public int register(AdminVO adminVO) {
		return sqlSession.insert(nameSpace + ".register", adminVO);
	}

	@Override
	public int update(AdminVO adminVO) {
		return sqlSession.update(nameSpace + ".update" , adminVO);
	}

	@Override // admin 삭제
	public int delete(String adminId) {
		return sqlSession.update(nameSpace + "delete", adminId);
	}

	@Override
	public String idCheck(String adminId) throws Exception {
		return sqlSession.selectOne(nameSpace + ".idCheck", adminId);
	}
	
	@Override
	public String enoCheck(String adminEno) throws Exception {
		return sqlSession.selectOne(nameSpace + ".enoCheck", adminEno);
	}



}
