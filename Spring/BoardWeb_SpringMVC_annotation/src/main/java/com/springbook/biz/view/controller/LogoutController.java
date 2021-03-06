package com.springbook.biz.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LogoutController {

	@RequestMapping("/logout.do")
	public String logout(HttpSession session){
		System.out.println("로그 아웃 처리 - Spring MVC 호출 - Controller 분리");
		
		session.invalidate();
		
		return "redirect:login.jsp";
		
		
	
	}

}
