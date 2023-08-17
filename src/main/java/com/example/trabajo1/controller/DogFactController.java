package com.example.trabajo1.controller;

import com.example.trabajo1.model.DogFact;
import com.example.trabajo1.service.DogFactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogFactController {
    private final DogFactService dogFactService;

    @Autowired
    public DogFactController(DogFactService dogFactService) {
        this.dogFactService = dogFactService;
    }

    @GetMapping("/get-dog-fact")
    public DogFact getDogFact() {
        return dogFactService.fetchDogFact();
    }
}
