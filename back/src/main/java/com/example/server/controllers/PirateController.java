package com.example.server.controllers;

import com.example.server.POJO.PiratePeopleResponse;
import com.example.server.POJO.PirateRequest;
import com.example.server.POJO.WillsForPeopleResponse;
import com.example.server.entities.*;
import com.example.server.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


@RestController
@CrossOrigin("http://localhost:3000")
public class PirateController {
    @Autowired
    private PirateService pirateService;

    @Autowired
    private PeopleService peopleService;

    @Autowired
    private DevilFruitOwnerService devilFruitOwnerService;

    @Autowired
    private DevilFruitService devilFruitService;

    @Autowired
    private WeaponService weaponService;

    @Autowired
    private WeaponOwnerService weaponOwnerService;

    @Autowired
    private WillService willService;

    @Autowired
    private WillOwnerService willOwnerService;

    @Autowired
    private PirateTeamService pirateTeamService;

    @Autowired
    private TeamService teamService;

    @GetMapping("/pirate")
    public ResponseEntity<?> getPirates() {
        List<PirateEntity> pirateEntities = pirateService.getPirate();
        List<PiratePeopleResponse> piratePeopleResponses = new ArrayList<>();
        ;

        pirateEntities.forEach(pirate -> {
            PeopleEntity peopleEntity = peopleService.getPeoplesById(pirate.getPersonId());

            DevilFruitsOwnerEntity devilFruitsOwnerEntity = devilFruitOwnerService.getDevilFruitsOwnerByPersonID(pirate.getPersonId());
            DevilFruitsEntity devilFruitsEntity = devilFruitService.getDevilFruitById(devilFruitsOwnerEntity.getFruitId());

            WeaponOwnerEntity weaponOwnerEntity = weaponOwnerService.getWeaponOwnerEntityByPersonId(pirate.getPersonId());
            WeaponEntity weaponEntity = weaponService.getWeaponEntutyById(weaponOwnerEntity.getWeaponId());

            List<WillOwnerEntity> willOwnerEntityList = willOwnerService.getWillOwnerEntitiesByPersonId(pirate.getPersonId());
            WillsForPeopleResponse willsForPeopleResponse = willService.getWillsForPeople(willOwnerEntityList);

            PirateTeamEntity pirateTeamEntity = pirateTeamService.getPirateTeamEntityByPirateId(pirate.getId());
            TeamEntity teamEntity = teamService.getTeamEntityById(pirateTeamEntity.getTeamId());


            PiratePeopleResponse piratePeopleResponse1 = new PiratePeopleResponse();

            piratePeopleResponse1.setId(pirate.getId());
            piratePeopleResponse1.setPersonId(pirate.getPersonId());
            piratePeopleResponse1.setCaptureReward(pirate.getCaptureReward());
            piratePeopleResponse1.setDate(peopleEntity.getDate());
            piratePeopleResponse1.setName(peopleEntity.getName());
            piratePeopleResponse1.setHeight(peopleEntity.getHeight());

            piratePeopleResponse1.setDevilFruitsName(devilFruitsEntity.getName());
            piratePeopleResponse1.setDevilFruitsOwner(devilFruitsOwnerEntity.getOwnerLevel());

            piratePeopleResponse1.setWeaponName(weaponEntity.getName());
            piratePeopleResponse1.setWeaponOwner(weaponOwnerEntity.getOwnerLavel());

            piratePeopleResponse1.setWillArmament(willsForPeopleResponse.getWillArmament());
            piratePeopleResponse1.setWillObservation(willsForPeopleResponse.getWillObservation());
            piratePeopleResponse1.setWillRoyal(willsForPeopleResponse.getWillRoyal());


            piratePeopleResponse1.setNumberTeam(teamEntity.getId());
            piratePeopleResponse1.setNameTeam(teamEntity.getName());
            piratePeopleResponse1.setImg(teamEntity.getImg());
            piratePeopleResponse1.setTitle(pirateTeamEntity.getTitle());
            piratePeopleResponses.add(piratePeopleResponse1);
        });

        Collections.sort(piratePeopleResponses, new Comparator<PiratePeopleResponse>() {
            @Override
            public int compare(PiratePeopleResponse o1, PiratePeopleResponse o2) {
                return o2.getCaptureReward() - o1.getCaptureReward();
            }
        });

        return ResponseEntity.ok(piratePeopleResponses);
    }

    @GetMapping("/pirate/{id}")
    public ResponseEntity<?> getPirateById(@PathVariable String id) {
        try {
            return ResponseEntity.ok(pirateService.getPirateByID(Long.valueOf(id)));
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body("Incorrect format of id.");
        }
    }

    @PostMapping("/pirate/add")
    public ResponseEntity<?> addPirate(@RequestBody PirateRequest request) {
        return ResponseEntity.ok(pirateService.addPirate(request));
    }
}
