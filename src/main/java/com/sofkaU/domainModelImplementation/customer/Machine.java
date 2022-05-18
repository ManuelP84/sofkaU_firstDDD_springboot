package com.sofkaU.domainModelImplementation.customer;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.domainModelImplementation.customer.values.MachineId;
import com.sofkaU.domainModelImplementation.customer.values.MachineModel;

import java.util.Objects;

public class Machine extends Entity<MachineId> {

    private MachineModel machineModel;

    public Machine(MachineId entityId, MachineModel machineModel) {
        super(entityId);
        this.machineModel = machineModel;
    }

    //Behaviors
    public void updateModel(MachineModel machineModel){
        this.machineModel = Objects.requireNonNull(machineModel);
    }

    //Entity Attributes
    public MachineModel machineModel(){
        return machineModel;
    }
}
