package com.rest.api.cvData;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Document
public class CvData {
    @Id
    private UUID id;
    private Person person;
    private Profile profile;
    private List<Technology> technologies;
    private List<Hobby> hobbies;
    private List<WorkExperience> workExperiences;
    private List<Education> educations;

    public CvData(UUID id, Person person, Profile profile, List<Technology> technologies, List<Hobby> hobbies, List<WorkExperience> workExperiences, List<Education> educations) {
        this.id = id;
        this.person = person;
        this.profile = profile;
        this.technologies = technologies;
        this.hobbies = hobbies;
        this.workExperiences = workExperiences;
        this.educations = educations;
    }

    public CvData(){}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<Technology> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<Technology> technologies) {
        this.technologies = technologies;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    public List<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(List<WorkExperience> workExperiences) {
        this.workExperiences = workExperiences;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }
}
