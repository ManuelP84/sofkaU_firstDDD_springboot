package com.sofkaU.domainModelImplementation.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.domainModelImplementation.domain.customer.Customer;
import com.sofkaU.domainModelImplementation.domain.customer.commands.CreateCustomer;

public class CreateCustomerUseCase extends UseCase<RequestCommand<CreateCustomer>, ResponseEvents>{

    @Override
    public void executeUseCase(RequestCommand<CreateCustomer> createCustomerRequestCommand) {
        var command = createCustomerRequestCommand.getCommand();
        var customer = new Customer(
                command.getCustomerId(),
                command.getCustomerName(),
                command.getCustomerAddress(),
                command.getCustomerCountry()
        );

        emit().onResponse(new ResponseEvents(customer.getUncommittedChanges()));
    }
}