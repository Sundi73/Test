package com.taraining.demoSpring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testControllerSimple {
	
	@RequestMapping("/hello")
	public String test() {
		
		return "<h1>Spring boot application using spring initialzer</h1>";
		
	}

}
