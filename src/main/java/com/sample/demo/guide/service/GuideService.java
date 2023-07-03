package com.sample.demo.guide.service;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.stereotype.Service;

@Service
public class GuideService {
	private static final Logger logger = LogManager.getLogger();
	public void service(){
		logger.info("method test");
	}
}
