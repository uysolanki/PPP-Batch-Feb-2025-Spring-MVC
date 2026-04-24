package com.itp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itp.model.Player;
import com.itp.service.PlayerService;

@Controller  //always return a string which is the name of the view
@RequestMapping("/ipl") //@RestController  this will return JSON data
public class HelloController {

	@Autowired
	PlayerService playerService;
	
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
	
//	@RequestMapping("/player")   //localhost:8080/test
//	public String test(Model model)
//	{		
//		Player p1=new Player("Jasprit Bumrah","https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcTGVGPhePFsP69A-6L2v78ZO7jsApa_aEMruEhzLn2knDthmulf8--iopbk6Ppvv56UPaCCzuHMPrEBnSE","He is widely regarded as the greatest fast bowler of his generation. Bumrah became the first bowler to reach the No. 1 position in the ICC Men's Player Rankings");
//						//  FE       BE
//		model.addAttribute("player",p1);
//		return "player-card";
//	}
	
	
	@RequestMapping("/player")   //localhost:8080/test
	public String player(Model model)
	{		
		Player p1=playerService.getPlayer();
		model.addAttribute("player",p1);
		return "player-card";
	}
}
