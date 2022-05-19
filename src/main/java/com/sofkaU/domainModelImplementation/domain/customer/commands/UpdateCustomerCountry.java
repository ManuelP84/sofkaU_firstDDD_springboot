package com.sofkaU.domainModelImplementation.domain.customer.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.domain.customer.values.CustomerCountry;

public class UpdateCustomerCountry extends Command {

    private final CustomerCountry customerCountry;

    public UpdateCustomerCountry(CustomerCountry customerCountry) {

        this.customerCountry = customerCountry;
    }

    public CustomerCountry getCustomerCountry() {
        return customerCountry;
    }
}
