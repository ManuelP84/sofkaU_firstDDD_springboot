package com.sofkaU.domainModelImplementation.customer.comands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.customer.values.CustomerName;

public class UpdateCustomerName extends Command {

    private final CustomerName customerName;

    public UpdateCustomerName(CustomerName customerName) {
        this.customerName = customerName;
    }

    public CustomerName getCustomerName() {
        return customerName;
    }
}
