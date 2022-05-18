package com.sofkaU.domainModelImplementation.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.customer.values.MachineId;

public class PurchaseMachineIdUpdated extends DomainEvent {

    private final MachineId machineId;

    public PurchaseMachineIdUpdated(MachineId machineId) {
        super("sofkaU.customer.purchaseMachineIdUpdated");
        this.machineId = machineId;
    }

    public MachineId machineId(){
        return this.machineId;
    }
}
