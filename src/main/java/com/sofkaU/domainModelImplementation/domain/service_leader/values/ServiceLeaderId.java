package com.sofkaU.domainModelImplementation.domain.service_leader.values;

import co.com.sofka.domain.generic.Identity;

public class ServiceLeaderId extends Identity {
    public ServiceLeaderId(){
    }

    private ServiceLeaderId(String id){
        super(id);
    }

    public static ServiceLeaderId of(String id){
        return new ServiceLeaderId(id);
    }
}
