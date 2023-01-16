package com.example.server.services;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.server.POJO.PirateRequest;
import com.example.server.entities.*;
import com.example.server.repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PirateService {
    @Autowired
    private PirateRepository pirateRepository;

    @Autowired
     private PeopleService peopleService;

    @Autowired
    private PirateTeamService pirateTeamService;

    @Autowired
    private DevilFruitOwnerService devilFruitOwnerService;

    @Autowired
    private WeaponOwnerService weaponOwnerService;

    @Autowired
    private WillOwnerService willOwnerService;

    public Map<Long, String> getPirateByID(Long id) {
        Map<Long, String> result = new HashMap<>();
        List<Long> list = pirateRepository.getPirateIdById(id);
        list.forEach(o -> result.put(o, pirateRepository.getPirateEntityById(id).getPersonId().toString()));
        return result;
    }

    public List<PirateEntity> getPirate(){
        return pirateRepository.getAll();
    }

    public Long getLastPirateId(){
        return pirateRepository.findTopByOrderByIdDesc().getId();
    }

    public Boolean addPirate(PirateRequest request) {
        // add person

        Long nextPeopleID = peopleService.getLastPeopleId() + 1;
        PeopleEntity peopleEntity = new PeopleEntity();

        System.out.println("nextPeopleID " + nextPeopleID);
        peopleEntity.setId(nextPeopleID);
        peopleEntity.setName(request.getName());
        peopleEntity.setHeight(request.getHeight());
        peopleEntity.setDate(LocalDate.parse(request.getBirthDate()));
        peopleService.addPeople(peopleEntity);

        // add pirate

        Long nextPirateID = this.getLastPirateId() + 1;
        PirateEntity pirateEntity = new PirateEntity();
        pirateEntity.setId(nextPirateID);
        pirateEntity.setCaptureReward(request.getCaptureReward());
        pirateEntity.setPersonId(nextPeopleID);
        pirateRepository.save(pirateEntity);

        PirateTeamEntity pirateTeamEntity = new PirateTeamEntity();
        pirateTeamEntity.setPirateId(nextPirateID);
        pirateTeamEntity.setTeamId(Long.valueOf(request.getTeamID()));
        pirateTeamEntity.setTitle(request.getTeamTitle());
        pirateTeamService.addPirate(pirateTeamEntity);

        DevilFruitsOwnerEntity devilFruitsOwnerEntity = new DevilFruitsOwnerEntity();
        devilFruitsOwnerEntity.setFruitId(Long.valueOf(request.getFruitID()));
        devilFruitsOwnerEntity.setOwnerLevel(request.getFruitOwnerLevel());
        devilFruitsOwnerEntity.setPersonId(nextPeopleID);
        devilFruitOwnerService.addDevilFruitsOwner(devilFruitsOwnerEntity);

        WeaponOwnerEntity weaponOwnerEntity = new WeaponOwnerEntity();
        weaponOwnerEntity.setWeaponId(Long.valueOf(request.getWeaponID()));
        weaponOwnerEntity.setPersonId(nextPeopleID);
        weaponOwnerEntity.setOwnerLavel(request.getWeaponOwnerLevel());
        weaponOwnerService.addWeaponOwner(weaponOwnerEntity);

        WillOwnerEntity  willOfArmsOwnerEntity = new WillOwnerEntity();
        willOfArmsOwnerEntity.setWillId(1);
        willOfArmsOwnerEntity.setPersonId(nextPeopleID);
        willOfArmsOwnerEntity.setOwnerLevel(request.getWillOfArmsLevel());
        willOwnerService.addWillOwner(willOfArmsOwnerEntity);

        WillOwnerEntity  willOfObservationOwnerEntity = new WillOwnerEntity();
        willOfObservationOwnerEntity.setWillId(2);
        willOfObservationOwnerEntity.setPersonId(nextPeopleID);
        willOfObservationOwnerEntity.setOwnerLevel(request.getWillOfObservation());
        willOwnerService.addWillOwner(willOfObservationOwnerEntity);

        WillOwnerEntity  willOfKingOwnerEntity = new WillOwnerEntity();
        willOfKingOwnerEntity.setWillId(3);
        willOfKingOwnerEntity.setPersonId(nextPeopleID);
        willOfKingOwnerEntity.setOwnerLevel(request.getWillOfKing());
        willOwnerService.addWillOwner(willOfKingOwnerEntity);

        return true;
    }

}
