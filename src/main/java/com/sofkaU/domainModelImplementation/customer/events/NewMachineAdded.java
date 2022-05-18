package com.sofkaU.domainModelImplementation.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.customer.values.MachineId;
import com.sofkaU.domainModelImplementation.customer.values.MachineModel;

public class NewMachineAdded extends DomainEvent {

    private final MachineId machineId;
    private final MachineModel machineModel;

    public NewMachineAdded(MachineId machineId, MachineModel machineModel){
        super("sofkaU.customer.newMachineAdded");
        this.machineId = machineId;
        this.machineModel = machineModel;
    }

    public MachineModel machineModel(){
        return this.machineModel;
    }
}
