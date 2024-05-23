package com.cvgenerator.templateengine.templates.cv;

import java.util.UUID;

public class Person {
    private final UUID id;
    private final String firstName, lastName, linkedin, github, email, website, phone;

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
        this.id = UUID.randomUUID();
        this.firstName = "Edwin";
        this.lastName = "Harmata";
        this.linkedin = "linkedin.com/in/edwin-harmata";
        this.github = "github.com/ebi2626";
        this.email = "edwin.harmata@gmail.com";
        this.website = "edwinharmata.pl";
        this.phone = "+48 790 323 905";
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
}
