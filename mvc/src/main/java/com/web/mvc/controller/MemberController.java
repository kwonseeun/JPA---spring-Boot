package com.web.mvc.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.mvc.entity.MemberEntity;
import com.web.mvc.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@RestController // JSON 형태 결과값 반환 
@RequiredArgsConstructor // final 객체를 Constructor Injection 해준다 
@RequestMapping("/v1") // version1 API
public class MemberController {
	
	private final MemberRepository memberRepository;
	
	/**
	 * 멤버조회
	 * @return
	 * */
	@GetMapping("member")
	public List<MemberEntity> findAllMember(){
		return memberRepository.findAll();
	}
	
	/**
	 * 회원가입 
	 * @return
	 * */
	@PostMapping("member")
	public MemberEntity signUp() {
		final MemberEntity member = MemberEntity.builder()
						.username("kwon@gmail.com")
						.name("kwon")
						.build();
		return memberRepository.save(member);
	}
	
	

}
