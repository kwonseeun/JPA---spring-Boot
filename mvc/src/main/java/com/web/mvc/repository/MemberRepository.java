package com.web.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.mvc.entity.MemberEntity;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long>{

}
