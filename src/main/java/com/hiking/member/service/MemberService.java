package com.hiking.member.service;

import org.springframework.stereotype.Service;

import com.hiking.member.model.MemberVO;

public interface MemberService {

	public MemberVO findOneByMemberId(Integer id);
}
