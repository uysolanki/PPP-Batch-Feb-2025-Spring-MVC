package com.itp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itp.model.Player;
import com.itp.repository.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	PlayerRepository playerRepository;

	public Player getPlayer() {
		return playerRepository.getPlayer();
	}

	public List<Player> getPlayers() {
		return playerRepository.getPlayers();
	}
	
	

}
