package com.rest.api.cvData;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
public class Person {
    @Id
    private UUID id;
    private String firstName, lastName, linkedin, github, email, website, phone;

    public Person(UUID id, String firstName, String lastName, String linkedin, String github, String email, String website, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.linkedin = linkedin;
        this.github = github;
        this.email = email;
        this.website = website;
        this.phone = phone;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public String getGithub() {
        return github;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }

    public String getPhone() {
        return phone;
    }

    public UUID getId() {
        return id;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
