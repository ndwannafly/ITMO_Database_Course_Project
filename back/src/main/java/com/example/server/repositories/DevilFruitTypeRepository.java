package com.example.server.repositories;

import com.example.server.entities.DevilFruitTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface DevilFruitTypeRepository extends JpaRepository<DevilFruitTypeEntity, Long> {

    @Query(value = "SELECT * FROM devil_fruits_type", nativeQuery = true)
    List<DevilFruitTypeEntity> getAllType();

}
