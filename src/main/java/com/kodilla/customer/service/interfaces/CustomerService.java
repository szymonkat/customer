package com.kodilla.customer.service.interfaces;

import com.kodilla.customer.domain.Customer;

public interface CustomerService {
    Customer saveCustomer(final Customer customer);
    Customer getCustomerById(final Long customerId);
}
