package com.sofkaU.domainModelImplementation.domain.service_leader.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.service_leader.values.ServiceFee;
import com.sofkaU.domainModelImplementation.domain.service_leader.values.TotalAmount;
import com.sofkaU.domainModelImplementation.domain.service_leader.values.TotalTime;
import com.sofkaU.domainModelImplementation.domain.values.ReportId;

public class ServiceInvoiceCreated extends DomainEvent {
    private final ReportId reportId;
    private final TotalTime totalTime;
    private final ServiceFee serviceFee;
    private final TotalAmount totalAmount;

    public ServiceInvoiceCreated(
            ReportId reportId,
            TotalTime totalTime,
            ServiceFee serviceFee,
            TotalAmount totalAmount
    ) {
        super("sofkaU.serviceLeader.serviceInvoiceCreated");
        this.reportId = reportId;
        this.totalTime = totalTime;
        this.serviceFee = serviceFee;
        this.totalAmount = totalAmount;
    }

    public ReportId getReportId() {
        return reportId;
    }

    public TotalTime getTotalTime() {
        return totalTime;
    }

    public ServiceFee getServiceFee() {
        return serviceFee;
    }

    public TotalAmount getTotalAmount() {
        return totalAmount;
    }
}
