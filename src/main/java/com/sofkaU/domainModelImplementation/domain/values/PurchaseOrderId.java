package com.sofkaU.domainModelImplementation.domain.values;

import co.com.sofka.domain.generic.Identity;

public class PurchaseOrderId extends Identity {

    public PurchaseOrderId(){
    }

    private PurchaseOrderId(String id){
        super(id);
    }

    public static PurchaseOrderId of(String id){
        return new PurchaseOrderId(id);
    }
}
