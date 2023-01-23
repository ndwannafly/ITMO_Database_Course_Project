package com.example.server.repositories;

import com.example.server.entities.PirateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PirateRepository extends JpaRepository<PirateEntity, Long> {
    @Query(value = "SELECT * FROM pirate", nativeQuery = true)
    List<PirateEntity> getAll();

    @Query(value = "SELECT id FROM pirate WHERE id = :id", nativeQuery = true)
    List<Long> getPirateIdById(Long id);

    PirateEntity getPirateEntityById( Long id);

    @Query(value = "SELECT *\n" +
            "FROM pirate\n" +
            "WHERE ((SELECT COALESCE(SUM (weapon_owner.owner_level), 0)\n" +
            "FROM weapon_owner\n" +
            "    JOIN people on people.id = weapon_owner.person_id\n" +
            "where pirate.person_id = people.id) + (SELECT COALESCE(SUM (will_owner.owner_level), 0)\n" +
            "                                       FROM will_owner\n" +
            "                                                JOIN people on people.id = will_owner.person_id\n" +
            "                                       where pirate.person_id = people.id) + (SELECT COALESCE(SUM (devil_fruits_owner.owner_level), 0)\n" +
            "                                                                              FROM devil_fruits_owner\n" +
            "                                                                                       JOIN people on people.id = devil_fruits_owner.person_id\n" +
            "                                                                              where pirate.person_id = people.id)) <  :sum", nativeQuery = true)
    List<PirateEntity> getPirateCanDif(Integer sum);




    PirateEntity findTopByOrderByIdDesc();
}
