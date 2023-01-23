package com.example.server.services;

import com.example.server.POJO.WeaponRequest;
import com.example.server.entities.WeaponEntity;
import com.example.server.repositories.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class WeaponService {
    @Autowired
    private WeaponRepository weaponRepository;

    public WeaponEntity getWeaponEntutyById(Long Id){
        return weaponRepository.getWeaponEntityById(Id);
    }


    public List<WeaponEntity> getAllWeapons(){
        return weaponRepository.getAllWeapon();
    }


    public WeaponEntity addWeapon(WeaponRequest weapon) {
        WeaponEntity weaponEntity = new WeaponEntity();
        weaponEntity.setDescription(weapon.getWeaponDesc());
        weaponEntity.setName(weapon.getWeaponName());
        return weaponRepository.save(weaponEntity);
    }
}
