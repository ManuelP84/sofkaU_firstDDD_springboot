package com.sofkaU.domainModelImplementation.domain.technician.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ReportEndDate implements ValueObject<String> {
    private final String value;

    public ReportEndDate(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("Date can't be empty!");
        }

        if (this.value.length() < 5) {
            throw new IllegalArgumentException("Description must contain at least 5 characters!");
        }
    }

    public String value() {
        return value;
    }
}
