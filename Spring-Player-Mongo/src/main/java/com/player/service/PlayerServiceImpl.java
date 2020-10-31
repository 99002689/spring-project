package com.player.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.player.dao.PlayerRepository;
import com.player.model.Player;
@Service
public class PlayerServiceImpl implements PlayerService {
	@Autowired
	PlayerRepository playerRepository;

	@Override
	public Player getplayerbynumber(Integer pNumber) {
		return playerRepository.getplayerbynumber(pNumber);
		
	}

	@Override
	public Player addplayer(Player player) {
		Player newPlayer=playerRepository.save(player);
		return newPlayer;
	}

	@Override
	public Boolean deleteplayer(Integer pNumber) {
		
		playerRepository.deleteplayer(pNumber);
	}

	@Override
	public List<Player> getAllplayer() {
		
		return playerRepository.getAllplayer();
	}

	@Override
	public List<Player> getPlayerByState(String state) {
		return playerRepository.getPlayerByState(state);
	}

	@Override
	public List<Player> getPlayerByAge(Integer age) {
		return playerRepository.getPlayerByAge(age);
	}

	@Override
	public List<Player> getPlayerBySportName(String sportName) {
		return playerRepository.getPlayerBySportName(sportName);
	}

	@Override
	public List<Player> getPlayerByExp(Integer yexperience) {
		return playerRepository.getPlayerByExp(yexperience);
	}

}
