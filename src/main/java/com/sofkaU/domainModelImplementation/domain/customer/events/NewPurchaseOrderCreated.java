package com.sofkaU.domainModelImplementation.domain.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.customer.values.*;

public class NewPurchaseOrderCreated extends DomainEvent {

    private final PurchaseOrderId purchaseOrderId;
    private final TypeService     typeService;
    private final Description     description;
    private final DateOfService   dateOfService;
    private final Hours           hours;
    private final MachineId       machineId;

    public NewPurchaseOrderCreated(
            PurchaseOrderId purchaseOrderId,
            TypeService   typeService,
            Description   description,
            DateOfService dateOfService,
            Hours hours,
            MachineId machineId
    ){
        super("sofkaU.customer.newPurchaseOrderCreated");
        this.purchaseOrderId = purchaseOrderId;
        this.typeService = typeService;
        this.description = description;
        this.dateOfService = dateOfService;
        this.hours = hours;
        this.machineId = machineId;
    }

    public PurchaseOrderId getPurchaseOrderId(){
        return this.purchaseOrderId;
    }

    public TypeService getTypeService(){
        return this.typeService;
    }

    public Description getDescription(){
        return this.description;
    }

    public DateOfService getDateOfService(){
        return this.dateOfService;
    }

    public Hours getHours(){
        return this.hours;
    }

    public MachineId getMachineId(){
        return this.machineId;
    }
}
