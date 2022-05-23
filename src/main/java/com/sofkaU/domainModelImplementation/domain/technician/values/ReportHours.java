package com.sofkaU.domainModelImplementation.domain.technician.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ReportHours implements ValueObject<Integer> {
    private final Integer value;

    public ReportHours(Integer value) {
        this.value = Objects.requireNonNull(value);
        if (this.value <= 0){
            throw new IllegalArgumentException("Value must be greater than cero.");
        }
    }

    public Integer value() {
        return value;
    }
}
