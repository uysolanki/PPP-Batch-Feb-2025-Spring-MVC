package com.itp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.itp.model.Player;

@Repository
public class PlayerRepository {
	
	public List<Player> getPlayers()  //hard coded values
	{
	List<Player> players=new ArrayList();
	players.add(new Player(1,"Jasprit Bumrah","https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcTGVGPhePFsP69A-6L2v78ZO7jsApa_aEMruEhzLn2knDthmulf8--iopbk6Ppvv56UPaCCzuHMPrEBnSE","He is widely regarded as the greatest fast bowler of his generation. Bumrah became the first bowler to reach the No. 1 position in the ICC Men's Player Rankings"));
	players.add(new Player(2,"Axar Patel","https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcQjiL_M3bXJ6k7f2r7Gaxnthb58a0jr6vphoUIGDNoo5yJ5_VjBvJsbi5Uui8NyQdnbrZC5UmbQmwtTO8bJayuvnCba9dS0Ozq9lNf5eHEJIaeyjMugO1_tYOUWLkuRBUFXvenrUK6Skqc&s=19", "Akshar Rajeshbhai Patel (born 20 January 1994) is an Indian international cricketer.[1] He plays for the Indian national team as an all-rounder in all the three formats. He is a left-handed batter and slow left-arm orthodox bowler. Patel represents Gujarat in domestic cricket and captains Delhi Capitals in the Indian Premier League."));
	players.add(new Player(3,"Suryakumar Yadav", "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcT3qQr3bCqqzZfLpYqkTYKukNAAgJG4dGXhD6tX0BiArqLbIDm0akhf8_V40Js6-cCYXbN4_D41uaVcVoP7TE4jAZEprKk1JJPnyJp_uMeE_mp0n6iUBF6Ddo0AgrluoHxBm5zv_6lBe60i&s=19", "Suryakumar Ashok Yadav, also known by his initials SKY, is an Indian international cricketer who plays as a right-handed middle-order batter. He represents the India national cricket team and captains the Twenty20 International team, a role he held as India won the 2026 Men's T20 World Cup and the 2025 Asia Cup."));
	players.add(new Player(4,"Hardik Pandya", "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcQ0LIJOYIR8-C_bZkg-1H4Ipmwt3qOxuxUMkdlWsJQ5NdXB9f7fHQo-lx483Wp1wQcGPuecB_TaZpnaED3GuV0_md0XojJFQ2PqZ6-c6_Qo_yTQI-NR2UaNmfoSKuyZkbJj6BQtpzR2yb-7&s=19", "Hardik Himanshu Pandya is an Indian international cricketer who plays for the Indian cricket team. He is an all-rounder who is a right-handed middle order batsman and fast-medium bowler. He is considered one of the best all-rounders in the world in white-ball cricket.")); 
	players.add(new Player(5,"Sanju Samson", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStLQ9KCQz9xcvILQbhgiKfT1tXgumHDZoy2w9Ku3EztXf6rPwuwcSKDZinLjMCBUO2QuMeVqzNf3VFtXUm2tPdWtj5xtfxP3_5p8MU-nB0&s=10", "Sanju Viswanath Samson is an Indian cricketer who plays for the India national cricket team in the ODI and T20I formats. He was part of the 2024 and 2026 T20 world cup winning teams, including a Player of the Tournament performance in 2026.")); 
	players.add(new Player(6,"Shivam Dube", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCQPbrmLvCdCYGD8XsHPE8-jBGhv96E6AggfMzeIVztqaxKT82oUKnXhvLsImKOe67AfaNxQCiVme-o7AO5DhQ1yzHPVEd8ioxOUCsZ99C&s=10", "Shivam Dube is an Indian international cricketer. He plays for the India national team as an all-rounder, who bats left-handed and bowls right-arm medium fast. He represents Mumbai in domestic cricket and Chennai Super Kings in the Indian Premier League."));
	return players;
	}

	public Player getPlayer()  //hardcoded player
	{
		Player p1=new Player(6,"Jassi","https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcTGVGPhePFsP69A-6L2v78ZO7jsApa_aEMruEhzLn2knDthmulf8--iopbk6Ppvv56UPaCCzuHMPrEBnSE","He is widely regarded as the greatest fast bowler of his generation. Bumrah became the first bowler to reach the No. 1 position in the ICC Men's Player Rankings");		
		return p1;
	}
}
