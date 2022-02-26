package com.test.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMainClass {

	public static void main(String[] args) {
		
		
		
//		  School sch = new School(); sch.seDateOfOperaion();
		 
		
		
		/*
		 * AnnotationConfigApplicationContext ctx = new
		 * AnnotationConfigApplicationContext( MyConfiguration.class); MyService service
		 * = ctx.getBean(MyService.class);
		 * 
		 * System.out.println("==============Annotation here============== "+service.
		 * getAbc());
		 * 
		 * ctx.close();
		 */
		 
		
			
			  ApplicationContext app = new
			  ClassPathXmlApplicationContext("test-beans.xml");
			  
			  MyService service_1 = app.getBean(MyService.class);
			  
			  System.out.println("==================="+"Beans XML Trainee"
			  +"==============="+service_1.getAbc());
			  Student student= (Student)app.getBean("stud");
			  System.out.println("Student : "+student.getStudentName());
			  
			  AnotherStudent another= (AnotherStudent)app.getBean("another");
			  System.out.println("Student : "+another.getStudentName());
			 
		
	}

}
