package com.sofkaU.domainModelImplementation.domain.technician.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.technician.values.ExpensesAmount;

public class ExpensesAmountUpdated extends DomainEvent {

    private final ExpensesAmount expensesAmount;

    public ExpensesAmountUpdated(ExpensesAmount expensesAmount) {
        super("sofkaU.technician.expensesAmountUpdated");
        this.expensesAmount = expensesAmount;
    }

    public ExpensesAmount getExpensesAmount() {
        return expensesAmount;
    }
}

