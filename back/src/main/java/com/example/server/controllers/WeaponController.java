package com.example.server.controllers;


import com.example.server.POJO.DevilFruitRequest;
import com.example.server.POJO.WeaponRequest;
import com.example.server.services.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class WeaponController {

    @Autowired
    private WeaponService weaponService;


    @GetMapping("/weapon")
    public ResponseEntity<?> getWeapon() {
        return ResponseEntity.ok(weaponService.getAllWeapons());
    }


    @PostMapping("/weapon/add")
    public ResponseEntity<?> addFruit(@RequestBody WeaponRequest request) {
        return ResponseEntity.ok(weaponService.addWeapon(request));
    }

    }
