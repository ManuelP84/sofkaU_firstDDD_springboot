package com.sofkaU.domainModelImplementation.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.customer.values.CustomerName;

public class CustomerNameUpdated extends DomainEvent {

    private final CustomerName customerName;

    public CustomerNameUpdated(CustomerName customerName) {
        super("sofkaU.customer.customerNameUpdated");
        this.customerName = customerName;
    }

    public CustomerName getCustomerName(){
        return this.customerName;
    }
}
