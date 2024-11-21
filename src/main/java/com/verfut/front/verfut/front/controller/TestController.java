package com.verfut.front.verfut.front.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/testControler")
public class TestController {

    @GetMapping
    public ResponseEntity<String> getAll(){
        return new ResponseEntity<>("Blabla", HttpStatus.OK);
    }
}
