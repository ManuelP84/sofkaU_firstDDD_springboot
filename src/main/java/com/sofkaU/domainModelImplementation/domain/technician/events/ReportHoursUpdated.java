package com.sofkaU.domainModelImplementation.domain.technician.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.customer.values.Hours;

public class ReportHoursUpdated extends DomainEvent {
    private final Hours hours;

    public ReportHoursUpdated(Hours hours) {
        super("sofkau.technician.reportHoursUpdated");
        this.hours = hours;
    }

    public Hours getHours() {
        return hours;
    }
}
