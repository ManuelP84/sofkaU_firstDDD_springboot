package com.sofkaU.domainModelImplementation.domain.customer.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.domain.values.PurchaseOrderId;
import com.sofkaU.domainModelImplementation.domain.customer.values.TypeService;

public class UpdatePurchaseTypeService extends Command {

    private final PurchaseOrderId purchaseOrderId;
    private final TypeService     typeService;

    public UpdatePurchaseTypeService(PurchaseOrderId purchaseOrderId, TypeService typeService) {
        this.purchaseOrderId = purchaseOrderId;
        this.typeService = typeService;
    }

    public PurchaseOrderId getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public TypeService getTypeService() {
        return typeService;
    }
}
