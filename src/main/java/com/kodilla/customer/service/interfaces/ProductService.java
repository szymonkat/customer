package com.kodilla.customer.service.interfaces;

import com.kodilla.customer.dto.AccountDto;

import java.util.List;

public interface ProductService {
    List<AccountDto> findCustomerAccounts(final Long customerId);
}
