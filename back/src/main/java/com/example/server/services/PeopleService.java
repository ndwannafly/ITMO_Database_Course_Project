package com.example.server.services;

import com.example.server.POJO.SentinelRequest;
import com.example.server.POJO.UpdateOwnerRequest;
import com.example.server.entities.DevilFruitsOwnerEntity;
import com.example.server.entities.PeopleEntity;
import com.example.server.entities.WeaponOwnerEntity;
import com.example.server.entities.WillOwnerEntity;
import com.example.server.repositories.DevilFruitOwnerRepository;
import com.example.server.repositories.PeopleRepository;
import com.example.server.repositories.WeaponOwnerRepository;
import com.example.server.repositories.WillOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PeopleService {
    @Autowired
    private PeopleRepository peopleRepository;

    @Autowired
    private DevilFruitOwnerRepository devilFruitOwnerRepository;

    @Autowired
    private WeaponOwnerRepository weaponOwnerRepository;

    @Autowired
    private WillOwnerRepository willOwnerRepository;


    public List<PeopleEntity> getPeople(){return peopleRepository.getAll();}

    public PeopleEntity getPeoplesById(Long id){return peopleRepository.getPeopleEntityById(id);}

    public Long getLastPeopleId(){
        return peopleRepository.findTopByOrderByIdDesc().getId();
    }

    public PeopleEntity addPeople (PeopleEntity peopleEntity) {

        return peopleRepository.save(peopleEntity);
    }

    @Transactional
    public boolean  updateOwner(UpdateOwnerRequest updateOwnerRequest){

        Long personId = Long.valueOf(updateOwnerRequest.getPeopleId());
        Long fruitId = Long.valueOf(updateOwnerRequest.getFruitId());
        Long weaponId = Long.valueOf(updateOwnerRequest.getWeaponId());

        if (updateOwnerRequest.getFruitOwnerLevel() != null){
        devilFruitOwnerRepository.deleteDevilFruitsOwnerEntitiesByFruitIdAndPersonId(fruitId,personId);
        DevilFruitsOwnerEntity devilFruitsOwnerEntity = new DevilFruitsOwnerEntity();
        devilFruitsOwnerEntity.setFruitId(fruitId);
        devilFruitsOwnerEntity.setPersonId(personId);
        devilFruitsOwnerEntity.setOwnerLevel(updateOwnerRequest.getFruitOwnerLevel());

        devilFruitOwnerRepository.save(devilFruitsOwnerEntity);}

        if (updateOwnerRequest.getWeaponOwnerLevel() != null){
        weaponOwnerRepository.deleteWeaponOwnerEntitiesByWeaponIdAndPersonId(weaponId, personId);
        WeaponOwnerEntity weaponOwnerEntity = new WeaponOwnerEntity();
        weaponOwnerEntity.setWeaponId(weaponId);
        weaponOwnerEntity.setPersonId(personId);
        weaponOwnerEntity.setOwnerLavel(updateOwnerRequest.getWeaponOwnerLevel());

        weaponOwnerRepository.save(weaponOwnerEntity);}

        if (updateOwnerRequest.getWillOfArmsLevel() != null){
        willOwnerRepository.deleteWillOwnerEntitiesByWillIdAndPersonId(1, personId);
        WillOwnerEntity willOwnerEntity1 = new WillOwnerEntity();
        willOwnerEntity1.setWillId(1);
        willOwnerEntity1.setPersonId(personId);
        willOwnerEntity1.setOwnerLevel(updateOwnerRequest.getWillOfArmsLevel());

        willOwnerRepository.save(willOwnerEntity1);}

        if (updateOwnerRequest.getWillOfObservation() != null){
        willOwnerRepository.deleteWillOwnerEntitiesByWillIdAndPersonId(2, personId);
        WillOwnerEntity willOwnerEntity2 = new WillOwnerEntity();
        willOwnerEntity2.setWillId(2);
        willOwnerEntity2.setPersonId(personId);
        willOwnerEntity2.setOwnerLevel(updateOwnerRequest.getWillOfObservation());

        willOwnerRepository.save(willOwnerEntity2);}


        if (updateOwnerRequest.getWillOfKing() != null){
        willOwnerRepository.deleteWillOwnerEntitiesByWillIdAndPersonId(3, personId);
        WillOwnerEntity willOwnerEntity3 = new WillOwnerEntity();
        willOwnerEntity3.setWillId(3);
        willOwnerEntity3.setPersonId(personId);
        willOwnerEntity3.setOwnerLevel(updateOwnerRequest.getWillOfKing());

        willOwnerRepository.save(willOwnerEntity3);}
        return true;
    }
}
