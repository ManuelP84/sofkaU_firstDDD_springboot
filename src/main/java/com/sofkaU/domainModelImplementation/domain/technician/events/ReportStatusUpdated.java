package com.sofkaU.domainModelImplementation.domain.technician.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.technician.values.ReportStatus;

public class ReportStatusUpdated extends DomainEvent {
    private final ReportStatus reportStatus;

    public ReportStatusUpdated(ReportStatus reportStatus) {
        super("sofkau.technician.reportStatusUpdated");
        this.reportStatus = reportStatus;
    }

    public ReportStatus getReportStatus() {
        return reportStatus;
    }
}
