package com.sofkaU.domainModelImplementation.domain.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.customer.values.MachineId;
import com.sofkaU.domainModelImplementation.domain.customer.values.MachineModel;

public class MachineModelUpdated extends DomainEvent {

    private final MachineId machineId;
    private final MachineModel machineModel;

    public MachineModelUpdated(MachineId machineId, MachineModel machineModel) {
        super("sofkaU.customer.machineModelUpdated");
        this.machineId = machineId;
        this.machineModel = machineModel;
    }

    public MachineId getMachineId(){
        return this.machineId;
    }

    public MachineModel getMachineModel(){
        return this.machineModel;
    }
}
