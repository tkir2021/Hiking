package com.hiking.member.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{

	//使用自動化命名規則進行條件搜尋
	Member findByMemberId(Integer memberId);
	
	Member findByMemberEmail(String memberEmail);
	
	
}
