package com.sofkaU.domainModelImplementation.domain.customer;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.domainModelImplementation.domain.customer.values.*;
import com.sofkaU.domainModelImplementation.domain.values.PurchaseOrderId;

import java.util.Objects;

public class PurchaseOrder extends Entity<PurchaseOrderId> {

    private TypeService   typeService;
    private Description   description;
    private DateOfService dateOfService;
    private Hours         hours;
    private MachineId     machineId;

    public PurchaseOrder(PurchaseOrderId entityId, TypeService typeService, Description description, DateOfService dateOfService, Hours hours, MachineId machineId) {
        super(entityId);
        this.typeService = typeService;
        this.description = description;
        this.dateOfService = dateOfService;
        this.hours = hours;
        this.machineId = machineId;

    }

    //Behaviors
    public void updateTypeService(TypeService typeService){
        this.typeService = Objects.requireNonNull(typeService);
    }

    public void updateDescription(Description description ){
        this.description = Objects.requireNonNull(description);
    }

    public void updateDatoOfService(DateOfService dateOfService ){
        this.dateOfService = Objects.requireNonNull(dateOfService);
    }

    public void updateHours(Hours hours ){
        this.hours = Objects.requireNonNull(hours);
    }

    public void updateMachineId(MachineId machineId){
        this.machineId = Objects.requireNonNull(machineId);
    }

    //Entity Attributes
    public TypeService typeService(){
        return typeService;
    }

    public Description description(){
        return description;
    }

    public DateOfService dateOfService(){
        return dateOfService;
    }

    public Hours hours(){
        return hours;
    }

    public MachineId machineId(){
        return machineId;
    }
}
