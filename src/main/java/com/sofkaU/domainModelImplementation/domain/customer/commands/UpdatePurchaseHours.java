package com.sofkaU.domainModelImplementation.domain.customer.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.domainModelImplementation.domain.customer.values.Hours;
import com.sofkaU.domainModelImplementation.domain.customer.values.PurchaseOrderId;

public class UpdatePurchaseHours extends Command {

    private final PurchaseOrderId purchaseOrderId;
    private final Hours           hours;

    public UpdatePurchaseHours(PurchaseOrderId purchaseOrderId, Hours hours) {
        this.purchaseOrderId = purchaseOrderId;
        this.hours = hours;
    }

    public PurchaseOrderId getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public Hours getHours() {
        return hours;
    }
}
