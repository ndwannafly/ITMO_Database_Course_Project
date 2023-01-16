package com.example.server.repositories;

import java.util.List;
import com.example.server.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepository extends JpaRepository<BaseEntity, Long> {
    @Query(value = "SELECT * FROM base", nativeQuery = true)
    List<BaseEntity> getAllBase();

}
