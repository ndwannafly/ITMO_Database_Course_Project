package com.example.server.services;

import com.example.server.entities.PeopleEntity;
import com.example.server.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {
    @Autowired
    private PeopleRepository peopleRepository;

    public List<PeopleEntity> getPeople(){return peopleRepository.getAll();}

    public PeopleEntity getPeoplesById(Long id){return peopleRepository.getPeopleEntityById(id);}

    public Long getLastPeopleId(){
        return peopleRepository.findTopByOrderByIdDesc().getId();
    }

    public PeopleEntity addPeople (PeopleEntity peopleEntity) {

        return peopleRepository.save(peopleEntity);
    }
}
