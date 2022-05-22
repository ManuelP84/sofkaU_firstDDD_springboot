package com.sofkaU.domainModelImplementation.domain.values;

import co.com.sofka.domain.generic.Identity;

public class ReportId extends Identity {

    public ReportId(){
    }

    private ReportId(String id){
        super(id);
    }

    public static ReportId of(String id){
        return new ReportId(id);
    }
}
