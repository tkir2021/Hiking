package com.hiking;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hiking.member.model.MemberRepository;
import com.hiking.member.model.MemberVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class HikingApplicationTests {

	@Autowired
	JdbcTemplate jdbcTemplatet;
	@Autowired
	MemberRepository memberRepository;
	
//	Logger Logger = LoggerFactory.getLogger(HikingApplicationTests.class);
	
	//測試資料庫連線
	@Test
	void contextLoads() {
		Long aLong = jdbcTemplatet.queryForObject("select count(*) from member", Long.class);
//		Logger.info("會員數：{}", aLong);
		log.info("會員數：{}", aLong);
		
	}
	
	@Test
	void getMember() {
		log.info("會員資料：{}", memberRepository.findByMemberId(19).toString());
		
	}
}
