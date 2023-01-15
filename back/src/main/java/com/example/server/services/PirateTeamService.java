package com.example.server.services;

import com.example.server.entities.PirateTeamEntity;
import com.example.server.repositories.PirateRepository;
import com.example.server.repositories.PirateTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PirateTeamService {
    @Autowired
    private PirateTeamRepository pirateTeamRepository;

    public PirateTeamEntity getPirateTeamEntityByPirateId(Long pirateId){
        return pirateTeamRepository.getPirateTeamEntityByPirateId(pirateId);
    }

}
