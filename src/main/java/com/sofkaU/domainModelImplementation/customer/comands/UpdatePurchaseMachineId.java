package com.sofkaU.domainModelImplementation.customer.comands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.customer.values.MachineId;
import com.sofkaU.domainModelImplementation.customer.values.PurchaseOrderId;

public class UpdatePurchaseMachineId extends Command {

    private final PurchaseOrderId purchaseOrderId;
    private final MachineId       machineId;

    public UpdatePurchaseMachineId(PurchaseOrderId purchaseOrderId, MachineId machineId) {
        this.purchaseOrderId = purchaseOrderId;
        this.machineId = machineId;
    }

    public PurchaseOrderId getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public MachineId getMachineId() {
        return machineId;
    }
}
