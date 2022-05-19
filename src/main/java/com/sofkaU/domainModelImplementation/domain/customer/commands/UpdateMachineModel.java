package com.sofkaU.domainModelImplementation.domain.customer.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.domain.customer.values.MachineId;
import com.sofkaU.domainModelImplementation.domain.customer.values.MachineModel;

public class UpdateMachineModel extends Command {

    private final MachineId machineId;
    private final MachineModel machineModel;

    public UpdateMachineModel(MachineId machineId, MachineModel machineModel) {
        this.machineId = machineId;
        this.machineModel = machineModel;
    }

    public MachineId getMachineId() {
        return machineId;
    }

    public MachineModel getMachineModel() {
        return machineModel;
    }
}
