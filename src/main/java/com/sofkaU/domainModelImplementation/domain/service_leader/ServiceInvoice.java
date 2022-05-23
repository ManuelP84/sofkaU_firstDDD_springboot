package com.sofkaU.domainModelImplementation.domain.service_leader;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.domainModelImplementation.domain.service_leader.values.ServiceFee;
import com.sofkaU.domainModelImplementation.domain.service_leader.values.ServiceInvoiceId;
import com.sofkaU.domainModelImplementation.domain.service_leader.values.TotalAmount;
import com.sofkaU.domainModelImplementation.domain.service_leader.values.TotalTime;
import com.sofkaU.domainModelImplementation.domain.values.ReportId;

public class ServiceInvoice extends Entity<ServiceInvoiceId> {
    private ReportId reportId;
    private TotalTime totalTime;
    private ServiceFee serviceFee;
    private TotalAmount totalAmount;

    public ServiceInvoice(ServiceInvoiceId entityId,
                          ReportId reportId,
                          TotalTime totalTime,
                          ServiceFee serviceFee,
                          TotalAmount totalAmount
    ){
        super(entityId);
        this.reportId = reportId;
        this.totalTime = totalTime;
        this.serviceFee = serviceFee;
        this.totalAmount = totalAmount;
    }

    public void updateReportId(ReportId reportId){
        this.reportId = reportId;
    }

    public void updateTotalTime(TotalTime totalTime){
        this.totalTime = totalTime;
    }

    public void updateServiceFee(ServiceFee serviceFee){
        this.serviceFee = serviceFee;
    }

    public void updateTotalAmount(TotalAmount totalAmount){
        this.totalAmount = totalAmount;
    }

    public ReportId reportId() {
        return reportId;
    }

    public TotalTime totalTime() {
        return totalTime;
    }

    public ServiceFee serviceFee() {
        return serviceFee;
    }

    public TotalAmount totalAmount() {
        return totalAmount;
    }
}
