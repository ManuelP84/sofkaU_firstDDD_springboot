package com.sofkaU.domainModelImplementation.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.customer.values.*;

public class NewPurchaseOrderCreated extends DomainEvent {

    private final PurchaseOrderId purchaseOrderId;
    private final TypeService   typeService;
    private final Description   description;
    private final DateOfService dateOfService;
    private final Hours         hours;
    private final MachineId     machineId;

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

    public TypeService typeService(){
        return this.typeService;
    }

    public Description description(){
        return this.description;
    }

    public DateOfService dateOfService(){
        return this.dateOfService;
    }

    public Hours hours(){
        return this.hours;
    }

    public MachineId machineId(){
        return this.machineId;
    }
}
