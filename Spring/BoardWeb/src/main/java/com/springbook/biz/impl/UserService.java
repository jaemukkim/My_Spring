package com.springbook.biz.impl;

import com.springbook.biz.user.UserVO;

public interface UserService {

	//3. CRUD ����� �޼ҵ� ����
	//ȸ�� ���� �˻� (ID�� password�� �Ű������� �޾Ƽ� ó�� )
	
	void insertUser(UserVO vo);
	
	UserVO getUser(UserVO vo);
	
	
	
}