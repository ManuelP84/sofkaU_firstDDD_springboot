package com.sofkaU.domainModelImplementation.domain.customer.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.domain.customer.values.*;
import com.sofkaU.domainModelImplementation.domain.values.PurchaseOrderId;

public class NewPurchaseOrder extends Command {

    private final PurchaseOrderId purchaseOrderId;
    private final TypeService     typeService;
    private final Description     description;
    private final DateOfService   dateOfService;
    private final Hours           hours;
    private final MachineId       machineId;

    public NewPurchaseOrder(
            PurchaseOrderId entityId,
            TypeService typeService,
            Description description,
            DateOfService dateOfService,
            Hours hours,
            MachineId machineId
    ){
        this.purchaseOrderId = entityId;
        this.typeService = typeService;
        this.description = description;
        this.dateOfService = dateOfService;
        this.hours = hours;
        this.machineId = machineId;
    }

    public PurchaseOrderId getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public TypeService getTypeService() {
        return typeService;
    }

    public Description getDescription() {
        return description;
    }

    public DateOfService getDateOfService() {
        return dateOfService;
    }

    public Hours getHours() {
        return hours;
    }

    public MachineId getMachineId() {
        return machineId;
    }
}
