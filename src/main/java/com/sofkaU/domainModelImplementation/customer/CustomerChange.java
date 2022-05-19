package com.sofkaU.domainModelImplementation.customer;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.domainModelImplementation.customer.events.*;
import com.sofkaU.domainModelImplementation.customer.values.*;

import java.util.HashSet;

public class CustomerChange extends EventChange {
    public CustomerChange(Customer customer){

        apply((CustomerCreated event) -> {
            customer.customerName = event.getCustomerName();
            customer.customerAddress = event.getCustomerAddress();
            customer.customerCountry = event.getCustomerCountry();
            customer.machines = new HashSet<>();
            customer.purchaseOrders = new HashSet<>();
        });

        apply((CustomerNameUpdated event) -> {
            customer.customerName = event.getCustomerName();
        });

        apply((CustomerAddressUpdated event) -> {
            customer.customerAddress = event.getCustomerAddress();
        });

        apply((CustomerCountryUpdated event) -> {
            customer.customerCountry = event.getCustomerCountry();
        });

        apply((NewMachineAdded event) ->{
            customer.machines.add(new Machine(
                    event.getMachineId(),
                    event.getMachineModel()
            ));
        });

        apply((NewPurchaseOrderCreated event) -> {
            customer.purchaseOrders.add(new PurchaseOrder(
                    event.getPurchaseOrderId(),
                    event.getTypeService(),
                    event.getDescription(),
                    event.getDateOfService(),
                    event.getHours(),
                    event.getMachineId()
            ));
        });

        apply((MachineModelUpdated event) ->{
            var machine = customer
                    .getMachineById(event.getMachineId())
                    .orElseThrow(() -> new IllegalArgumentException("Machine not found"));
            machine.updateModel(event.getMachineModel());
        });

        apply((PurchaseDateOfServiceUpdated event) -> {
            var purchaseOrder = customer
                    .getPurchaseOrderById(event.getPurchaseOrderId())
                    .orElseThrow(() -> new IllegalArgumentException("Purchase not found"));
            purchaseOrder.updateDatoOfService(event.getDateOfService());
        });

        apply((PurchaseDescriptionUpdated event) ->{
            var purchaseOrder = customer
                    .getPurchaseOrderById(event.getPurchaseOrderId())
                    .orElseThrow(() -> new IllegalArgumentException("Purchase not found"));
            purchaseOrder.updateDescription(event.getDescription());
        });

        apply((PurchaseHoursUpdated event) -> {
            var purchaseOrder = customer
                    .getPurchaseOrderById(event.getPurchaseOrderId())
                    .orElseThrow(() -> new IllegalArgumentException("Purchase not found"));
            purchaseOrder.updateHours(event.getHours());
        });

        apply((PurchaseMachineIdUpdated event) -> {
            var purchaseOrder = customer
                    .getPurchaseOrderById(event.getPurchaseOrderId())
                    .orElseThrow(() -> new IllegalArgumentException("Purchase not found"));
            purchaseOrder.updateMachineId(event.getMachineId());
        });

        apply((PurchaseTypeServiceUpdated event) -> {
            var purchaseOrder = customer
                    .getPurchaseOrderById(event.getPurchaseOrderId())
                    .orElseThrow(() -> new IllegalArgumentException("Purchase not found"));
            purchaseOrder.updateTypeService(event.getTypeService());
        });

    }
}
