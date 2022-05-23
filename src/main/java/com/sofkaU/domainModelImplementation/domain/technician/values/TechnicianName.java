package com.sofkaU.domainModelImplementation.domain.technician.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TechnicianName implements ValueObject<String> {
    private final String value;

    public TechnicianName(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Name can't be empty!");
        }
    }

    public String value() {
        return value;
    }
}
