package com.sofkaU.domainModelImplementation.domain.service_leader.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.service_leader.values.TotalAmount;

public class InvoiceTotalAmountUpdated extends DomainEvent {
    private final TotalAmount totalAmount;

    public InvoiceTotalAmountUpdated(TotalAmount totalAmount) {
        super("sofkaU.serviceLeader.invoiceTotalAmountUpdated");
        this.totalAmount = totalAmount;
    }

    public TotalAmount getTotalAmount() {
        return totalAmount;
    }
}
