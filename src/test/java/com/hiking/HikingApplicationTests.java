package com.hiking;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hiking.member.model.MemberRepository;
import com.hiking.member.model.Member;
import com.hiking.member.service.MemberService;
import com.hiking.member.service.impl.MemberServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class HikingApplicationTests {

	@Autowired
	private JdbcTemplate jdbcTemplatet;
	
	
	@Autowired
	private MemberService memberService;
	
//	Logger Logger = LoggerFactory.getLogger(HikingApplicationTests.class);
	
	//測試資料庫連線
	@Test
	public void contextLoads() {
		Long aLong = jdbcTemplatet.queryForObject("select count(*) from member", Long.class);
//		Logger.info("會員數：{}", aLong);
		log.info("會員數：{}", aLong);
	}
	
	//測試Service
	@Test
	public void getMember() {
		log.info("會員資料：{}", memberService.findOneByMemberId(19));
		
	}
}
