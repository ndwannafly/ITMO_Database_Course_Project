package com.example.server.repositories;

import com.example.server.entities.WeaponEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeaponRepository extends JpaRepository<WeaponEntity, Long> {
    WeaponEntity getWeaponEntityById(Long Id);
}
