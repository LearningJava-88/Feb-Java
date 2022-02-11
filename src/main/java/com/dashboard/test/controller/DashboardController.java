package com.dashboard.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard/v1")
public class DashboardController {

	
	@GetMapping("/getsomething")
	public String getSomething() {
		return "Hello AWS";
	}
	
	
	
}
