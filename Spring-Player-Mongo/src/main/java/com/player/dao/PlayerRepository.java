package com.player.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.player.model.Player;

@Repository
public interface PlayerRepository extends MongoRepository<Player,Integer> {
	List<Player> getAllplayer();
	List<Player> getPlayerByState(String state);
	List<Player> getPlayerByAge(Integer age);
	List<Player> getPlayerBySportName(String sportName);
	List<Player> getPlayerByExp(Integer yexperience);
	Player save(Player player);
	

}
