package com.example.server.controllers;

import com.example.server.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class BaseController {

    @Autowired
    private BaseService baseService;

    @GetMapping("/base")
    public ResponseEntity<?> getBase() {
        return ResponseEntity.ok(baseService.getAllBase());
    }
}
