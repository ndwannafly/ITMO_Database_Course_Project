package com.example.server.repositories;

import com.example.server.entities.RankingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface RankingRepository extends JpaRepository<RankingEntity, Long> {
    @Query(value = "SELECT * FROM ranking", nativeQuery = true)
    List<RankingEntity> getAllRanking();

    RankingEntity getRankingEntityById(Long id);
}
