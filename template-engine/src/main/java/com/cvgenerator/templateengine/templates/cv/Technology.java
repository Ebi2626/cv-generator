package com.cvgenerator.templateengine.templates.cv;

import java.util.UUID;

public class Technology {
    private final UUID id;
    private final String name;
    private final int value; // 0 - 5

    public Technology(UUID id, String name, int value) {
        this.id = id;
        this.name = name;
        this.value = value;
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
}
