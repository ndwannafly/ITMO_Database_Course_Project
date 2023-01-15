package com.example.server.repositories;

import com.example.server.entities.SentinelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface SentinelRepository extends JpaRepository<SentinelEntity, Long> {
    @Query(value = "SELECT * FROM sentinel", nativeQuery = true)
    List<SentinelEntity> getAll();
}
