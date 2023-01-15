package com.example.server.repositories;


import com.example.server.entities.DevilFruitsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevilFruitRepository extends JpaRepository<DevilFruitsEntity, Long> {
    DevilFruitsEntity getDevilFruitsEntityById(Long id);

}
