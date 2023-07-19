package com.sample.demo.guide.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "MEMBER")
public class Member {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;

	@JoinColumn(name = "grade")
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = Grade.class)
	private Grade grade;

	@JoinColumn(name = "team")
	@ManyToOne(targetEntity = Team.class)
	private Team team;

	@Column(name = "email")
	private String email;
	@Column(name = "phone")
	private String phone;
	@Column(name = "work")
	private String work;
}
