package com.sample.demo.guide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.demo.guide.entity.Member;
import com.sample.demo.guide.service.GuideService;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/teams")
public class GuideController {
	@Autowired
	Environment environment;
	@Autowired
	GuideService service;

	@GetMapping("/{id}")
	public ResponseEntity<List<Member>> getTeam(@PathVariable("id") int id) {
		return ResponseEntity.ok().body(service.findByTeam(id));
	}

	@GetMapping()
	public ResponseEntity<String> guide() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		Test sample = new Test("테스트", 404);
		String jsonString = objectMapper.writeValueAsString(sample);
		log.info("test : {}", sample);
		return ResponseEntity.ok(jsonString);
	}

}

@Getter
class Test {
	private String field1;
	private int field2;

	public Test(String field1, int field2) {
		this.field1 = field1;
		this.field2 = field2;
	}

	@Override
	public String toString() {
		return "{\"field1\":\"" + field1 + "\", \"field2\":" + field2 + "}";
	}

}