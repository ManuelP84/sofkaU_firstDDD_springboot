package com.sofkaU.domainModelImplementation.customer.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Hours implements ValueObject<Integer> {

    private final Integer value;

    public Hours(Integer value) {
        this.value = Objects.requireNonNull(value);
        if (this.value <= 0){
            throw new IllegalArgumentException("Hours must be a value greater than cero.");
        }
    }

    public Integer value() {
        return value;
    }
}
