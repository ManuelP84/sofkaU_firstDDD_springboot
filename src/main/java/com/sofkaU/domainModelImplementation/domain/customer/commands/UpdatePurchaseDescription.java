package com.sofkaU.domainModelImplementation.domain.customer.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.domain.customer.values.Description;
import com.sofkaU.domainModelImplementation.domain.customer.values.PurchaseOrderId;

public class UpdatePurchaseDescription extends Command {

    private final PurchaseOrderId purchaseOrderId;
    private final Description     description;

    public UpdatePurchaseDescription(PurchaseOrderId purchaseOrderId, Description description) {
        this.purchaseOrderId = purchaseOrderId;
        this.description = description;
    }

    public PurchaseOrderId getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public Description getDescription() {
        return description;
    }
}
