package com.kodilla.customer.service.implementations;

import com.kodilla.customer.domain.Customer;
import com.kodilla.customer.exceptions.NotFoundException;
import com.kodilla.customer.repository.CustomerRepository;
import com.kodilla.customer.service.interfaces.CustomerService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Long customerId) throws NotFoundException {
        return customerRepository.findById(customerId).orElseThrow(
                () -> new NotFoundException("Customer with id: " + customerId + " does not exist"));
    }
}
