package com.itp.service;

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
	
	

}
