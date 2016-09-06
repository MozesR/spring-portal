package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

	@RequestMapping("/")
	public String Home(){
		return "Welcome";
	}
	
	@RequestMapping("/about")
	public String About(){
		return "About";
	}
	@RequestMapping("/download")
	public String Download(){
		return "Download app";
	}
	
	@RequestMapping("/contact")
	public String Contact(){
		return "Contact";
	}
}
