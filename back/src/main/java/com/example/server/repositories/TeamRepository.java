package com.example.server.repositories;

import com.example.server.entities.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface TeamRepository extends JpaRepository<TeamEntity, Long> {
    TeamEntity getTeamEntityById(Long Id);

    @Query(value = "SELECT * FROM team", nativeQuery = true)
    List<TeamEntity> getAllTeams();
}
