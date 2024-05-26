package com.rest.api.cvData;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Hobby {
    @Id
    private String name;

    public Hobby(String name) {
        this.name = name;
    }
    public Hobby() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
