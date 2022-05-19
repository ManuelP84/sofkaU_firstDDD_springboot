package com.sofkaU.domainModelImplementation.customer.comands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.customer.values.PurchaseOrderId;
import com.sofkaU.domainModelImplementation.customer.values.TypeService;

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
