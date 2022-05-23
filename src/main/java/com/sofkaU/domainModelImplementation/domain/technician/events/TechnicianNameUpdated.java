package com.sofkaU.domainModelImplementation.domain.technician.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.technician.values.TechnicianName;

public class TechnicianNameUpdated extends DomainEvent {
    private final TechnicianName name;

    public TechnicianNameUpdated(TechnicianName name) {
        super("sofkau.technician.technicianNameUpdated");
        this.name = name;
    }

    public TechnicianName getName() {
        return name;
    }
}
