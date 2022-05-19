package com.sofkaU.domainModelImplementation.domain.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.customer.values.DateOfService;
import com.sofkaU.domainModelImplementation.domain.customer.values.PurchaseOrderId;

public class PurchaseDateOfServiceUpdated extends DomainEvent {

    private final PurchaseOrderId purchaseOrderId;
    private final DateOfService   dateOfService;

    public PurchaseDateOfServiceUpdated(PurchaseOrderId purchaseOrderId, DateOfService dateOfService) {
        super("sofkaU.customer.purchaseDateOfServiceUpdated");
        this.purchaseOrderId = purchaseOrderId;
        this.dateOfService = dateOfService;
    }

    public PurchaseOrderId getPurchaseOrderId(){
        return this.purchaseOrderId;
    }

    public DateOfService getDateOfService(){
        return dateOfService;
    }
}
