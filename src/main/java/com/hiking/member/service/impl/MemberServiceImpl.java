package com.hiking.member.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiking.member.model.MemberRepository;
import com.hiking.member.model.Member;
import com.hiking.member.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberRepository memberRepository;
	
	public Member findOneByMemberId(Integer memberId) {
		return memberRepository.findByMemberId(memberId);
	}

	@Override
	public Member findOneByMemberEmail(String memberEmail) {
		return memberRepository.findByMemberEmail(memberEmail);
	}
	
}
