package com.sofkaU.domainModelImplementation.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofkaU.domainModelImplementation.domain.customer.Customer;
import com.sofkaU.domainModelImplementation.domain.customer.Machine;
import com.sofkaU.domainModelImplementation.domain.customer.commands.NewMachine;
import com.sofkaU.domainModelImplementation.domain.customer.events.CustomerCreated;
import com.sofkaU.domainModelImplementation.domain.customer.events.NewMachineAdded;
import com.sofkaU.domainModelImplementation.domain.customer.values.*;
import com.sofkaU.domainModelImplementation.usecase.NewMachineUseCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class NewMachineUseCaseTest {

    private final String ROOTID = "xxxxx";

    @Mock
    private DomainEventRepository repository;

    @Test
    void newMachine() {
        var command = new NewMachine(CustomerId.of(ROOTID), MachineId.of("610543332"), new MachineModel("KM1000-SP43000"));
        var useCase = new NewMachineUseCase();

        Mockito.when(repository.getEventsBy(ROOTID)).thenReturn(List.of(
                new CustomerCreated(
                        new CustomerName("Pladesan"),
                        new CustomerAddress("Cra 15 Nro. 9 -34"),
                        new CustomerCountry("Colombia")
                )
        ));

        useCase.addRepository(repository);
        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor(ROOTID)
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(() -> new IllegalArgumentException("Something went bad!"))
                .getDomainEvents();

        var event = (NewMachineAdded)events.get(0);
        Assertions.assertEquals(command.getMachineModel().value(), event.getMachineModel().value());
        //Assertions.assertEquals(command.getCustomerAddress().value(), event.getCustomerAddress().value());
    }
}
