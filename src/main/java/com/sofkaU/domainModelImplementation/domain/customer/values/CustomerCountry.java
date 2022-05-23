package com.sofkaU.domainModelImplementation.domain.customer.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CustomerCountry implements ValueObject<String> {

    private final String value;

    public CustomerCountry(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Customer country can't be empty.");
        }

        if(this.value.length() < 2){
            throw new IllegalArgumentException("Customer country must contain at least 2 letters.");
        }
    }

    public String value() {
        return value;
    }
}
