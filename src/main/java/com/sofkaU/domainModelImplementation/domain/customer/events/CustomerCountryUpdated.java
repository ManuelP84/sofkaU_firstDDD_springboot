package com.sofkaU.domainModelImplementation.domain.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.customer.values.CustomerCountry;

public class CustomerCountryUpdated extends DomainEvent {

    private final CustomerCountry customerCountry;

    public CustomerCountryUpdated(CustomerCountry customerCountry) {
        super("sofkaU.customer.customerCountryUpdated");
        this.customerCountry = customerCountry;
    }

    public CustomerCountry getCustomerCountry(){
        return this.customerCountry;
    }
}
