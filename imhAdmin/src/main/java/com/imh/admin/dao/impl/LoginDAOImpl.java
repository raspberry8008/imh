package com.imh.admin.dao.impl;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.imh.admin.dao.LoginDAO;
import com.imh.admin.vo.admin.LoginVO;

@Repository
public class LoginDAOImpl implements LoginDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String nameSpace="com.imh.admin.LoginMapper";
	

	@Override
	public String adminCheck(Map<String, Object> inMap) throws Exception {
		return sqlSession.selectOne(nameSpace+ ".adminCheck", inMap);
	}


	@Override
	public LoginVO adminSelectOne(Map<String,Object> inMap) throws Exception {
		return sqlSession.selectOne(nameSpace+ ".adminSelectOne", inMap);
	}

}
