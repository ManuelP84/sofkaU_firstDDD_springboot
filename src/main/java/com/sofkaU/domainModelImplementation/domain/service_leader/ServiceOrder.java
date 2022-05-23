package com.sofkaU.domainModelImplementation.domain.service_leader;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.domainModelImplementation.domain.values.CustomerId;
import com.sofkaU.domainModelImplementation.domain.values.PurchaseOrderId;
import com.sofkaU.domainModelImplementation.domain.values.ServiceOrderId;
import com.sofkaU.domainModelImplementation.domain.values.TechnicianId;

public class ServiceOrder extends Entity<ServiceOrderId> {
    private CustomerId customerId;
    private PurchaseOrderId purchaseOrderId;
    private TechnicianId technicianId;

    public ServiceOrder(
            ServiceOrderId entityId,
            CustomerId customerId,
            PurchaseOrderId purchaseOrderId,
            TechnicianId technicianId
            ){
        super(entityId);
        this.customerId = customerId;
        this.purchaseOrderId = purchaseOrderId;
        this.technicianId = technicianId;
    }

    public void updateCustomerId(CustomerId customerId){
        this.customerId = customerId;
    }

    public void updatePurchaseOrderId(PurchaseOrderId purchaseOrderId){
        this.purchaseOrderId = purchaseOrderId;
    }

    public void updateTechnicianId(TechnicianId technicianId){
        this.technicianId = technicianId;
    }

    public CustomerId customerId() {
        return customerId;
    }

    public PurchaseOrderId purchaseOrderId() {
        return purchaseOrderId;
    }

    public TechnicianId technicianId() {
        return technicianId;
    }
}
