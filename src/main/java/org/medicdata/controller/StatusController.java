package org.medicdata.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"","/status"})

public class StatusController {
    @GetMapping(produces = "application/json")
    public ResponseEntity<?> status(){
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
