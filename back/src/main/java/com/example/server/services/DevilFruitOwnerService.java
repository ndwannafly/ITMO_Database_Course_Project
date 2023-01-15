package com.example.server.services;

import com.example.server.entities.DevilFruitsOwnerEntity;
import com.example.server.repositories.DevilFruitOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DevilFruitOwnerService {
    @Autowired
    private DevilFruitOwnerRepository devilFruitOwnerRepository;

    public DevilFruitsOwnerEntity getDevilFruitsOwnerByPersonID(Long PersonId) {
        if (devilFruitOwnerRepository.getDevilFruitsOwnerEntityByPersonId(PersonId) != null){
            return devilFruitOwnerRepository.getDevilFruitsOwnerEntityByPersonId(PersonId);
        }
        DevilFruitsOwnerEntity devilFruitsOwnerEntity = new DevilFruitsOwnerEntity(0L, 0L, 0);
        return devilFruitsOwnerEntity;

    }

}
