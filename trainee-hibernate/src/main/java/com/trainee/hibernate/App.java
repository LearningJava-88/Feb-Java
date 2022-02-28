package com.trainee.hibernate;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.trainee.hibernate.config.AppConfig;
import com.trainee.hibernate.service.StudentService;

public class App {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentService student = context.getBean("studentService",StudentService.class);
		student.save();
		// Close the context
		context.close();
	}
}