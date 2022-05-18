package com.sofkaU.domainModelImplementation.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.customer.values.DateOfService;

public class PurchaseDateOfServiceUpdated extends DomainEvent {

    private final DateOfService dateOfService;

    public PurchaseDateOfServiceUpdated(DateOfService dateOfService) {
        super("sofkaU.customer.purchaseDateOfServiceUpdated");
        this.dateOfService = dateOfService;
    }

    public DateOfService dateOfService(){
        return dateOfService;
    }
}
