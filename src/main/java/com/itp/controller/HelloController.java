package com.itp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itp.model.Player;

@Controller  //always return a string which is the name of the view
@RequestMapping("/ecom") //@RestController  this will return JSON data
public class HelloController {

//	@RequestMapping("/test")   //localhost:8080/test
//	public String test()
//	{
//		return "virat";
//	}
	
//	@RequestMapping("/test")   //localhost:8080/test
//	public String test(Model model)
//	{					//  FE       BE
//		model.addAttribute("celeb","Rohit");
//		return "virat";
//	}
	
//	@RequestMapping("/test")   //localhost:8080/test
//	public String test(Model model)
//	{		
//		String name="Dhoni";
//						//  FE       BE
//		model.addAttribute("celeb",name);
//		return "virat";
//	}
	
	@RequestMapping("/test")   //localhost:8080/test
	public String test(Model model)
	{		
		Player p1=new Player(93,"Jasprit");
						//  FE       BE
		model.addAttribute("celeb",p1);
		return "virat";
	}
}
