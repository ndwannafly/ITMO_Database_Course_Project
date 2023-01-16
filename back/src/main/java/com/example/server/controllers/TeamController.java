package com.example.server.controllers;

import com.example.server.POJO.TeamRequest;
import com.example.server.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class TeamController {
    @Autowired
    private TeamService teamService;

    @GetMapping("/team")
    public ResponseEntity<?> getTeam() {
        return ResponseEntity.ok(teamService.getAllTeams());
    }

    @PostMapping("/team/add")
    public ResponseEntity<?> addTeam(@RequestBody TeamRequest request) {
        return ResponseEntity.ok(teamService.addTeam(request));
    }
}
