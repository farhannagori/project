package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TeamRequest;
import com.example.demo.service.impl.TeamServiceImpl;

@RestController
public class TeamController {

	@Autowired
	private TeamServiceImpl teamServiceImpl;

	@PostMapping(name = "/teams", produces = "application/json", consumes = "application/json", value = "/teams")
	public ResponseEntity<Object> createTeam(@RequestBody TeamRequest teamRequest) {

		return ResponseEntity.ok(teamServiceImpl.createTeam(teamRequest));
	}

}
