package com.sofkaU.domainModelImplementation.domain.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.customer.values.MachineId;
import com.sofkaU.domainModelImplementation.domain.customer.values.MachineModel;

public class NewMachineAdded extends DomainEvent {

    private final MachineId machineId;
    private final MachineModel machineModel;

    public NewMachineAdded(MachineId machineId, MachineModel machineModel){
        super("sofkaU.customer.newMachineAdded");
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
