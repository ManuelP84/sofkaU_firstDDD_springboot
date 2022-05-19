package com.sofkaU.domainModelImplementation.customer.comands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.customer.values.MachineId;
import com.sofkaU.domainModelImplementation.customer.values.MachineModel;

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
