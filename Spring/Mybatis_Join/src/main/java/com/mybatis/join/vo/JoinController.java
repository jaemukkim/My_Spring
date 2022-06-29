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
		System.out.println("컨트롤러 호출 성공 : /joinList.do");
		List<JoinVO> joinList = mybatisDAO.selectiListJoin(vo);
		System.out.println("마이바티스를 통한 List객체 저장 성공");
		model.addAttribute("joinList",joinList);
		
		return "joinList.jsp";
	}

}
