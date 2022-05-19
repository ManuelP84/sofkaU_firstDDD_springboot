package com.sofkaU.domainModelImplementation.domain.customer.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.domain.customer.values.MachineId;
import com.sofkaU.domainModelImplementation.domain.customer.values.MachineModel;

public class NewMachine extends Command {

    private final MachineId machineId;
    private final MachineModel machineModel;

    public NewMachine (MachineId entityId, MachineModel machineModel){
        this.machineId = entityId;
        this.machineModel = machineModel;
    }

    public MachineId getMachineId() {
        return machineId;
    }

    public MachineModel getMachineModel() {
        return machineModel;
    }
}
