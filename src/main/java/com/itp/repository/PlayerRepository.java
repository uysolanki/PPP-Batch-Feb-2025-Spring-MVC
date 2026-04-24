package com.itp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.itp.model.Player;

@Repository
public class PlayerRepository {
	
	public List<Player> getPlayers()
	{
	List<Player> players=new ArrayList();
	players.add(new Player("Jasprit Bumrah","https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcTGVGPhePFsP69A-6L2v78ZO7jsApa_aEMruEhzLn2knDthmulf8--iopbk6Ppvv56UPaCCzuHMPrEBnSE","He is widely regarded as the greatest fast bowler of his generation. Bumrah became the first bowler to reach the No. 1 position in the ICC Men's Player Rankings"));
	
	return players;
	}

	public Player getPlayer() {
		Player p1=new Player("Jassi","https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcTGVGPhePFsP69A-6L2v78ZO7jsApa_aEMruEhzLn2knDthmulf8--iopbk6Ppvv56UPaCCzuHMPrEBnSE","He is widely regarded as the greatest fast bowler of his generation. Bumrah became the first bowler to reach the No. 1 position in the ICC Men's Player Rankings");		
		return p1;
	}
}
