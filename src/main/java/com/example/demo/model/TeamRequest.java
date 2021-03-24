package com.example.demo.model;

import java.util.List;

public class TeamRequest {

	private String teamName;
	private List<Developer> developers;
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public List<Developer> getDevelopers() {
		return developers;
	}
	public void setDevelopers(List<Developer> developers) {
		this.developers = developers;
	}

	
}
