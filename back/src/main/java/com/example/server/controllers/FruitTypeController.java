package com.example.server.controllers;

import com.example.server.services.DevilFruitTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class FruitTypeController {

    @Autowired
    private DevilFruitTypeService devilFruitTypeService;
    @GetMapping("/fruitType")
    public ResponseEntity<?> getType() {
        return ResponseEntity.ok(devilFruitTypeService.getAllType());
    }
}
