package com.sample.demo.guide.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.demo.guide.entity.Team;

@Repository
public interface TeamRepositoryImpl extends JpaRepository<Team, Integer> {
}
