package com.sofkaU.domainModelImplementation.customer.comands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.customer.values.MachineId;
import com.sofkaU.domainModelImplementation.customer.values.MachineModel;

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
