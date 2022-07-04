package com.example.pdf.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Location {


    @GetMapping("/location")
    public ResponseEntity<?> getLocation(@RequestParam(value = "name", required = false) String name) {
        return new ResponseEntity("Hi:  " + name, HttpStatus.OK);


    }

}
