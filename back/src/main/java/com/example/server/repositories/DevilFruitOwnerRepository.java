package com.example.server.repositories;

import com.example.server.entities.DevilFruitsOwnerEntity;
import com.example.server.entities.PeopleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.parser.Entity;
import java.util.List;
@Repository
public interface DevilFruitOwnerRepository extends JpaRepository<DevilFruitsOwnerEntity, Long> {
    @Query(value = "SELECT * FROM devil_fruits_owner where person_id = :id and fruit_id <> 0", nativeQuery = true)
    DevilFruitsOwnerEntity getDevilFruitsOwnerEntityByPersonId(Long id);

    @Query(value = "UPDATE devil_fruits_owner\n" +
            "\n" +
            "            set owner_level = :newLevel\n" +
            "            where person_id = :personId and fruit_id = :fruitId", nativeQuery = true)
    int updateOwnerLevel(Integer newLevel, Long personId, Long fruitId);



    void deleteDevilFruitsOwnerEntitiesByFruitIdAndPersonId(Long fruitId, Long personId);



}
