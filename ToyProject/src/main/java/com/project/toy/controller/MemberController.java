package com.project.toy.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.toy.service.MemberService;
import com.project.toy.vo.MemberVO;

@Controller
public class MemberController {
	@Inject
	MemberService service;
	
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "member/loginForm";
	}
	
	@RequestMapping(value="/loginOk", method=RequestMethod.POST)
	public ModelAndView loginOk(MemberVO vo, HttpSession session) {
		ModelAndView mav=new ModelAndView();
		String logId=service.loginCheck(vo).getUserid();
		
		if(logId!=null) {
			session.setAttribute("logId", logId);
			mav.setViewName("redirect:/");
		}else {
			mav.setViewName("redirect:loginForm");
		}
		
		return mav;
	}
	
	@RequestMapping("/logoutOk")
	public String logouOk(HttpSession session) {
		session.invalidate();
		
		return "home";
	}
	
}
