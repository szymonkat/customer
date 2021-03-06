package com.kodilla.customer.mapper;

import com.kodilla.customer.domain.Customer;
import com.kodilla.customer.dto.CustomerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomerMapper {

    public Customer mapToCustomer(CustomerDto customerDto) {
        return new Customer(customerDto.getId(),
                customerDto.getFirstName(),
                customerDto.getFirstName());
    }

    public CustomerDto mapToCustomerDto(Customer customer) {
        return new CustomerDto(customer.getId(),
                customer.getFirstName(),
                customer.getLastName());
    }
}
