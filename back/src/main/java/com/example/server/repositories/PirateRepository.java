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





    PirateEntity findTopByOrderByIdDesc();
}
