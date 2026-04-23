package com.itp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller  //always return a string which is the name of the view
//@RestController  this will return JSON data
public class HelloController {

	@RequestMapping("/test")   //localhost:8080/test
	public String test()
	{
		//return "virat";
		return "apple";
	}
}
