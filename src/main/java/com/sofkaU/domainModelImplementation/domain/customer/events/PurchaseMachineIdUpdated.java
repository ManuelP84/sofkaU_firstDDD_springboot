package com.sofkaU.domainModelImplementation.domain.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.customer.values.MachineId;
import com.sofkaU.domainModelImplementation.domain.customer.values.PurchaseOrderId;

public class PurchaseMachineIdUpdated extends DomainEvent {

    private final PurchaseOrderId purchaseOrderId;
    private final MachineId machineId;

    public PurchaseMachineIdUpdated(PurchaseOrderId purchaseOrderId, MachineId machineId) {
        super("sofkaU.customer.purchaseMachineIdUpdated");
        this.purchaseOrderId = purchaseOrderId;
        this.machineId = machineId;
    }

    public PurchaseOrderId getPurchaseOrderId(){
        return this.purchaseOrderId;
    }

    public MachineId getMachineId(){
        return this.machineId;
    }
}
