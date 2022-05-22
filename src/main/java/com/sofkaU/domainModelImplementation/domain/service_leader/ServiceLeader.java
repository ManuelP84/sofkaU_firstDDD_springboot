package com.sofkaU.domainModelImplementation.domain.service_leader;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofkaU.domainModelImplementation.domain.service_leader.events.ServiceLeaderCreated;
import com.sofkaU.domainModelImplementation.domain.service_leader.values.ServiceLeaderId;
import com.sofkaU.domainModelImplementation.domain.service_leader.values.ServiceLeaderName;

import java.util.Set;

public class ServiceLeader extends AggregateEvent<ServiceLeaderId> {
    protected ServiceLeaderName serviceLeaderName;
    protected Set<ServiceInvoice> serviceInvoices;
    protected Set<ServiceOrder> serviceOrders;

    public ServiceLeader(ServiceLeaderId entityId,ServiceLeaderName name){
        super(entityId);
        appendChange(new ServiceLeaderCreated(name)).apply();

    }

}
