package com.sofkaU.domainModelImplementation.domain.service_leader.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.values.CustomerId;
import com.sofkaU.domainModelImplementation.domain.values.PurchaseOrderId;
import com.sofkaU.domainModelImplementation.domain.values.TechnicianId;

public class ServiceOrderCreated extends DomainEvent {
    private final CustomerId customerId;
    private final PurchaseOrderId purchaseOrderId;
    private final TechnicianId technicianId;

    public ServiceOrderCreated(
            CustomerId customerId,
            PurchaseOrderId purchaseOrderId,
            TechnicianId technicianId
    ) {
        super("sofkaU.serviceLeader.serviceOrderCreated");
        this.customerId = customerId;
        this.purchaseOrderId = purchaseOrderId;
        this.technicianId = technicianId;
    }
}
