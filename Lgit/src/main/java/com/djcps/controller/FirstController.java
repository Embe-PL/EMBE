package com.djcps.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
@RequestMapping("/demo")
public class FirstController {
	
	
	@RequestMapping("/demo")
	public String exe() {
		
		
		return "hello";
	}
	
}
