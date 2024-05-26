package com.rest.api.cvData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EducationController {

    private EducationRepository educationRepository;

    @Autowired
    public EducationController(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }

    @GetMapping("/education")
    public List<Education> getAll() {
        return educationRepository.findAll();
    }

    @PostMapping(path = "/education", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addOne(@RequestBody Education education) {
        this.educationRepository.insert(education);
    }
}
