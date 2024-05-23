package com.cvgenerator.templateengine.templates.cv;

import java.util.UUID;

public class WorkExperience {
    private final UUID id;
    private final String description, from, to, position, company, companyUrl, companyLocation;

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
        this.id = UUID.randomUUID();
        this.description = "Develop front-end of web applications using Angular and React. Create mechanisms to allow users to export part of website views as PDF or PPTX files. Work on systems to manage document flow within the company. Utilize NgRx to implement reactive state management in developed apps.";
        this.from = "02.2022";
        this.to = "current";
        this.position = "Front-End Developer";
        this.company = "Onwelo";
        this.companyUrl = "https://onwelo.pl";
        this.companyLocation = "Kraków";
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
}
