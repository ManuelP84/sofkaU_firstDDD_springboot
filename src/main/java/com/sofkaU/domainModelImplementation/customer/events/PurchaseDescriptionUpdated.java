package com.sofkaU.domainModelImplementation.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.customer.values.Description;

public class PurchaseDescriptionUpdated extends DomainEvent {

    private final Description description;

    public PurchaseDescriptionUpdated(Description description) {
        super("sofkaU.customer.purchaseDescriptionUpdated");
        this.description = description;
    }

    public Description description(){
        return this.description;
    }
}
