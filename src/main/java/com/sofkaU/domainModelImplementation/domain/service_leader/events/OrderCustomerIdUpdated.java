package com.sofkaU.domainModelImplementation.domain.service_leader.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.values.CustomerId;

public class OrderCustomerIdUpdated extends DomainEvent {
    private final CustomerId customerId;

    public OrderCustomerIdUpdated(CustomerId customerId) {
        super("sofkaU.serviceOrder.OrderServiceCustomerIdUpdated");
        this.customerId = customerId;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }
}
