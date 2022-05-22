package com.sofkaU.domainModelImplementation.domain.service_leader.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.service_leader.values.ServiceLeaderName;

public class ServiceLeaderNameUpdated extends DomainEvent {
    private final ServiceLeaderName name;

    public ServiceLeaderNameUpdated(ServiceLeaderName name) {
        super("sofkaU.serviceLeader.serviceLeaderNameUpdated");
        this.name = name;
    }

    public ServiceLeaderName getName() {
        return name;
    }
}
