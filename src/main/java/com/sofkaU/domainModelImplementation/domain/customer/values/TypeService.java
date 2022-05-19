package com.sofkaU.domainModelImplementation.domain.customer.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TypeService implements ValueObject<String> {

    private final String value;

    public TypeService(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Type of service can't be empty.");
        }

        if (this.value.length() < 5){
            throw new IllegalArgumentException("Type of service must contain at least 5 characters");
        }
    }

    public String value() {
        return value;
    }
}
