package com.sofkaU.domainModelImplementation.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.customer.values.CustomerAddress;
import com.sofkaU.domainModelImplementation.customer.values.CustomerCountry;
import com.sofkaU.domainModelImplementation.customer.values.CustomerName;

public class CustomerCreated extends DomainEvent {
    private final       CustomerName    customerName;
    private final       CustomerAddress customerAddress;
    private final       CustomerCountry customerCountry;

    public CustomerCreated(CustomerName customerName, CustomerAddress customerAddress, CustomerCountry customerCountry) {
        super("sofkaU.customer.customerCreated");
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerCountry = customerCountry;
    }

    public CustomerName getCustomerName() {
        return this.customerName;
    }

    public CustomerAddress getCustomerAddress(){
        return this.customerAddress;
    }

    public CustomerCountry getCustomerCountry(){
        return this.customerCountry;
    }
}
