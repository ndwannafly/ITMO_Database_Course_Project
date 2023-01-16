package com.example.server.repositories;

import com.example.server.entities.WeaponEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface WeaponRepository extends JpaRepository<WeaponEntity, Long> {

    @Query(value = "SELECT * FROM weapon", nativeQuery = true)

    List<WeaponEntity> getAllWeapon();


    WeaponEntity getWeaponEntityById(Long Id);

}
