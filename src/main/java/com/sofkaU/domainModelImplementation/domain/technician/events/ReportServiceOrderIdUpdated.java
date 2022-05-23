package com.sofkaU.domainModelImplementation.domain.technician.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.values.ServiceOrderId;

public class ReportServiceOrderIdUpdated extends DomainEvent {
    private final ServiceOrderId serviceOrderId;

    public ReportServiceOrderIdUpdated(ServiceOrderId serviceOrderId) {
        super("sofkau.technician.reportServiceOrderIdUpdated");
        this.serviceOrderId = serviceOrderId;
    }

    public ServiceOrderId getServiceOrderId() {
        return serviceOrderId;
    }
}
