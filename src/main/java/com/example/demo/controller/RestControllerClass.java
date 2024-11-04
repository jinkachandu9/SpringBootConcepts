package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/basePath")
public class RestControllerClass {
    @GetMapping(value = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getMethod() {
        return new ResponseEntity<>("GetCall", HttpStatus.CREATED);
    }

    @DeleteMapping(value="/delete")
    public ResponseEntity<String> deleteMethod(){
        return new ResponseEntity<>("Deleted",HttpStatus.ACCEPTED);
    }

    @PutMapping(value = "/put" ,produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> putMethod(){
        return new ResponseEntity<>("PutMapping",HttpStatus.ACCEPTED);
    }

    @PatchMapping(value = "/patch",produces = MediaType.APPLICATION_JSON_VALUE , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> patchMethod(){
        return new ResponseEntity<>("PatchMapping",HttpStatus.ACCEPTED);
    }


}
