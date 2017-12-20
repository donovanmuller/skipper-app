package io.switchbit;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("skipper.test")
public class TestConfigurationProperties {

	/**
	 * A simple test greeting
	 */
	private String greeting = "Hello";

	public String getGreeting() {
		return this.greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}
