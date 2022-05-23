package com.sofkaU.domainModelImplementation.domain.technician.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.technician.values.TechnicianPassport;

public class PassportUpdated extends DomainEvent {
    private final TechnicianPassport technicianPassport;

    public PassportUpdated(TechnicianPassport technicianPassport) {
        super("sofkaU.technician.passportUpdated");
        this.technicianPassport = technicianPassport;
    }

    public TechnicianPassport getTechnicianPassport() {
        return technicianPassport;
    }
}
