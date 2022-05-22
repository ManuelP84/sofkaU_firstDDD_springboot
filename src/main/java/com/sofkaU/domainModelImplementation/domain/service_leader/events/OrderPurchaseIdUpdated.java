package com.sofkaU.domainModelImplementation.domain.service_leader.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.values.PurchaseOrderId;

public class OrderPurchaseIdUpdated extends DomainEvent {
    private final PurchaseOrderId purchaseOrderId;

    public OrderPurchaseIdUpdated(PurchaseOrderId purchaseOrderId) {
        super("sofkaU.serviceLeader.orderPurchaseIdUpdated");
        this.purchaseOrderId = purchaseOrderId;
    }

    public PurchaseOrderId getPurchaseOrderId() {
        return purchaseOrderId;
    }
}
