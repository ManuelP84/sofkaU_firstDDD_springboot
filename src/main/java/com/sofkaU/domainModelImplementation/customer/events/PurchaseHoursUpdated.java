package com.sofkaU.domainModelImplementation.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.customer.values.Hours;

public class PurchaseHoursUpdated extends DomainEvent {

    private final Hours hours;

    public PurchaseHoursUpdated(Hours hours) {
        super("sofkaU.customer.purchaseHoursUpdated");
        this.hours = hours;
    }

    public Hours hours(){
        return this.hours;
    }
}
