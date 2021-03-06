package com.web.mvc.entity;

import javax.persistence.*;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="member") // 테이블명 작성 
public class MemberEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pid;
	
	@Column(nullable = false, unique = true, length = 30)
	private String username;
	
	@Column(nullable = false, length = 100)
	private String name;
	
	public MemberEntity(String username, String name) {
		this.username = username;
		this.name = name;
	}
}
