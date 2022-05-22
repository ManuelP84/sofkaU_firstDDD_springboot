package com.sofkaU.domainModelImplementation.domain.customer.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.domain.customer.values.CustomerAddress;
import com.sofkaU.domainModelImplementation.domain.customer.values.CustomerCountry;
import com.sofkaU.domainModelImplementation.domain.values.CustomerId;
import com.sofkaU.domainModelImplementation.domain.customer.values.CustomerName;

public class CreateCustomer extends Command {

    private final CustomerId   customerId;
    private final CustomerName customerName;
    private final CustomerAddress    customerAddress;
    private final CustomerCountry    customerCountry;

    public CreateCustomer(
            CustomerId   customerId,
            CustomerName customerName,
            CustomerAddress customerAddress,
            CustomerCountry customerCountry
    ){
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerCountry = customerCountry;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public CustomerName getCustomerName() {
        return customerName;
    }

    public CustomerAddress getCustomerAddress() {
        return customerAddress;
    }

    public CustomerCountry getCustomerCountry() {
        return customerCountry;
    }
}
