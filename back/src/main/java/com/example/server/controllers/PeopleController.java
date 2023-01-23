package com.example.server.controllers;

import com.example.server.POJO.PirateRequest;
import com.example.server.POJO.UpdateOwnerRequest;
import com.example.server.services.DevilFruitOwnerService;
import com.example.server.services.PeopleService;
import com.example.server.services.WeaponOwnerService;
import com.example.server.services.WillOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class PeopleController {

    @Autowired
    private WeaponOwnerService weaponOwnerService;

    @Autowired
    private DevilFruitOwnerService devilFruitOwnerService;

    @Autowired
    private WillOwnerService willOwnerService;

    @Autowired
    private PeopleService peopleService;

    @PostMapping("/people/update")
    public ResponseEntity<?> updateOwner(@RequestBody UpdateOwnerRequest request) {


        return ResponseEntity.ok(peopleService.updateOwner(request));

    }
}
