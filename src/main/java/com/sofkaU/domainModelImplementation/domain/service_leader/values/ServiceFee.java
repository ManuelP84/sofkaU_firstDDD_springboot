package com.sofkaU.domainModelImplementation.domain.service_leader.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Map;
import java.util.Objects;

public class ServiceFee implements ValueObject<Map<String, Integer>>{
    private final Map<String, Integer> values;

    public ServiceFee(Map<String, Integer> values) {
        this.values = Objects.requireNonNull(values);
    }

    public Integer getFeeByLocation(String location){
        return values.get(location);
    }

    public Map<String, Integer> value() {
        return values;
    }


}
