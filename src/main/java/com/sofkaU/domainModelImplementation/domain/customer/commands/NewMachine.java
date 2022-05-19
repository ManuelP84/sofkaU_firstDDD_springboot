package com.sofkaU.domainModelImplementation.domain.customer.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.domain.customer.values.CustomerId;
import com.sofkaU.domainModelImplementation.domain.customer.values.MachineId;
import com.sofkaU.domainModelImplementation.domain.customer.values.MachineModel;

public class NewMachine extends Command {

    private final CustomerId customerId;
    private final MachineId machineId;
    private final MachineModel machineModel;

    public NewMachine (CustomerId customerId, MachineId entityId, MachineModel machineModel){
        this.customerId = customerId;
        this.machineId = entityId;
        this.machineModel = machineModel;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public MachineId getMachineId() {
        return machineId;
    }

    public MachineModel getMachineModel() {
        return machineModel;
    }
}
