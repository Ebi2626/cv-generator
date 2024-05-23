package com.cvgenerator.templateengine.templates;

import com.cvgenerator.templateengine.templates.cv.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Template {
    private Person person;
    private Profile profile;
    private List<Technology> technologies;
    private List<Hobby> hobbies;
    private List<WorkExperience> workExperiences;
    private List<Education> educations;

    public Template(Person person, Profile profile, List<Technology> technologies, List<Hobby> hobbies, List<WorkExperience> workExperiences, List<Education> educations) {
        this.person = person;
        this.profile = profile;
        this.technologies = technologies;
        this.hobbies = hobbies;
        this.workExperiences = workExperiences;
        this.educations = educations;
    }

    public Template() {
        this.person = new Person();
        this.profile = new Profile();
        this.technologies = new ArrayList<Technology>(List.of(
                new Technology(UUID.randomUUID(), "Angular", 4),
                new Technology(UUID.randomUUID(), "TypeScript", 4),
                new Technology(UUID.randomUUID(), "JavaScript", 4),
                new Technology(UUID.randomUUID(), "HTML 5", 4),
                new Technology(UUID.randomUUID(), "CSS 3", 4),
                new Technology(UUID.randomUUID(), "Bootstrap", 4),
                new Technology(UUID.randomUUID(), "SCSS", 3),
                new Technology(UUID.randomUUID(), "RxJs", 3),
                new Technology(UUID.randomUUID(), "React", 3),
                new Technology(UUID.randomUUID(), "Jest", 3),
                new Technology(UUID.randomUUID(), "Nest.js", 2),
                new Technology(UUID.randomUUID(), "Docker", 1),
                new Technology(UUID.randomUUID(), "Java", 1),
                new Technology(UUID.randomUUID(), "Spring", 1)
        ));
        this.hobbies = new ArrayList<Hobby>(List.of(
           new Hobby("Gym"),
           new Hobby("Coding"),
           new Hobby("Psychology")
        ));
        this.workExperiences = new ArrayList<WorkExperience>(List.of(
                new WorkExperience(),
                new WorkExperience(
                        UUID.randomUUID(),
                        "Build user interfaces using Angular, RxJs, SCSS, and Bootstrap. Work on accessible HTML templates and Sass styles for web applications. Create backend proxy services using Nest.js. Prepare accessibility audits for the company website.",
                        "08.2020",
                        "02.2022",
                        "Junior Front-End Developer",
                        "Institute of Logistics and Warehousing",
                        "https://pit.lukasiewicz.gov.pl/",
                        "Poznań"
                ),
                new WorkExperience(
                        UUID.randomUUID(),
                        "Create interactive mockups in HTML5/CSS3 that meet the requirements of WCAG 2.1. Generate lo-fi mockups using Axure RP. Participate in research as an observer. Address issues related to the accessibility of the UI. Prepare stylesheets for XML transformations. Develop a new company website in WordPress using Bootstrap.",
                        "05.2020",
                        "08.2020",
                        "UX Trainee",
                        "Institute of Logistics and Warehousing",
                        "https://pit.lukasiewicz.gov.pl/",
                        "Poznań"
                )
        ));

        this.educations = new ArrayList<Education>(List.of(
                new Education(),
                new Education(
                        UUID.randomUUID(),
                        "Collage of Management and Banking",
                        "https://www.wszib.edu.pl/en/",
                        "Kraków",
                        "Information Technology",
                        "Object Oriented Programming",
                        "Engineer",
                        "The specialization in Object-Oriented Programming is designed to equip students with practical skills necessary for a successful entry into the job market as a software developer. Primarily focused on Java, this specialization also offers opportunities to learn other programming languages such as C, C#, JavaScript, and technologies associated with software development, including MySql.",
                        "2019",
                        "2023"
                )
        ));
    }

    public Person getPerson() {
        return person;
    }

    public Profile getProfile() {
        return profile;
    }

    public List<Technology> getTechnologies() {
        return technologies;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public List<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public List<Education> getEducations() {
        return educations;
    }
}
