package com.sofkaU.domainModelImplementation.customer.values;

import co.com.sofka.domain.generic.Identity;

public class MachineId extends Identity {

    public MachineId(){
    }

    private MachineId(String id){
        super(id);
    }

    public static MachineId of(String id){
        return new MachineId(id);
    }
}
