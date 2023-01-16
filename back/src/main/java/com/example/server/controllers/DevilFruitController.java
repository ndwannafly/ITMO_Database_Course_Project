package com.example.server.controllers;

import com.example.server.services.DevilFruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class DevilFruitController {
    @Autowired
    private DevilFruitService devilFruitService;

    @GetMapping("/devilFruit")
    public ResponseEntity<?> getDevilFruit() {
        return ResponseEntity.ok(devilFruitService.getAllDevilFruits());
    }
}
