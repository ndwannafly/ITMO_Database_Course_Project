package com.example.server.services;

import com.example.server.entities.SentinelEntity;
import com.example.server.repositories.SentinelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class SentinelService {
    @Autowired
    private SentinelRepository sentinelRepository;

    public List<SentinelEntity> getAll(){
        return sentinelRepository.getAll();
    }
}
