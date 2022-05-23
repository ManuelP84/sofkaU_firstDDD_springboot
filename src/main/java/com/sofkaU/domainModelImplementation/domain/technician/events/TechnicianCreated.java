package com.sofkaU.domainModelImplementation.domain.technician.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.technician.values.TechnicianExperience;
import com.sofkaU.domainModelImplementation.domain.technician.values.TechnicianName;
import com.sofkaU.domainModelImplementation.domain.technician.values.TechnicianPassport;

public class TechnicianCreated extends DomainEvent {
    private final TechnicianName name;
    private final TechnicianExperience experience;
    private final TechnicianPassport passport;

    public TechnicianCreated(TechnicianName name,
                             TechnicianExperience experience,
                             TechnicianPassport passport) {
        super("sofkau.technician.technicianCreated");
        this.name = name;
        this.experience = experience;
        this.passport = passport;
    }

    public TechnicianName getName() {
        return name;
    }

    public TechnicianExperience getExperience() {
        return experience;
    }

    public TechnicianPassport getPassport() {
        return passport;
    }
}
