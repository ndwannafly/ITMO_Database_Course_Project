package com.example.server.services;

import com.example.server.entities.DevilFruitsOwnerEntity;
import com.example.server.entities.WeaponOwnerEntity;
import com.example.server.repositories.WeaponOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeaponOwnerService {
    @Autowired
    private WeaponOwnerRepository weaponOwnerRepository;

    public WeaponOwnerEntity getWeaponOwnerEntityByPersonId(Long personId){
        if (weaponOwnerRepository.getWeaponOwnerEntityByPersonId(personId)!= null){
            return weaponOwnerRepository.getWeaponOwnerEntityByPersonId(personId);}
        else return new WeaponOwnerEntity(0L,0L,0);
    }

    public WeaponOwnerEntity addWeaponOwner (WeaponOwnerEntity weaponOwnerEntity) {

        return weaponOwnerRepository.save(weaponOwnerEntity);
    }
}
