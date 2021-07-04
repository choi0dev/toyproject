package com.project.toy.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;

import com.project.toy.service.MemberService;

@Controller
public class MemberController {
	@Inject
	MemberService service;
	
	
}
