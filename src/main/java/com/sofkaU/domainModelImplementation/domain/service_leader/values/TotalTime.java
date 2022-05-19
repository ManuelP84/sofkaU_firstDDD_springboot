package com.sofkaU.domainModelImplementation.domain.service_leader.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TotalTime implements ValueObject<Integer> {

    private final Integer value;

    public TotalTime(Integer value) {
        this.value = Objects.requireNonNull(value);
        if (this.value <= 0){
            throw new IllegalArgumentException("Total time must be greater than cero.");
        }
    }

    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TotalTime totalTime = (TotalTime) o;
        return Objects.equals(value, totalTime.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
