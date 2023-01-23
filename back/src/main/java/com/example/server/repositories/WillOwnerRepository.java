package com.example.server.repositories;

import com.example.server.entities.WillOwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
public interface WillOwnerRepository extends JpaRepository<WillOwnerEntity, Long> {
    List<WillOwnerEntity> getWillOwnerEntitiesByPersonId(Long personId);

    @Query(value = "UPDATE will_owner\n" +
            "\n" +
            "            set owner_level = :newLevel\n" +
            "            where person_id = :personId and will_id = :willId", nativeQuery = true)
    int updateOwnerLevel(Integer newLevel, Long personId, Long willId);

    void deleteWillOwnerEntitiesByWillIdAndPersonId(Integer willId, Long personId);

}
