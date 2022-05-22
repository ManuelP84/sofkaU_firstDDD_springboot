package com.sofkaU.domainModelImplementation.domain.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.customer.values.Description;
import com.sofkaU.domainModelImplementation.domain.values.PurchaseOrderId;

public class PurchaseDescriptionUpdated extends DomainEvent {

    private final PurchaseOrderId purchaseOrderId;
    private final Description     description;

    public PurchaseDescriptionUpdated(PurchaseOrderId purchaseOrderId, Description description) {
        super("sofkaU.customer.purchaseDescriptionUpdated");
        this.purchaseOrderId = purchaseOrderId;
        this.description = description;
    }

    public PurchaseOrderId getPurchaseOrderId(){
        return this.purchaseOrderId;
    }

    public Description getDescription(){
        return this.description;
    }
}
