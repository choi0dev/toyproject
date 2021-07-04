package com.project.toy.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.project.toy.dao.MemberDAO;
import com.project.toy.vo.MemberVO;

@Service
public class MemberServiceImp implements MemberService {
	@Inject
	MemberDAO dao;
	
	@Override
	public MemberVO loginCheck(MemberVO vo) {
		return dao.loginCheck(vo);
	}

}
