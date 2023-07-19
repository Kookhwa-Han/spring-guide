package com.sample.demo.guide.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.sample.demo.guide.entity.Member;
import com.sample.demo.guide.repository.MemberRepositoryImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@RequiredArgsConstructor
public class GuideService {
	private final MemberRepositoryImpl guideRepository;

	public void service() {
		log.info("method test");
	}

	// public List<Member> findByTeam(int Id) {
	// return guideRepository.findByTeam(Id);
	// }

	public List<Member> findByTeam(int id) {
		return guideRepository.findByTeamId(id);
	}
}
