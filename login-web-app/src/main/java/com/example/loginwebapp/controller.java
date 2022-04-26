package com.example.loginwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class controller {
	@RequestMapping(value="/test0",method=RequestMethod.GET)
	public String hello() {
		return "login";
	}

}
