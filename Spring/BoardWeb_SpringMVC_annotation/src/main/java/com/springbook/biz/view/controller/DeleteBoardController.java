package com.springbook.biz.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@org.springframework.stereotype.Controller
public class DeleteBoardController {

	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("�� ���� ó��- Spring MVC ������̼� - Controller �и�");
		
		boardDAO.deleteBoard(vo);
		
		return "getBoardList.do";	//redirect �� �̵�
		//return "getBoardList.do" 	 //Forward �� �̵�
	}

}
