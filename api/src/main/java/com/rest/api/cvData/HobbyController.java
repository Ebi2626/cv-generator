package com.rest.api.cvData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HobbyController {
    private HobbyRepository hobbyRepository;

    @Autowired
    public HobbyController(HobbyRepository hobbyRepository) {
        this.hobbyRepository = hobbyRepository;
    }

    @GetMapping("/hobby")
    public List<Hobby> getAll() {
        return hobbyRepository.findAll();
    }

    @PostMapping(path = "/hobby/{name}")
    public void addOne(@PathVariable String name) {
        Hobby newHobby = new Hobby(name);
        hobbyRepository.insert(newHobby);
    }
}
