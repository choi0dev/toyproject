package com.project.toy.dao;

import com.project.toy.vo.MemberVO;

public interface MemberDAO {
	// 로그인
	public MemberVO loginCheck(MemberVO vo);
}
