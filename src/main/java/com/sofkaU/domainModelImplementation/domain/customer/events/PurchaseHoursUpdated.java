package com.sofkaU.domainModelImplementation.domain.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.customer.values.Hours;
import com.sofkaU.domainModelImplementation.domain.values.PurchaseOrderId;

public class PurchaseHoursUpdated extends DomainEvent {

    private final PurchaseOrderId purchaseOrderId;
    private final Hours hours;

    public PurchaseHoursUpdated(PurchaseOrderId purchaseOrderId, Hours hours) {
        super("sofkaU.customer.purchaseHoursUpdated");
        this.purchaseOrderId = purchaseOrderId;
        this.hours = hours;
    }

    public PurchaseOrderId getPurchaseOrderId(){
        return this.purchaseOrderId;
    }

    public Hours getHours(){
        return this.hours;
    }
}
