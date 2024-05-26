package com.rest.api.cvData;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
public class Education {
    @Id
    private UUID id;
    private String university;
    private String universityUrl;
    private String location;
    private String fieldOfStudy;
    private String specialization;
    private String degree;
    private String description;
    private String from;
    private String to;


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

    public Education(){
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setUniversityUrl(String universityUrl) {
        this.universityUrl = universityUrl;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
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
