package com.hiking.member.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberVO, Long>{

	//使用自動化命名規則進行條件搜尋
	MemberVO findByMemberId(Integer memberId);
	
	
	
	
}
