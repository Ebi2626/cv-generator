package com.rest.api.cvData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfileController {

    private ProfileRepository profileRepository;

    @Autowired
    public ProfileController(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @GetMapping("/profile")
    public List<Profile> getAll() {
        return profileRepository.findAll();
    }

    @PostMapping(path = "/profile", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addOne(@RequestBody Profile profile) {
        this.profileRepository.insert(profile);
    }
}
