package com.kodilla.customer.controller;

import com.kodilla.customer.domain.GetCustomerResponse;
import com.kodilla.customer.dto.CustomerDto;
import com.kodilla.customer.mapper.CustomerMapper;
import com.kodilla.customer.service.interfaces.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RefreshScope
@RestController
@RequestMapping("/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerMapper customerMapper;
    private final CustomerService customerService;

    @GetMapping("{customerId}")
    public GetCustomerResponse getAccountsByCustomerId(@PathVariable Long customerId)  {
        return new GetCustomerResponse(
                customerMapper.mapToCustomerDto(customerService.getCustomerById(customerId)));
    }

    @PostMapping
    public CustomerDto saveCustomer(@RequestBody CustomerDto customerDto) {
        return customerMapper.mapToCustomerDto(customerService.
                saveCustomer(customerMapper.mapToCustomer(customerDto)));
    }
}