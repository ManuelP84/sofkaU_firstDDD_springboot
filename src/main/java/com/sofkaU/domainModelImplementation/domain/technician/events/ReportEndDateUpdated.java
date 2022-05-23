package com.sofkaU.domainModelImplementation.domain.technician.events;

import co.com.sofka.domain.generic.DomainEvent;

public class ReportEndDateUpdated extends DomainEvent {
    private final ReportEndDateUpdated endDate;

    public ReportEndDateUpdated(ReportEndDateUpdated endDate) {
        super("sofkau.technician.reportEndDateUpdated");
        this.endDate = endDate;
    }

    public ReportEndDateUpdated getEndDate() {
        return endDate;
    }
}
