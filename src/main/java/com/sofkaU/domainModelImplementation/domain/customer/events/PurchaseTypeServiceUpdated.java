package com.sofkaU.domainModelImplementation.domain.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.customer.values.PurchaseOrderId;
import com.sofkaU.domainModelImplementation.domain.customer.values.TypeService;

public class PurchaseTypeServiceUpdated extends DomainEvent {

    private final PurchaseOrderId purchaseOrderId;
    private final TypeService typeService;

    public PurchaseTypeServiceUpdated(PurchaseOrderId purchaseOrderId, TypeService typeService) {
        super("sofkaU.customer.purchaseTypeServiceUpdated");
        this.purchaseOrderId = purchaseOrderId;
        this.typeService = typeService;
    }

    public PurchaseOrderId getPurchaseOrderId(){
        return this.purchaseOrderId;
    }

    public TypeService getTypeService(){
        return this.typeService;
    }
}
