package com.cvgenerator.templateengine.templates.cv;

import java.util.UUID;

public class Profile {
    private final UUID id;
    private final String description;

    public Profile(UUID id, String description) {
        this.id = id;
        this.description = description;
    }

    public Profile() {
        this.id = UUID.randomUUID();
        this.description = "I am a meticulous perfectionist, constantly striving to exceed standards. My primary motivation stems from the satisfaction derived from well-structured code that effectively addresses user issues, coupled with the opportunity to influence solution architecture through informed decisions. I place significant importance on honesty, openness, and direct communication within the team.";
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
