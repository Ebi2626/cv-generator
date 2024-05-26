package com.rest.api.cvData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TechnologyController {

    private TechnologyRepository technologyRepository;

    @Autowired
    public TechnologyController(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }

    @GetMapping("/technology")
    public List<Technology> getAll() {
        return technologyRepository.findAll();
    }

    @PostMapping(path = "/technology", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addOne(@RequestBody Technology technology) {
        this.technologyRepository.insert(technology);
    }
}
