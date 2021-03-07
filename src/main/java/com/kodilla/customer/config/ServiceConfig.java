package com.kodilla.customer.config;

import com.kodilla.customer.provider.AccountsProvider;
import com.kodilla.customer.repository.CustomerRepository;
import com.kodilla.customer.service.implementations.CustomerServiceImpl;
import com.kodilla.customer.service.implementations.ProductServiceImpl;
import com.kodilla.customer.service.interfaces.CustomerService;
import com.kodilla.customer.service.interfaces.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    protected CustomerService customerService(CustomerRepository customerRepository) {
        return new CustomerServiceImpl(customerRepository);
    }

    @Bean
    protected ProductService productService(AccountsProvider accountsProvider) {
        return new ProductServiceImpl(accountsProvider);
    }

}
