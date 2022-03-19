package com.hiking.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiking.member.model.MemberRepository;
import com.hiking.member.model.MemberVO;
import com.hiking.member.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberRepository memberRepository;
	
	public MemberVO findOneByMemberId(Integer id) {
		return memberRepository.findByMemberId(id);
	}
	
}
