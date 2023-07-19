package com.sample.demo.guide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.demo.guide.entity.Member;

@Repository
public interface MemberRepositoryImpl extends JpaRepository<Member, Integer> {
	public List<Member> findByTeamId(int id);
}
