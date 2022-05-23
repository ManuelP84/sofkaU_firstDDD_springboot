package com.sofkaU.domainModelImplementation.domain.technician.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.domainModelImplementation.domain.values.CustomerId;

public class ExpensesCustomerIdUpdated extends DomainEvent {
        private final CustomerId customerId;

        public ExpensesCustomerIdUpdated(CustomerId customerId) {
                super("sofkaU.technician.expensesCustomerIdUpdated");
                this.customerId = customerId;
        }

        public CustomerId getCustomerId() {
                return customerId;
        }
}
