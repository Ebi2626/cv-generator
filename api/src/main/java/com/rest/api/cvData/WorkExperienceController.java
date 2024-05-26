package com.rest.api.cvData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkExperienceController {

    private WorkExperienceRepository workExperienceRepository;

    @Autowired
    public WorkExperienceController(WorkExperienceRepository workExperienceRepository) {
        this.workExperienceRepository = workExperienceRepository;
    }

    @GetMapping("/workExperience")
    public List<WorkExperience> getAll() {
        return workExperienceRepository.findAll();
    }

    @PostMapping(path = "/workExperience", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addOne(@RequestBody WorkExperience workExperience) {
        this.workExperienceRepository.insert(workExperience);
    }
}
