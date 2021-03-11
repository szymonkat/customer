package com.kodilla.customer.controller;

import com.kodilla.customer.domain.GetCustomerProductsResponse;
import com.kodilla.customer.domain.GetCustomerResponse;
import com.kodilla.customer.dto.AccountDto;
import com.kodilla.customer.dto.CardDto;
import com.kodilla.customer.dto.CustomerDto;
import com.kodilla.customer.mapper.CustomerMapper;
import com.kodilla.customer.service.interfaces.CardsService;
import com.kodilla.customer.service.interfaces.CustomerService;
import com.kodilla.customer.service.interfaces.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RefreshScope
@RestController
@RequestMapping("/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerMapper customerMapper;
    private final CustomerService customerService;
    private final ProductService productService;
    private final CardsService cardsService;

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

    @GetMapping("/{customerId}/products")
    public GetCustomerProductsResponse getCustomerProducts(@PathVariable Long customerId) {
        CustomerDto customerDto = customerMapper.mapToCustomerDto(customerService.getCustomerById(customerId));
                //.orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST));

        List<AccountDto> customerAccounts = productService.findCustomerAccounts(customerId);
        List<CardDto> cardDtoList = cardsService.findCustomerCards(customerId);


        return GetCustomerProductsResponse.builder()
                .customerId(customerDto.getId())
                .fullName(customerDto.getFirstName() + " " + customerDto.getLastName())
                .accounts(customerAccounts)
                .cards(cardDtoList)
                .build();
    }
}