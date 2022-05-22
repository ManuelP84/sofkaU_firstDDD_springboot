package com.sofkaU.domainModelImplementation.domain.service_leader.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.service_leader.values.TotalTime;

public class InvoiceTotalTimeUpdated extends DomainEvent {
    private final TotalTime totalTime;

    public InvoiceTotalTimeUpdated(TotalTime totalTime) {
        super("sofkaU.serviceLeader.invoiceTotalTimeUpdated");
        this.totalTime = totalTime;
    }

    public TotalTime getTotalTime() {
        return totalTime;
    }
}
