package com.example.demo.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController {
	
	public String welcome() {
		String msg ="Welcome to BikkadIT ";
		
		return "Welcome";
		
	}

}
