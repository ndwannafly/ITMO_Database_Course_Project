package com.example.server.services;

import com.example.server.entities.DevilFruitsEntity;
import com.example.server.repositories.DevilFruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DevilFruitService {
    @Autowired
    private DevilFruitRepository devilFruitRepository;

    public DevilFruitsEntity getDevilFruitById(Long Id){
        return devilFruitRepository.getDevilFruitsEntityById(Id);
    }

    public List<DevilFruitsEntity> getAllDevilFruits(){
        return devilFruitRepository.getAllDevilFruits();
    }
}
