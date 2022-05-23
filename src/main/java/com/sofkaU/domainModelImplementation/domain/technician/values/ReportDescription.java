package com.sofkaU.domainModelImplementation.domain.technician.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ReportDescription implements ValueObject<String> {
    private final String value;

    public ReportDescription(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("Experience can't be empty!");
        }

        if (this.value.length() < 10) {
            throw new IllegalArgumentException("Description must contain at least 10 characters!");
        }
    }

    public String value() {
        return value;
    }
}

