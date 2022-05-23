package com.sofkaU.domainModelImplementation.domain.technician.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ExpensesAmount implements ValueObject<Double> {

    private final Double value;

    public ExpensesAmount(Double value) {
        this.value = Objects.requireNonNull(value);
        if (this.value <= 0){
            throw new IllegalArgumentException("Value must be greater than cero.");
        }
    }

    public Double value() {
        return value;
    }
}
