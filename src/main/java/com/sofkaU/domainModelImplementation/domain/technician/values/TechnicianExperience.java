package com.sofkaU.domainModelImplementation.domain.technician.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TechnicianExperience implements ValueObject<String> {
    private final String value;

    public TechnicianExperience(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Experience can't be empty!");
        }

        if (this.value.length() < 20){
            throw new IllegalArgumentException("Experience must contain at least 20 characters!");
        }
    }

    public String value() {
        return value;
    }
}
