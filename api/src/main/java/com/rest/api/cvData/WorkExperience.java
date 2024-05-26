package com.rest.api.cvData;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
public class WorkExperience {
    @Id
    private UUID id;
    private String description, from, to, position, company, companyUrl, companyLocation;

    public WorkExperience(UUID id, String description, String from, String to, String position, String company, String companyUrl, String companyLocation) {
        this.id = id;
        this.description = description;
        this.from = from;
        this.to = to;
        this.position = position;
        this.company = company;
        this.companyUrl = companyUrl;
        this.companyLocation = companyLocation;
    }

    public WorkExperience() {
    }

    public UUID getId() {
        return id;
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

    public String getPosition() {
        return position;
    }

    public String getCompany() {
        return company;
    }

    public String getCompanyUrl() {
        return companyUrl;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public void setPosition(String position) {
        this.position = position;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }
}
