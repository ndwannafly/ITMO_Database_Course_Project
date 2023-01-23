package com.example.server.controllers;

import com.example.server.POJO.SentinelRequest;
import com.example.server.POJO.SentinelResponce;
import com.example.server.POJO.WillsForPeopleResponse;
import com.example.server.entities.*;
import com.example.server.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
@RestController
@CrossOrigin("http://localhost:3000")
public class SentinelController {
    @Autowired
    private SentinelService sentinelService;

    @Autowired
    private PeopleService peopleService;

    @Autowired
    private BaseService baseService;

    @Autowired
    private RankingService rankingService;

    @Autowired
    private DevilFruitService devilFruitService;
    
    @Autowired
    private DevilFruitOwnerService devilFruitOwnerService;
    
    @Autowired
    private WeaponService weaponService;
    
    @Autowired
    private WeaponOwnerService weaponOwnerService;
    
    @Autowired
    private WillService willService;

    @Autowired
    private WillOwnerService willOwnerService;
    
    @GetMapping("/sentinel")
    public ResponseEntity<?> getSentinel(){
        List<SentinelEntity> sentinelEntityList = sentinelService.getAll();
        List<SentinelResponce> sentinelResponces = new ArrayList<>();
        sentinelEntityList.forEach(s -> {
            PeopleEntity peopleEntity = peopleService.getPeoplesById(s.getPersonId());
            BaseEntity baseEntity = baseService.getBaseEntityById(s.getBaseId());
            RankingEntity rankingEntity = rankingService.getRankingEntityById(s.getRankingId());

            DevilFruitsOwnerEntity devilFruitsOwnerEntity = devilFruitOwnerService.getDevilFruitsOwnerByPersonID(s.getPersonId());
            DevilFruitsEntity devilFruitsEntity = devilFruitService.getDevilFruitById(devilFruitsOwnerEntity.getFruitId());

            WeaponOwnerEntity weaponOwnerEntity = weaponOwnerService.getWeaponOwnerEntityByPersonId(s.getPersonId());
            WeaponEntity weaponEntity = weaponService.getWeaponEntutyById(weaponOwnerEntity.getWeaponId());

            List<WillOwnerEntity> willOwnerEntityList = willOwnerService.getWillOwnerEntitiesByPersonId(s.getPersonId());
            WillsForPeopleResponse willsForPeopleResponse = willService.getWillsForPeople(willOwnerEntityList);




            SentinelResponce sentinelResponce1 = new SentinelResponce();
            sentinelResponce1.setName(peopleEntity.getName());
            sentinelResponce1.setAge(peopleEntity.getDate());
            sentinelResponce1.setHeight(peopleEntity.getHeight());
            sentinelResponce1.setId(peopleEntity.getId());
            sentinelResponce1.setBase(baseEntity.getName());
            sentinelResponce1.setRanking(rankingEntity.getTitle());

            sentinelResponce1.setDevilFruitId(devilFruitsOwnerEntity.getFruitId());
            sentinelResponce1.setDevilFruitsName(devilFruitsEntity.getName());
            sentinelResponce1.setDevilFruitsOwner(devilFruitsOwnerEntity.getOwnerLevel());

            sentinelResponce1.setWeaponId(weaponEntity.getId());
            sentinelResponce1.setWeaponName(weaponEntity.getName());
            sentinelResponce1.setWeaponOwner(weaponOwnerEntity.getOwnerLavel());

            sentinelResponce1.setWillArmament(willsForPeopleResponse.getWillArmament());
            sentinelResponce1.setWillObservation(willsForPeopleResponse.getWillObservation());
            sentinelResponce1.setWillRoyal(willsForPeopleResponse.getWillRoyal());


            sentinelResponces.add(sentinelResponce1);


        });
        return ResponseEntity.ok(sentinelResponces);
    }

    @PostMapping("/sentinel/add")
    public ResponseEntity<?> addSentinel(@RequestBody SentinelRequest request) {
        return ResponseEntity.ok(sentinelService.addSentinel(request));
    }
}
