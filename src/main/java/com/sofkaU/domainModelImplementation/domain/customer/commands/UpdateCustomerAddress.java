package com.sofkaU.domainModelImplementation.domain.customer.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.domain.customer.values.CustomerAddress;

public class UpdateCustomerAddress extends Command {

    private final CustomerAddress customerAddress;

    public UpdateCustomerAddress(CustomerAddress customerAddress) {

        this.customerAddress = customerAddress;
    }

    public CustomerAddress getCustomerAddress() {
        return customerAddress;
    }
}
