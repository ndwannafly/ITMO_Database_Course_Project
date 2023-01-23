package com.example.server.services;

import java.util.List;

import com.example.server.entities.BaseEntity;
import com.example.server.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseService {

    @Autowired
    private BaseRepository baseRepository;

    public List<BaseEntity> getAllBase(){
        return baseRepository.getAllBase();
    }

    public BaseEntity getBaseEntityById(Long id){
        return baseRepository.getBaseEntityById(id);
    }
}
