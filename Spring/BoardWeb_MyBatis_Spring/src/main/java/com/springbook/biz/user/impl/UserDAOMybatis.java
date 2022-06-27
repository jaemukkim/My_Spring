package com.springbook.biz.user.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.user.UserVO;

@Repository
public class UserDAOMybatis {
	
	@Autowired
	private SqlSessionTemplate mybatis; // mybatis :1. db, 2. mapper

	public void insertUser(UserVO vo) {
		System.out.println("Mybatis를 사용해서 insertUser() 메소드 호출됨");
		
		System.out.println(vo.getId());
		System.out.println(vo.getName());
		System.out.println(vo.getPassword());
		System.out.println(vo.getRole());
		
		
		
		mybatis.insert("UserDAO.insertUser", vo);
	}
	public void updateUser(UserVO vo) {
		System.out.println("Mybatis를 사용해서 updateUser() 메소드 호출됨");
		mybatis.insert("UserDAO.updateUser", vo);
	}
	public void deleteUser(UserVO vo) {
		System.out.println("Mybatis를 사용해서 deleteUser() 메소드 호출됨");
		mybatis.delete("UserDAO.deleteUser", vo);
	}
	public UserVO getUser(UserVO vo) {
		System.out.println("Mybatis를 사용해서 getUser() 메소드 호출됨");
		return (UserVO) mybatis.selectOne("UserDAO.getUser", vo);
	}
	public List<UserVO> getUserList(UserVO vo){
		System.out.println("Mybatis를 사용해서 getUserList() 메소드 호출됨");
		return mybatis.selectList("UserDAO.getUserList", vo);
	}
}
