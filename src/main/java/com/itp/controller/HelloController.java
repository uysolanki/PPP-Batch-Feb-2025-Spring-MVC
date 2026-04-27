package com.itp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itp.model.Player;
import com.itp.service.PlayerService;

@Controller  //always return a string which is the name of the view
@RequestMapping("/ipl") //@RestController  this will return JSON data
public class HelloController {


	
//	public HelloController(PlayerService playerService)
//	{
//		this.playerService=playerService;
//	}
	
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
	
//	@RequestMapping("/test")   //localhost:8080/test
//	public String test(Model model)
//	{		
//		Player p1=new Player(93,"Jasprit");
//						//  FE       BE
//		model.addAttribute("celeb",p1);
//		return "virat";
//	}
	
}
