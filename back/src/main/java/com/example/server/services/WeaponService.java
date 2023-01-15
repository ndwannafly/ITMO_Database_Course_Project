package com.example.server.services;

import com.example.server.entities.WeaponEntity;
import com.example.server.repositories.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeaponService {
    @Autowired
    private WeaponRepository weaponRepository;

    public WeaponEntity getWeaponEntutyById(Long Id){
        return weaponRepository.getWeaponEntityById(Id);
    }
}
