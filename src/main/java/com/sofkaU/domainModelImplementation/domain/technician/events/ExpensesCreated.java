package com.sofkaU.domainModelImplementation.domain.technician.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.technician.values.ExpensesAmount;
import com.sofkaU.domainModelImplementation.domain.values.CustomerId;

public class ExpensesCreated extends DomainEvent {

    private final ExpensesAmount expensesAmount;
    private final CustomerId customerId;

    public ExpensesCreated(ExpensesAmount expensesAmount, CustomerId customerId) {
        super("sofkaU.technician.expensesCreated");
        this.expensesAmount = expensesAmount;
        this.customerId = customerId;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public ExpensesAmount getExpensesAmount() {
        return expensesAmount;
    }
}
