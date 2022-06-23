package com.springbook.biz.util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryBean {
	//MyBatis�� ����ϱ� ���ؼ��� SqlSessionFactoryBean �� �����Ǿ� �־�� �Ѵ�.
	
	private static SqlSessionFactory sessionFactory = null;
	
	static {
		try {
			if(sessionFactory== null) {
				Reader reader = Resources.getResourceAsReader("sql-map-confing.xml");
				sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		public static SqlSession getSqlSession() {
			return sessionFactory.openSession();
		}
	}


