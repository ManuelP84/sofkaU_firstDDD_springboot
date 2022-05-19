package com.sofkaU.domainModelImplementation.customer.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MachineModel implements ValueObject<String> {

    private final String value;

    public MachineModel(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Machine model can't be empty.");
        }

        if (this.value.length() < 3){
            throw new IllegalArgumentException("Machine model must contain at least 3 characters");
        }
    }

    public String value() {
        return value;
    }
}
