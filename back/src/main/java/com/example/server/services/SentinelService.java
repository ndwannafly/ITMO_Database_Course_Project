package com.example.server.services;

import com.example.server.POJO.PirateRequest;
import com.example.server.POJO.SentinelRequest;
import com.example.server.entities.*;
import com.example.server.repositories.SentinelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class SentinelService {
    @Autowired
    private SentinelRepository sentinelRepository;

    @Autowired
    private DevilFruitOwnerService devilFruitOwnerService;

    @Autowired
    private PeopleService peopleService;

    @Autowired
    private WeaponOwnerService weaponOwnerService;

    @Autowired
    private WillOwnerService willOwnerService;


    public List<SentinelEntity> getAll(){
        return sentinelRepository.getAll();
    }

    public Boolean addSentinel(SentinelRequest request) {
        Long nextPeopleID = peopleService.getLastPeopleId() + 1;
        PeopleEntity peopleEntity = new PeopleEntity();

        System.out.println("nextPeopleID " + nextPeopleID);
        peopleEntity.setId(nextPeopleID);
        peopleEntity.setName(request.getName());
        peopleEntity.setHeight(request.getHeight());
        peopleEntity.setDate(LocalDate.parse(request.getBirthDate()));
        peopleService.addPeople(peopleEntity);

        DevilFruitsOwnerEntity devilFruitsOwnerEntity = new DevilFruitsOwnerEntity();
        devilFruitsOwnerEntity.setFruitId(Long.valueOf(request.getFruitId()));
        devilFruitsOwnerEntity.setOwnerLevel(request.getFruitOwnerLevel());
        devilFruitsOwnerEntity.setPersonId(nextPeopleID);
        devilFruitOwnerService.addDevilFruitsOwner(devilFruitsOwnerEntity);

        WeaponOwnerEntity weaponOwnerEntity = new WeaponOwnerEntity();
        weaponOwnerEntity.setWeaponId(Long.valueOf(request.getWeaponID()));
        weaponOwnerEntity.setPersonId(nextPeopleID);
        weaponOwnerEntity.setOwnerLavel(request.getWeaponOwnerLevel());
        weaponOwnerService.addWeaponOwner(weaponOwnerEntity);

        WillOwnerEntity willOfArmsOwnerEntity = new WillOwnerEntity();
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

        Long nextSentinelID = this.getLastSentinelId() + 1;
        SentinelEntity sentinelEntity = new SentinelEntity();
        sentinelEntity.setId(nextSentinelID);
        sentinelEntity.setPersonId(nextPeopleID);
        sentinelEntity.setBaseId(request.getBaseId());
        sentinelEntity.setRankingId(request.getRankingId());
        sentinelRepository.save(sentinelEntity);

        return true;
    }

    public Long getLastSentinelId(){
        return sentinelRepository.findTopByOrderByIdDesc().getId();
    }

}