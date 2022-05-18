package com.sofkaU.domainModelImplementation.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.customer.values.TypeService;

public class PurchaseTypeServiceUpdated extends DomainEvent {

    private final TypeService typeService;

    public PurchaseTypeServiceUpdated(TypeService typeService) {
        super("sofkaU.customer.purchaseTypeServiceUpdated");
        this.typeService = typeService;
    }

    public TypeService typeService(){
        return this.typeService;
    }
}
