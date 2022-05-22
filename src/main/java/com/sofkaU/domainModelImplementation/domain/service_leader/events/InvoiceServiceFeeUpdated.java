package com.sofkaU.domainModelImplementation.domain.service_leader.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.service_leader.values.ServiceFee;

public class InvoiceServiceFeeUpdated extends DomainEvent {
    private final ServiceFee serviceFee;

    public InvoiceServiceFeeUpdated(ServiceFee serviceFee) {
        super("sofkaU.serviceLeader.invoiceFeeUpdated");
        this.serviceFee = serviceFee;
    }

    public ServiceFee getServiceFee() {
        return serviceFee;
    }
}
