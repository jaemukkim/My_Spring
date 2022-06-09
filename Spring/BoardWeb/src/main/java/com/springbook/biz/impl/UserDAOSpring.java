package com.springbook.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springbook.biz.user.UserVO;

@Repository("userDAOSpring")
public class UserDAOSpring {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	
	private String USER_GET = "select * from users where id = ? and password = ?";
	private String USER_INSERT = "insert into users (ID, NAME, PASSWORD, ROLE)"
									+ " values (?, ?, ?, ?)";
	
	//글 상세 목록 출력
	public UserVO getUser(UserVO vo) {
		System.out.println("Spring JDBC로 처리");
		Object[] args = {vo.getId()};
		return jdbcTemplate.queryForObject(USER_GET, args, new UserRowMapper());
	}
	
	//글 등록
	public void insertUser(UserVO vo) {
		System.out.println("Spring JDBC로 처리");
		jdbcTemplate.update(USER_INSERT, vo.getId(), vo.getName());
	}
	
	
	
}
