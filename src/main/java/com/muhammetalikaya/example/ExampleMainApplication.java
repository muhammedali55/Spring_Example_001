package com.muhammetalikaya.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
@EnableConfigurationProperties(value=ExampleProperties.class)
public class ExampleMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleMainApplication.class, args);

	}

}
