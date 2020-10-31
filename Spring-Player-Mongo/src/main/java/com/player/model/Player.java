package com.player.model;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="player")

public class Player {
	@Id
	
	String pName;
	Integer pNumber;
	Integer age;
	String state;
	Sports sports;
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpNumber() {
		return pNumber;
	}
	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Sports getSports() {
		return sports;
	}
	public void setSports(Sports sports) {
		this.sports = sports;
	}



	@Override
	public String toString() {
		return "Player [pName=" + pName + ", pNumber=" + pNumber + ", age=" + age + ", state=" + state + ", sports="
				+ sports + "]";
	}
	
	
	
	
	

}
