package com.example.server.repositories;


import com.example.server.entities.DevilFruitsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface DevilFruitRepository extends JpaRepository<DevilFruitsEntity, Long> {
    DevilFruitsEntity getDevilFruitsEntityById(Long id);

    @Query(value = "SELECT *\n" +
            "FROM devil_fruits\n" +
            "Left Join  devil_fruits_owner on devil_fruits.id = devil_fruits_owner.fruit_id\n" +
            "WHERE person_id is null;", nativeQuery = true)
    List<DevilFruitsEntity> getAllDevilFruits();


}
