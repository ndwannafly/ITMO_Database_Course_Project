package com.example.server.repositories;

import com.example.server.entities.WeaponOwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponOwnerRepository extends JpaRepository<WeaponOwnerEntity, Long> {
    WeaponOwnerEntity getWeaponOwnerEntityByPersonId(Long personId);

}
