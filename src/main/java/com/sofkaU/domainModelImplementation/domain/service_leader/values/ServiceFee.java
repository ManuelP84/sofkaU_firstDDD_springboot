package com.sofkaU.domainModelImplementation.domain.service_leader.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ServiceFee implements ValueObject<Integer>{
    private final Integer value;

    public ServiceFee(Integer value) {
        this.value = Objects.requireNonNull(value);
    }

    public Integer value() {
        return value;
    }


}
