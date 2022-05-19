package com.sofkaU.domainModelImplementation.customer.comands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.customer.values.CustomerCountry;

public class UpdateCustomerCountry extends Command {

    private final CustomerCountry customerCountry;

    public UpdateCustomerCountry(CustomerCountry customerCountry) {

        this.customerCountry = customerCountry;
    }

    public CustomerCountry getCustomerCountry() {
        return customerCountry;
    }
}
