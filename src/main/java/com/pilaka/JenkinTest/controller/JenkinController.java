package com.pilaka.JenkinTest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinController {
	
	@GetMapping
	public String sayHello() {
		return "Indian Insitute of Technology";
				
	}

}
