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
        List<PiratePeopleResponse> piratePeopleResponses = pirateService.getPirateResponse(pirateEntities);
        ;



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

    @GetMapping("/pirateSentinel/{id}")
    public ResponseEntity<?> getPirateSentinel(@PathVariable String id){
        Long sentinelId = Long.parseLong(id);
        Integer sum = 0;
        DevilFruitsOwnerEntity devilFruitsOwnerEntity = devilFruitOwnerService.getDevilFruitsOwnerByPersonID(sentinelId);
        sum = sum + devilFruitsOwnerEntity.getOwnerLevel();

        WeaponOwnerEntity weaponOwnerEntity = weaponOwnerService.getWeaponOwnerEntityByPersonId(sentinelId);
        sum = sum + weaponOwnerEntity.getOwnerLavel();

        List<WillOwnerEntity> willOwnerEntityList = willOwnerService.getWillOwnerEntitiesByPersonId(sentinelId);


        for (WillOwnerEntity willOwnerEntity : willOwnerEntityList){
            sum = sum + willOwnerEntity.getOwnerLevel();
        }


        List<PirateEntity> pirateEntities = pirateService.getPirateCanDif(sum);
        List<PiratePeopleResponse> piratePeopleResponses = pirateService.getPirateResponse(pirateEntities);
        return ResponseEntity.ok(piratePeopleResponses);
    }
}
