package com.example.server.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.server.entities.PirateEntity;
import com.example.server.repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PirateService {
    @Autowired
    private PirateRepository pirateRepository;

    public Map<Long, String> getPirateByID(Long id) {
        Map<Long, String> result = new HashMap<>();
        List<Long> list = pirateRepository.getPirateIdById(id);
        list.forEach(o -> result.put(o, pirateRepository.getPirateEntityById(id).getPersonId().toString()));
        return result;
    }

    public List<PirateEntity> getPirate(){
        return pirateRepository.getAll();
    }


}
