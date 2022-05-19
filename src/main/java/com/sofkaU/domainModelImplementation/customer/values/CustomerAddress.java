package com.sofkaU.domainModelImplementation.customer.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CustomerAddress implements ValueObject<String> {

    private final String value;

    public CustomerAddress(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Customer address can't be empty");
        }
    }

    public String value() {
        return value;
    }
}
