package com.springbook.biz.view.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

@Controller
public class UserController {
	
		//1. 로그인 : (GET방식 처리 메소드)
		@RequestMapping( value = "/login.do", method = RequestMethod.GET)
		public String loginView(UserVO vo) {	
		//public String loginView(@ModelAttribute("user")UserVO vo) {
			System.out.println("로그인 처리(GET) - Spring MVC 호출 - Controller 통합");
			vo.setId("admin");
			vo.setPassword("1234");
			return "login.jsp";
			//return "redirect:login.jsp";
			
			//Command 객체에 변수의 값을 담아서 View 페이지로 전송할 수 있다.
			//VO 객체의 클래스 이름은 UserVO, ${userVO.id} 뷰페이지에서 출력을 할수있다.
		/*
		 @ModelAttribute : Command 객체로 던져지는 객체 이름을 다른 이름으로 변경 (UserVO => user)
		 		view 페이지에서 출력시 : ${user.id}, ${user.password}
		  	
		 */
			
		}
		
		//1. 로그인 : (POST방식 처리 메소드)
		@RequestMapping( value = "/login.do", method = RequestMethod.POST)
		public String login(UserVO vo, UserDAO userDAO, HttpSession session) {	
			System.out.println("로그인 처리(POST) - Spring MVC 호출 - Controller 통합");
			
			System.out.println("id : " + vo.getId());
			System.out.println("password : " + vo.getPassword());
			
			UserVO user = userDAO.getUser(vo);
			
			System.out.println(user.getName());
			
			if(user !=null) {
				session.setAttribute("userName", user.getName());
				return "getBoardList.do";
			}else {
				return "login.jsp";
			}
			
		}
		
		//2. 로그아웃 : logout Controller 통합 
		@RequestMapping("/logout.do")
		public String logout(HttpSession session){
			System.out.println("로그 아웃 처리 - Spring MVC 호출 - Controller 통합");
			
			session.invalidate();		
			return "redirect:login.jsp";	
		}

}
