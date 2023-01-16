package com.example.server.services;

import com.example.server.entities.RankingEntity;
import com.example.server.repositories.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class RankingService {
    @Autowired
    private RankingRepository rankingRepository;

    public List<RankingEntity> getAllRankings(){
        return rankingRepository.getAllRanking();
    }
}
