package com.sofkaU.domainModelImplementation.customer.comands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.customer.values.CustomerAddress;

public class UpdateCustomerAddress extends Command {

    private final CustomerAddress customerAddress;

    public UpdateCustomerAddress(CustomerAddress customerAddress) {

        this.customerAddress = customerAddress;
    }

    public CustomerAddress getCustomerAddress() {
        return customerAddress;
    }
}
