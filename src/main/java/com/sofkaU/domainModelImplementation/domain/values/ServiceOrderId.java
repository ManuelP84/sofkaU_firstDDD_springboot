package com.sofkaU.domainModelImplementation.domain.values;

import co.com.sofka.domain.generic.Identity;

public class ServiceOrderId extends Identity {
    public ServiceOrderId(){
    }

    private ServiceOrderId(String id){
        super(id);
    }

    public static ServiceOrderId of(String id){
        return new ServiceOrderId(id);
    }
}
