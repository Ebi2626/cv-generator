package com.rest.api.cvData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/person")
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @PostMapping(path = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addOne(@RequestBody Person person) {
        this.personRepository.insert(person);
    }
}
