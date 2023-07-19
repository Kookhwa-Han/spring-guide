package com.sample.demo.guide.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TEAM")
public class Team {
	@Id
	@Column(name = "id")
	private int id;

	@Transient
	@OneToMany(mappedBy = "team")
	private List<Member> members;

	@Column(name = "name")
	private String name;
	@Column(name = "leader")
	private int leader;
	@Column(name = "leader_name")
	private String leaderName;
}
