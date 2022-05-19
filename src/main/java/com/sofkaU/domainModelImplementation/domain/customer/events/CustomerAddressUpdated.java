package com.sofkaU.domainModelImplementation.domain.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.customer.values.CustomerAddress;

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
