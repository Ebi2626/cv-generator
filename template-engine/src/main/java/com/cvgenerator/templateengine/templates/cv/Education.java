package com.cvgenerator.templateengine.templates.cv;

import java.util.UUID;

public class Education {
    private final UUID id;
    private final String university;
    private final String universityUrl;
    private final String location;
    private final String fieldOfStudy;
    private final String specialization;
    private final String degree;
    private final String description;
    private final String from;
    private final String to;


    public Education(UUID id, String university, String universityUrl, String location, String fieldOfStudy, String specialization, String degree, String description, String from, String to) {
        this.id = id;
        this.university = university;
        this.universityUrl = universityUrl;
        this.location = location;
        this.fieldOfStudy = fieldOfStudy;
        this.specialization = specialization;
        this.degree = degree;
        this.description = description;
        this.from = from;
        this.to = to;
    }

    public Education() {
        this.id = UUID.randomUUID();
        this.university = "Collage of Management and Banking";
        this.universityUrl = "https://www.wszib.edu.pl/en/";
        this.degree = "Master";
        this.from = "2024";
        this.to = "current";
        this.fieldOfStudy = "Information Technology";
        this.location = "Kraków";
        this.specialization = "Software engineering and production";
        this.description = "The curriculum of this specialization has been meticulously crafted to equip graduates with not only knowledge and skills in software design and development," +
                "but also advanced competencies in managing IT projects. Graduates will possess the ability to efficiently coordinate the activities of programming teams and effectively execute" +
                "intricate programming endeavors. Furthermore, the specialization places emphasis on computer system security within software production.";
    }

    public UUID getId() {
        return id;
    }

    public String getUniversity() {
        return university;
    }

    public String getUniversityUrl() {
        return universityUrl;
    }

    public String getLocation() {
        return location;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getDegree() {
        return degree;
    }

    public String getDescription() {
        return description;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }


}
