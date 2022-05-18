package com.sofkaU.domainModelImplementation.customer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.customer.values.CustomerCountry;

public class CustomerCountryUpdated extends DomainEvent {

    private final CustomerCountry customerCountry;

    public CustomerCountryUpdated(CustomerCountry customerCountry) {
        super("sofkaU.customer.customerCountryUpdated");
        this.customerCountry = customerCountry;
    }

    public CustomerCountry customerCountry(){
        return this.customerCountry;
    }
}
