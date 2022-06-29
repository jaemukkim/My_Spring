package com.mybatis.join.vo;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class MybatisDAO {

	private SqlSessionTemplate mybatis;
	
	public List<JoinVO> selectiListJoin (JoinVO vo) {
		System.out.println("selectListJoin() �޼ҵ� ȣ��");
		return mybatis.selectList("Join.selectListJoin", vo);
	}
}
