package com.example.server.repositories;

import com.example.server.entities.WeaponOwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface WeaponOwnerRepository extends JpaRepository<WeaponOwnerEntity, Long> {
    @Query(value = "SELECT * FROM weapon_owner where person_id = :personId and weapon_id <> 0", nativeQuery = true)
    WeaponOwnerEntity getWeaponOwnerEntityByPersonId(Long personId);


    @Query(value = "UPDATE weapon_owner\n" +
            "\n" +
            "            set owner_level = :newLevel\n" +
            "            where person_id = :personId and weapon_id = :weaponId", nativeQuery = true)
    int updateOwnerLevel(Integer newLevel, Long personId, Long weaponId);


    void deleteWeaponOwnerEntitiesByWeaponIdAndPersonId( Long weaponId, Long personId);

}
