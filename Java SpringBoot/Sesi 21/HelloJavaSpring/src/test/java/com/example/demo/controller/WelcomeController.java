package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping	("/index")
	public String mainHello(){
		return "hello.. belajar Spring Boot nih ges";
	}
}
