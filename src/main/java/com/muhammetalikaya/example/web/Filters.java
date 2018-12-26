package com.muhammetalikaya.example.web;

import java.util.Collections;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Filters {

	@Bean
	public FilterRegistrationBean<TestFilter> FilterLogin() {
		FilterRegistrationBean<TestFilter> filterRegistrationBean = new FilterRegistrationBean<TestFilter>();
	    filterRegistrationBean.setFilter(new TestFilter());
	    filterRegistrationBean.addUrlPatterns("/testFilter/*");
	    filterRegistrationBean.setEnabled(true);
	    return filterRegistrationBean;
	}
}
