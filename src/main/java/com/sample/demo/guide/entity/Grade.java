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
@Table(name = "GRADE")
public class Grade {
	@Id
	@Column(name = "name")
	private String name;
	@Column(name = "desc")
	private String desc;

	@Transient
	@OneToMany(mappedBy = "grade")
	List<Member> members;
}
