package com.sofkaU.domainModelImplementation.domain.customer.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CustomerName implements ValueObject<String> {

    private final String value;

    public CustomerName(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Customer name can't be empty");
        }

        if (this.value.length() <= 4){
            throw new IllegalArgumentException("Customer name must contain more than 4 letters.");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerName that = (CustomerName) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
