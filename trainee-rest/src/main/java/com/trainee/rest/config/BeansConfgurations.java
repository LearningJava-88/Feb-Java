package com.trainee.rest.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfgurations {
	
	@Bean
	public ModelMapper mapper() {
		return new ModelMapper();
	}
}
