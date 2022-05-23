package com.sofkaU.domainModelImplementation.domain.technician.values;

import co.com.sofka.domain.generic.Identity;

public class ExpensesId extends Identity {
    public ExpensesId(){
    }

    private ExpensesId(String id){
        super(id);
    }

    public static ExpensesId of(String id){
        return new ExpensesId(id);
    }
}
