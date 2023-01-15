package com.example.server.repositories;

import com.example.server.entities.PirateTeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PirateTeamRepository extends JpaRepository<PirateTeamEntity, Long> {
    PirateTeamEntity getPirateTeamEntityByPirateId(Long pirateId);
}
