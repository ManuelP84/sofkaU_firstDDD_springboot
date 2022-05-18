package com.sofkaU.domainModelImplementation.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.customer.values.MachineModel;

public class MachineModelUpdated extends DomainEvent {

    private final MachineModel machineModel;

    public MachineModelUpdated(MachineModel machineModel) {
        super("sofkaU.customer.machineModelUpdated");
        this.machineModel = machineModel;
    }

    public MachineModel machineModel(){
        return machineModel;
    }
}
