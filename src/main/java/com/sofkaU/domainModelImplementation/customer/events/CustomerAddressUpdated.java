package com.sofkaU.domainModelImplementation.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.customer.values.CustomerAddress;

public class CustomerAddressUpdated extends DomainEvent {

        private final CustomerAddress customerAddress;

    public CustomerAddressUpdated(CustomerAddress customerAddress) {
        super("sofkaU.customer.customerAddressUpdated");
        this.customerAddress = customerAddress;
    }

    public CustomerAddress getCustomerAddress(){
        return this.customerAddress;
    }
}
