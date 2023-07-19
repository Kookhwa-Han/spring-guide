package com.sample.demo.guide.spring_config.AOP;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Aspect
@Component
public class GuidAspect {

	@Before("@annotation(GuideTime)")
	public void guideAnnotation(JoinPoint pjp) throws Throwable {
		log.info("now : " +
				LocalDateTime.now());
	}

}
