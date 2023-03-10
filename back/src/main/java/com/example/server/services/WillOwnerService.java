package com.example.server.services;

import com.example.server.entities.WillOwnerEntity;
import com.example.server.repositories.WillOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class WillOwnerService {
    @Autowired
    private WillOwnerRepository willOwnerRepository;

    public List<WillOwnerEntity> getWillOwnerEntitiesByPersonId(Long personId){
        return willOwnerRepository.getWillOwnerEntitiesByPersonId(personId);
    }

    public WillOwnerEntity addWillOwner (WillOwnerEntity willOwnerEntity) {

        return willOwnerRepository.save(willOwnerEntity);
    }

    public int updateWillOwner(Integer owner, Long personId, Long willId){
        return willOwnerRepository.updateOwnerLevel(owner, personId, willId);
    }

}
