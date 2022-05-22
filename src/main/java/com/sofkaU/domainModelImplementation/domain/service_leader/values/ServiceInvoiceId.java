package com.sofkaU.domainModelImplementation.domain.service_leader.values;

import co.com.sofka.domain.generic.Identity;

public class ServiceInvoiceId extends Identity {
    public ServiceInvoiceId(){
    }

    private ServiceInvoiceId(String id){
        super(id);
    }

    public static ServiceInvoiceId of(String id){
        return new ServiceInvoiceId(id);
    }
}
