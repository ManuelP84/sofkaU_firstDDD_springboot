package com.sofkaU.domainModelImplementation.domain.customer.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DateOfService implements ValueObject<String> {

    private final String value;

    public DateOfService(String dateOfService) {
        this.value = Objects.requireNonNull(dateOfService);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Date of service can't be empty.");
        }

        if (this.value.length() < 5){
            throw new IllegalArgumentException("Date must contain at least 5 characters. Date format xx/xx/xx");
        }
    }

    public String value() {
        return value;
    }
}
