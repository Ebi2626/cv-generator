package com.rest.api.cvData;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
public class Profile {
    @Id
    private UUID id;
    private String description;

    public Profile(UUID id, String description) {
        this.id = id;
        this.description = description;
    }

    public Profile() {
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
