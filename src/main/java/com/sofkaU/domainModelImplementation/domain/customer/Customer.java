package com.sofkaU.domainModelImplementation.domain.customer;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.customer.events.*;
import com.sofkaU.domainModelImplementation.domain.customer.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Customer extends AggregateEvent<CustomerId> {
    protected CustomerName    customerName;
    protected CustomerAddress customerAddress;
    protected CustomerCountry customerCountry;
    protected Set<Machine>    machines;
    protected Set<PurchaseOrder> purchaseOrders;

    public Customer(
            CustomerId entityId,
            CustomerName customerName,
            CustomerAddress customerAddress,
            CustomerCountry customerCountry
    ){
        super(entityId);
        appendChange(new CustomerCreated(customerName, customerAddress, customerCountry)).apply();
    }

    private Customer(CustomerId entityId){
        super(entityId);
        subscribe(new CustomerChange(this));
    }

    public static Customer from(CustomerId customerId, List<DomainEvent> events){
        var customer = new Customer(customerId);
        events.forEach(customer::applyEvent);
        return customer;
    }

    // Domain Behaviors
    public void newMachine(MachineId entityId, MachineModel machineModel){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(machineModel);
        appendChange(new NewMachineAdded(entityId, machineModel)).apply();
    }

    public void newPuschaseOrder(
            PurchaseOrderId entityId,
            TypeService typeService,
            Description description,
            DateOfService dateOfService,
            Hours hours,
            MachineId machineId
    ){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(typeService);
        Objects.requireNonNull(description);
        Objects.requireNonNull(dateOfService);
        Objects.requireNonNull(hours);
        Objects.requireNonNull(machineId);
        appendChange(new NewPurchaseOrderCreated(entityId, typeService, description, dateOfService, hours, machineId)).apply();
    }

    public void updateCustomerName(CustomerName customerName){
        Objects.requireNonNull(customerName);
        appendChange(new CustomerNameUpdated(customerName)).apply();
    }

    public void updateCustomerAddress(CustomerAddress customerAddress){
        Objects.requireNonNull(customerAddress);
        appendChange(new CustomerAddressUpdated(customerAddress)).apply();
    }

    public void updateCustomerCountry(CustomerCountry customerCountry){
        Objects.requireNonNull(customerCountry);
        appendChange(new CustomerCountryUpdated(customerCountry)).apply();
    }

    public void updateMachineModel(MachineId entityId, MachineModel machineModel){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(machineModel);
        appendChange(new MachineModelUpdated(entityId, machineModel)).apply();
    }

    public void updatePurchaseTypeService(PurchaseOrderId entityId, TypeService typeService){
        Objects.requireNonNull(typeService);
        appendChange(new PurchaseTypeServiceUpdated(entityId, typeService)).apply();
    }

    public void updatePurchaseDescription(PurchaseOrderId entityId, Description description){
        Objects.requireNonNull(description);
        appendChange(new PurchaseDescriptionUpdated(entityId, description)).apply();
    }

    public void updatePurchaseDateOfService(PurchaseOrderId entityId, DateOfService dateOfService){
        Objects.requireNonNull(dateOfService);
        appendChange(new PurchaseDateOfServiceUpdated(entityId, dateOfService)).apply();
    }

    public void updatePurchaseHours(PurchaseOrderId entity, Hours hours){
        Objects.requireNonNull(hours);
        appendChange(new PurchaseHoursUpdated(entity, hours)).apply();
    }

    public void updatePurchaseMachineId(PurchaseOrderId entityId, MachineId machineId){
        Objects.requireNonNull(machineId);
        appendChange(new PurchaseMachineIdUpdated(entityId, machineId)).apply();
    }

    // Methods
    protected Optional<PurchaseOrder> getPurchaseOrderById(PurchaseOrderId entityId){
        return purchaseOrders()
                .stream()
                .filter(purchaseOrder -> purchaseOrder.identity().equals(entityId))
                .findFirst();
    }

    protected Optional<Machine> getMachineById(MachineId entityId){
        return machines()
                .stream()
                .filter(machine -> machine.identity().equals(entityId))
                .findFirst();
    }

    //Entity attributes
    public CustomerName customerName(){
        return this.customerName;
    }

    public CustomerAddress customerAddress(){
        return this.customerAddress;
    }

    public CustomerCountry customerCountry(){
        return this.customerCountry;
    }

    public Set<Machine> machines(){
        return this.machines;
    }

    public Set<PurchaseOrder> purchaseOrders(){
        return this.purchaseOrders;
    }
}
