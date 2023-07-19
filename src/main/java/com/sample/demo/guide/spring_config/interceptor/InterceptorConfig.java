package com.sample.demo.guide.spring_config.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// registry.addInterceptor(new GuideInterceptor());
		registry.addInterceptor(new GuideInterceptor()).excludePathPatterns("/teams/*");
	}
}
