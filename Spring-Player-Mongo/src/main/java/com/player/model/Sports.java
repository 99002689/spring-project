package com.player.model;

import org.springframework.stereotype.Component;


public class Sports {
	String sportName;
	Integer yexperience;
	
	public String getSportName() {
		return sportName;
	}
	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
	public int getYexperience() {
		return yexperience;
	}
	public void setYexperience(int yexperience) {
		this.yexperience = yexperience;
	}
	@Override
	public String toString() {
		return "Sports [sportName=" + sportName + ", yexperience=" + yexperience + "]";
	}
	
	
	
	
	
}
