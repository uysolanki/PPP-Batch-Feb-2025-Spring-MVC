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

@Controller
public class PlayerController {

	@Autowired
	PlayerService playerService;
	
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
		model.addAttribute("player",p1);  //backend refer by "p1" front end refer by "player"
		return "player-card";
	}
	
	@RequestMapping("/players")   //localhost:8080/test
	public String players(Model model)
	{		
		List<Player> players =playerService.getPlayers();
		model.addAttribute("players",players);
		return "team-card";
	}
	
	@RequestMapping("/playersUsingModelMap")   //localhost:8080/test
	public String playersUsingModelMap(ModelMap modelmap)
	{		
		List<Player> players =playerService.getPlayers();
		modelmap.addAttribute("players",players);
		return "team-card";
	}
	
	@RequestMapping("/playersUsingModelAndView")   //localhost:8080/test
	public ModelAndView playersUsingModelAndView()
	{		
		ModelAndView mav=new ModelAndView();
		List<Player> players =playerService.getPlayers();
		mav.setViewName("team-card");
		mav.addObject("players",players);
		return mav;
	}
	
	@RequestMapping("/player/{pno}")   //localhost:8080/test
	public String singlePlayer(Model model)
	{		
		Player p1=playerService.getPlayer();
		model.addAttribute("player",p1);
		return "player-card";
	}

}
