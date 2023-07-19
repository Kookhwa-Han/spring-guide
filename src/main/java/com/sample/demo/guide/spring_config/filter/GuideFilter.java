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

@Log4j2
@Component
@Order(1)
public class GuideFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		log.info("A filter works before controller");
		chain.doFilter(request, response);
		log.info("A filter works after controller");
		// throw new UnsupportedOperationException("Unimplemented method 'doFilter'");

	}

}
