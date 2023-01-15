package com.example.server.controllers;

import com.example.server.POJO.SentinelResponce;
import com.example.server.entities.PeopleEntity;
import com.example.server.entities.SentinelEntity;
import com.example.server.services.PeopleService;
import com.example.server.services.SentinelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping("/sentinel")
    public ResponseEntity<?> getSentinel(){
        List<SentinelEntity> sentinelEntityList = sentinelService.getAll();
        List<SentinelResponce> sentinelResponces = new ArrayList<>();
        sentinelEntityList.forEach(s -> {
            PeopleEntity peopleEntity = peopleService.getPeoplesById(s.getPersonId());
            SentinelResponce sentinelResponce1 = new SentinelResponce();
            sentinelResponce1.setName(peopleEntity.getName());
            sentinelResponce1.setAge(peopleEntity.getDate());
            sentinelResponce1.setHeight(peopleEntity.getHeight());
            sentinelResponces.add(sentinelResponce1);

        });
        return ResponseEntity.ok(sentinelResponces);
    }
}
