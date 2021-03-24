package com.example.demo.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Developer;
import com.example.demo.entity.Team;
import com.example.demo.model.TeamRequest;
import com.example.demo.repo.DeveloperRepository;
import com.example.demo.repo.TeamRepository;

@Service
public class TeamServiceImpl {

	@Autowired
	private TeamRepository teamRepository;
	@Autowired
	private DeveloperRepository developerRepository;

	public ResponseEntity<Object> createTeam(TeamRequest teamRequest) {

		Developer developer = new Developer();
		Team team = new Team();
		team.setName(teamRequest.getTeamName());
		team.setId(UUID.randomUUID().toString());
		teamRepository.save(team);
		teamRequest.getDevelopers().forEach(dev -> {
			developer.setId(UUID.randomUUID().toString());
			developer.setName(dev.getName());
			developer.setPhoneNumber(dev.getPhonNumber());

			developer.setTeamId(team);
			developerRepository.save(developer);

		});

		return ResponseEntity.ok("Team has created");
	}

}
