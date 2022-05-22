package com.sofkaU.domainModelImplementation.domain.service_leader.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.service_leader.values.ServiceLeaderName;

public class ServiceLeaderCreated extends DomainEvent {
    private final ServiceLeaderName serviceLeaderName;

    public ServiceLeaderCreated(ServiceLeaderName name) {
        super("sofkaU.serviceLeader.serviceLeaderCreated");
        this.serviceLeaderName = name;

    }

    public ServiceLeaderName getServiceLeaderName() {
        return serviceLeaderName;
    }
}
