package com.example.ademo.config;

import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Random random() { 
		Random randomObj = new Random();
		System.out.println("AppConfig ||random() invoked||hashCode:" + randomObj.hashCode());
		return randomObj;
	}

}
