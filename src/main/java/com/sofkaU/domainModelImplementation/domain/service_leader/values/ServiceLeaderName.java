package com.sofkaU.domainModelImplementation.domain.service_leader.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ServiceLeaderName implements ValueObject<String> {

    private final String value;

    public ServiceLeaderName(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Service leader name can't be empty");
        }

        if (this.value.length() < 3){
            throw new IllegalArgumentException("Name must contain more than 3 characters");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ServiceLeaderName that = (ServiceLeaderName) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
