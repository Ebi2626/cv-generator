package com.rest.api.cvData;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
public class Technology {
    @Id
    private UUID id;
    private String name;
    private int value; // 0 - 5

    public Technology(UUID id, String name, int value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public Technology() {
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
