package com.sofkaU.domainModelImplementation.domain.service_leader.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.values.TechnicianId;

public class OrderTechnicianIdUpdated extends DomainEvent {
    private final TechnicianId technicianId;

    public OrderTechnicianIdUpdated(TechnicianId technicianId) {
        super("sofkaU.serviceLeader.technicianIdUpdated");
        this.technicianId = technicianId;
    }

    public TechnicianId getTechnicianId() {
        return technicianId;
    }
}
