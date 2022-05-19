package com.sofkaU.domainModelImplementation.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofkaU.domainModelImplementation.domain.customer.Customer;
import com.sofkaU.domainModelImplementation.domain.customer.commands.NewMachine;

public class NewMachineUseCase extends UseCase<RequestCommand<NewMachine>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<NewMachine> newMachineRequestCommand) {
        var command = newMachineRequestCommand.getCommand();
        var customer = Customer.from(command.getCustomerId(), retrieveEvents(command.getCustomerId().value()));
        customer.newMachine(command.getMachineId(), command.getMachineModel());

        emit().onResponse(new ResponseEvents(customer.getUncommittedChanges()));
    }
}
