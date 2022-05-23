package com.sofkaU.domainModelImplementation.domain.technician.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.technician.values.TechnicianExperience;

public class ExperienceUpdated extends DomainEvent {
    private final TechnicianExperience technicianExperience;

    public ExperienceUpdated(TechnicianExperience technicianExperience) {
        super("sofkaU.technician.experienceUpdated");
        this.technicianExperience = technicianExperience;
    }

    public TechnicianExperience getTechnicianExperience() {
        return technicianExperience;
    }
}
