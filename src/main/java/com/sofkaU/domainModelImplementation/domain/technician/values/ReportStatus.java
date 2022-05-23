package com.sofkaU.domainModelImplementation.domain.technician.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ReportStatus implements ValueObject<Boolean> {
    private final Boolean value;

    public ReportStatus(Boolean value) {
        this.value = Objects.requireNonNull(value);
    }

    public Boolean value() {
        return value;
    }
}
