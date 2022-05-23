package com.sofkaU.domainModelImplementation.domain.technician.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.customer.values.Hours;
import com.sofkaU.domainModelImplementation.domain.technician.values.ReportDescription;
import com.sofkaU.domainModelImplementation.domain.technician.values.ReportStatus;
import com.sofkaU.domainModelImplementation.domain.values.ServiceOrderId;

public class ReportCreated extends DomainEvent {
    private final ReportStatus reportStatus;
    private final ReportDescription reportDescription;
    private final Hours hours;
    private final ServiceOrderId serviceOrderId;
    private final ReportEndDateUpdated reportEndDateUpdated;

    public ReportCreated(
            ReportStatus reportStatus,
            ReportDescription reportDescription,
            Hours hours,
            ServiceOrderId serviceOrderId,
            ReportEndDateUpdated reportEndDateUpdated
    ){
        super("sofkaU.technician.reportCreated");
        this.reportStatus = reportStatus;
        this.reportDescription = reportDescription;
        this.hours = hours;
        this.serviceOrderId = serviceOrderId;
        this.reportEndDateUpdated = reportEndDateUpdated;
    }

    public ReportStatus getReportStatus() {
        return reportStatus;
    }

    public ReportDescription getReportDescription() {
        return reportDescription;
    }

    public Hours getHours() {
        return hours;
    }

    public ServiceOrderId getServiceOrderId() {
        return serviceOrderId;
    }

    public ReportEndDateUpdated getReportEndDateUpdated() {
        return reportEndDateUpdated;
    }
}
