package com.sofkaU.domainModelImplementation.customer.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Description implements ValueObject<String> {

    private final String value;

    public Description(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Description can't be empty.");
        }

        if (this.value.length() <= 10){
            throw new IllegalArgumentException("Description must contain at least 10 characters");
        }
    }

    public String value() {
        return value;
    }
}
