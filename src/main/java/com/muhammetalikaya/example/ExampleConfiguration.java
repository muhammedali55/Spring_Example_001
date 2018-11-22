package com.muhammetalikaya.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfiguration {

	@Autowired
	private ExampleProperties exampleProperties;
	
	@PostConstruct
	public void init() {
		System.out.println("Display Owners Değeri....: "+ exampleProperties.isDisplayOwners());
	}
}
