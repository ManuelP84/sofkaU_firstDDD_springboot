package com.sofkaU.domainModelImplementation.domain.technician.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.customer.values.Description;

public class ReportDescriptionUpdated extends DomainEvent {
    private final Description description;

    public ReportDescriptionUpdated(Description description) {
        super("sofkau.technician.reportDescriptionUpdated");
        this.description = description;
    }

    public Description getDescription() {
        return description;
    }
}
