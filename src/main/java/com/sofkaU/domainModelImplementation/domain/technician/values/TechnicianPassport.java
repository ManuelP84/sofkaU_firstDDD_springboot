package com.sofkaU.domainModelImplementation.domain.technician.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TechnicianPassport implements ValueObject<String> {

    private final String value;

    public TechnicianPassport(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Passport can't be empty!");
        }
    }

    public String value() {
        return value;
    }
}
