package com.example.server.services;

import com.example.server.entities.DevilFruitTypeEntity;
import com.example.server.repositories.DevilFruitRepository;
import com.example.server.repositories.DevilFruitTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DevilFruitTypeService {
    @Autowired
    private DevilFruitTypeRepository devilFruitTypeRepository;

    public List<DevilFruitTypeEntity> getAllType(){
        return devilFruitTypeRepository.getAllType();
    }

}
