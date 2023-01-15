package com.example.server.repositories;

import com.example.server.entities.WillOwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface WillOwnerRepository extends JpaRepository<WillOwnerEntity, Long> {
    List<WillOwnerEntity> getWillOwnerEntitiesByPersonId(Long personId);

}
