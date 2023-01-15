package com.example.server.repositories;

import com.example.server.entities.PeopleEntity;
import com.example.server.entities.PirateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<PeopleEntity, Long> {
    @Query(value = "SELECT * FROM people", nativeQuery = true)
    List<PeopleEntity> getAll();

    @Query
    PeopleEntity getPeopleEntityById(Long id);


}
