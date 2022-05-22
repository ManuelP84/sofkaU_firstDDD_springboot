package com.sofkaU.domainModelImplementation.domain.values;

import co.com.sofka.domain.generic.Identity;

public class TechnicianId extends Identity {

    public TechnicianId(){
    }

    private TechnicianId(String id){
        super(id);
    }

    public static TechnicianId of(String id){
        return new TechnicianId(id);
    }
}
