package com.test.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MyConfiguration {

	@Bean
	public MyService getService(){
		
		MyService s = new MyService();
		s.setAbc("ANNOTATED TRAINEE");
		
		return s;
	}
}
