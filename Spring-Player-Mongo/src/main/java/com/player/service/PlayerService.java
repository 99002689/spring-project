package com.player.service;

import java.util.List;

import com.player.model.Player;

public interface PlayerService {
	Player getplayerbynumber(Integer pNumber);
	Player addplayer(Player player);
	Boolean deleteplayer(Integer pNumber);
	List<Player> getAllplayer();
	List<Player> getPlayerByState(String state);
	List<Player> getPlayerByAge(Integer age);
	List<Player> getPlayerBySportName(String sportName);
	List<Player> getPlayerByExp(Integer yexperience);
	

}
