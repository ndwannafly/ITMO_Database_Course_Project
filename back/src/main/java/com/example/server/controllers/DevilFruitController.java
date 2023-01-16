package com.example.server.controllers;

import com.example.server.POJO.DevilFruitRequest;
import com.example.server.services.DevilFruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class DevilFruitController {
    @Autowired
    private DevilFruitService devilFruitService;

    @GetMapping("/devilFruit")
    public ResponseEntity<?> getDevilFruit() {
        return ResponseEntity.ok(devilFruitService.getAllDevilFruits());
    }

    @PostMapping("/fruit/add")
    public ResponseEntity<?> addFruit(@RequestBody DevilFruitRequest request) {
        return ResponseEntity.ok(devilFruitService.addFruit(request));
    }
}
