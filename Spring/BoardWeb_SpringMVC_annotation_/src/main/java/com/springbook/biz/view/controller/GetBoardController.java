package com.springbook.biz.view.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@org.springframework.stereotype.Controller
public class GetBoardController {

	@RequestMapping ("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글 상세 조회 처리- Spring MVC 호출 - Controller 분리");
		
		mav.addObject("board", boardDAO.getBoard(vo));
		 mav.setViewName("getBoard.jsp");
		 return mav; 
		
		
	}

}
