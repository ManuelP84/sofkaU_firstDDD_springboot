package com.sofkaU.domainModelImplementation.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofkaU.domainModelImplementation.domain.customer.commands.CreateCustomer;
import com.sofkaU.domainModelImplementation.domain.customer.events.CustomerCreated;
import com.sofkaU.domainModelImplementation.domain.customer.values.CustomerAddress;
import com.sofkaU.domainModelImplementation.domain.customer.values.CustomerCountry;
import com.sofkaU.domainModelImplementation.domain.values.CustomerId;
import com.sofkaU.domainModelImplementation.domain.customer.values.CustomerName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateCustomerUseCaseTest {

    @Test
    void createCustomer() {
        //Arrange
        var command = new CreateCustomer(
                CustomerId.of("xxxxx"),
                new CustomerName("KraussMaffei"),
                new CustomerAddress("Cra 26 Nro. 92 -178"),
                new CustomerCountry("Colombia")
        );

        var useCase = new CreateCustomerUseCase();

        // Act

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(() -> new IllegalArgumentException("Something went bad!"))
                .getDomainEvents();

        //
        var event = (CustomerCreated)events.get(0);
        Assertions.assertEquals(command.getCustomerName().value(), event.getCustomerName().value());
        Assertions.assertEquals(command.getCustomerAddress().value(), event.getCustomerAddress().value());
        Assertions.assertEquals(command.getCustomerCountry().value(), event.getCustomerCountry().value());
    }
}

