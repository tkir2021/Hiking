package com.hiking.member.service;

import org.springframework.stereotype.Service;

import com.hiking.member.model.Member;

public interface MemberService {

	public Member findOneByMemberId(Integer memberId);
	
	public Member findOneByMemberEmail(String memberEmail);
}
