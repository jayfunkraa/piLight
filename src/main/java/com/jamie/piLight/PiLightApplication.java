package com.jamie.piLight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class PiLightApplication {

	public static void main(String[] args) {
		SpringApplication.run(PiLightApplication.class, args);
	}

}
