package com.example.server.controllers;


import com.example.server.services.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class WeaponController {

    @Autowired
    private WeaponService weaponService;


    @GetMapping("/weapon")
    public ResponseEntity<?> getWeapon() {
        return ResponseEntity.ok(weaponService.getAllWeapons());
    }




    }
