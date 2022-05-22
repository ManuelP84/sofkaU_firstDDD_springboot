package com.sofkaU.domainModelImplementation.domain.customer.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.domain.customer.values.DateOfService;
import com.sofkaU.domainModelImplementation.domain.values.PurchaseOrderId;

public class UpdatePurchaseDateOfService extends Command {

    private final PurchaseOrderId purchaseOrderId;
    private final DateOfService   dateOfService;

    public UpdatePurchaseDateOfService(PurchaseOrderId purchaseOrderId, DateOfService dateOfService) {
        this.purchaseOrderId = purchaseOrderId;
        this.dateOfService = dateOfService;
    }

    public PurchaseOrderId getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public DateOfService getDateOfService() {
        return dateOfService;
    }
}
