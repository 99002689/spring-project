package com.player.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.player.model.Player;
import com.player.service.PlayerService;
@RestController
@RequestMapping("/player-api")
public class PlayerResponseController {
	@Autowired
	PlayerService playerservice;
	@PostMapping("/players")
	Player addplayer(@RequestBody Player player)
	{
		return playerservice.addplayer(player);
	}
	@GetMapping("/players")
   List<Player> getAllPlayers()
   {
		return playerservice.getAllplayer();  
   }
	@DeleteMapping("/players/delete-one/{pNumber}")
	boolean deletePlayer(@PathVariable("pNumber")Integer pNumber)
	{
		return playerservice.deleteplayer(pNumber);
	}
	@GetMapping("/players/get-one/{pNumber}")
	Player getPlayerBypNumber(@PathVariable("pNumber")Integer pNumber)
	{
		return playerservice.getplayerbynumber(pNumber);
	}
	@GetMapping("/players/get-one/{sportName}")
	List<Player> getPlayerBySportName(@PathVariable("sportName")String sportName)
	{
		return playerservice.getPlayerBySportName(sportName);
	}
	@GetMapping("/players/get-one/{yexperience}")
	List<Player> getPlayerByExp(@PathVariable("yexperience")Integer yexperience) 
		{
		return playerservice.getPlayerByExp(yexperience);
		}
		@GetMapping("/players/get-one/{age}")
		 List<Player> getPlayerByAge(@PathVariable("age")Integer age)
		
		
			{
			return playerservice.getPlayerByAge(age);
		}
		@GetMapping("/players/get-one/{state}")
		 List<Player> getPlayerByState(@PathVariable("state")String state)
		
		
			{
			return playerservice.getPlayerByState(state);
		}
		
			
		
			
		

}
