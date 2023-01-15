package com.example.server.repositories;

import com.example.server.entities.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, Long> {
    TeamEntity getTeamEntityById(Long Id);
}
