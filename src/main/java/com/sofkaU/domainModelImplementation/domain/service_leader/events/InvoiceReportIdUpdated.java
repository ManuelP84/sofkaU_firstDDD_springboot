package com.sofkaU.domainModelImplementation.domain.service_leader.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.values.ReportId;

public class InvoiceReportIdUpdated extends DomainEvent {
    private final ReportId reportId;

    public InvoiceReportIdUpdated(ReportId reportId) {
        super("sofkaU.serviceLeader.invoiceReportIdUpdated");
        this.reportId = reportId;
    }

    public ReportId getReportId() {
        return reportId;
    }
}
