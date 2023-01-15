package com.example.server.repositories;

import com.example.server.entities.DevilFruitsOwnerEntity;
import com.example.server.entities.PeopleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface DevilFruitOwnerRepository extends JpaRepository<DevilFruitsOwnerEntity, Long> {
    DevilFruitsOwnerEntity getDevilFruitsOwnerEntityByPersonId(Long id);
}
