package com.sofkaU.domainModelImplementation.domain.service_leader;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.service_leader.events.*;
import com.sofkaU.domainModelImplementation.domain.service_leader.values.*;
import com.sofkaU.domainModelImplementation.domain.values.*;
import org.springframework.validation.ObjectError;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class ServiceLeader extends AggregateEvent<ServiceLeaderId> {
    protected ServiceLeaderName serviceLeaderName;
    protected Set<ServiceInvoice> serviceInvoices;
    protected Set<ServiceOrder> serviceOrders;

    public ServiceLeader(
            ServiceLeaderId entityId,
            ServiceLeaderName name
    ){
        super(entityId);
        appendChange(new ServiceLeaderCreated(name)).apply();
    }

    private ServiceLeader(ServiceLeaderId serviceLeaderId){
        super(serviceLeaderId);
        subscribe(new ServiceLeaderChange(this));
    }

    public static ServiceLeader from(ServiceLeaderId serviceLeaderId, List<DomainEvent> events){
        var servieLeader = new ServiceLeader(serviceLeaderId);
        events.forEach(servieLeader::applyEvent);
        return servieLeader;
    }

    public void createServiceOrder(CustomerId customerId,
                                   PurchaseOrderId purchaseOrderId,
                                   TechnicianId technicianId

    ){
        Objects.requireNonNull(customerId);
        Objects.requireNonNull(purchaseOrderId);
        Objects.requireNonNull(technicianId);
        appendChange(new ServiceOrderCreated(customerId, purchaseOrderId, technicianId)).apply();
    }

    public void createServiceInvoice(ReportId reportId,
                                     TotalTime totalTime,
                                     ServiceFee serviceFee,
                                     TotalAmount totalAmount
    ){
        Objects.requireNonNull(reportId);
        Objects.requireNonNull(totalTime);
        Objects.requireNonNull(totalAmount);
        appendChange(new ServiceInvoiceCreated(reportId, totalTime, serviceFee, totalAmount)).apply();
    }

    public void updateServiceLeaderName(ServiceLeaderName serviceLeaderName) {
        Objects.requireNonNull(serviceLeaderName);
        appendChange(new ServiceLeaderNameUpdated(serviceLeaderName)).apply();
    }

    public void updateInvoiceReportId(ReportId reportId){
        Objects.requireNonNull(reportId);
        appendChange(new InvoiceReportIdUpdated(reportId)).apply();
    }

    public void updateInvoiceTotalTime(TotalTime totalTime){
        Objects.requireNonNull(totalTime);
        appendChange(new InvoiceTotalTimeUpdated(totalTime)).apply();
    }

    public void updateInvoiceServiceFee(ServiceFee serviceFee){
        Objects.requireNonNull(serviceFee);
        appendChange(new InvoiceServiceFeeUpdated(serviceFee)).apply();
    }

    public void updataInvoiceTotalAmount(TotalAmount totalAmount){
        Objects.requireNonNull(totalAmount);
        appendChange(new InvoiceTotalAmountUpdated(totalAmount)).apply();
    }

    public void updateOrderPurchaseId(PurchaseOrderId purchaseOrderId){
        Objects.requireNonNull(purchaseOrderId);
        appendChange(new OrderPurchaseIdUpdated(purchaseOrderId)).apply();
    }

    public void updateOrderCustoderId(CustomerId customerId){
        Objects.requireNonNull(customerId);
        appendChange(new OrderCustomerIdUpdated(customerId));
    }

    public void updateOrderTechnicianIdUpdated(TechnicianId technicianId){
        Objects.requireNonNull(technicianId);
        appendChange(new OrderTechnicianIdUpdated(technicianId)).apply();
    }

    protected Optional<ServiceInvoice> findProductById(ServiceInvoiceId entityId) {
        return serviceInvoices()
                .stream()
                .filter((invoice) -> invoice.identity().equals(entityId))
                .findFirst();
    }

    protected Optional<ServiceOrder> findProductById(ServiceOrderId entityId) {
        return serviceInvoices()
                .stream()
                .filter((order) -> order.identity().equals(entityId))
                .findFirst();
    }

    public ServiceLeaderName serviceLeaderName() {
        return serviceLeaderName;
    }

    public Set<ServiceInvoice> serviceInvoices() {
        return serviceInvoices;
    }

    public Set<ServiceOrder> serviceOrders() {
        return serviceOrders;
    }
}
