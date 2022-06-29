package com.mybatis.join.vo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JoinController {
	
	@Autowired
	private MybatisDAO mybatisDAO;
	
	@RequestMapping ("/joinList.do")
	public String selectList (JoinVO vo, Model model) {
		System.out.println("��Ʈ�ѷ� ȣ�� ���� : /joinList.do");
		List<JoinVO> joinList = mybatisDAO.selectiListJoin(vo);
		System.out.println("���̹�Ƽ���� ���� List��ü ���� ����");
		model.addAttribute("joinList",joinList);
		
		return "joinList.jsp";
	}

}
