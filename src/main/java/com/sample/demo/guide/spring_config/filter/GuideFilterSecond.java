package com.sample.demo.guide.spring_config.filter;

import java.io.IOException;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import lombok.extern.log4j.Log4j2;

// @WebFilter(urlPatterns = "/teams/*")
@Log4j2
@Order(2)
@Component
public class GuideFilterSecond implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		log.info("The Second filter works");
		chain.doFilter(request, response);
		log.info("The Second filter works");
		// throw new UnsupportedOperationException("Unimplemented method 'doFilter'");
	}

}
