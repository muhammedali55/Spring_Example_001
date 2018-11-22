package com.muhammetalikaya.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="example")
public class ExampleProperties {
	private boolean displayOwners = false;

	public boolean isDisplayOwners() {
		return displayOwners;
	}

	public void setDisplayOwners(boolean displayOwners) {
		this.displayOwners = displayOwners;
	}
	
	
}
