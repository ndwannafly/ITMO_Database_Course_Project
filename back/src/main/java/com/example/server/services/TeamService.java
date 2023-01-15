package com.example.server.services;

import com.example.server.entities.TeamEntity;
import com.example.server.entities.WillEntity;
import com.example.server.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    public TeamEntity getTeamEntityById(Long id){
        return teamRepository.getTeamEntityById(id);
    }
}
