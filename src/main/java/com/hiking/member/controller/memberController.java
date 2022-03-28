package com.hiking.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hiking.member.model.Member;
import com.hiking.member.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/member")
@SessionAttributes({"member"})
public class memberController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping(value = "/login")
	public String login() {
		return "member/login";
	}
	
//	@GetMapping(value = "/loginCheck/{memberId}")
//	public void loginCheck(@PathVariable("memberId") Integer id, Model model) {
//		log.info("會員ID：{}", String.valueOf(id));
//		
//	}
	
	@PostMapping(value = "/loginCheck")
	public String loginCheck(@RequestParam String email, @RequestParam String password, Model model) {
		Member member = memberService.findOneByMemberEmail(email);
		String page = "";
		if(member != null && (password).equals(member.getMemberPassword())) {
			log.info("會員登入成功，帳號：{}", member.getMemberEmail());
			model.addAttribute("member", member);
			page = "member/ok";
		} else {
			log.info("會員登入失敗，帳號：{}", email);
			page = "member/error";
		}
		
		return page;
	}
	
}
