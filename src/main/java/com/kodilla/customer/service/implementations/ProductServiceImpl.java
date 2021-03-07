package com.kodilla.customer.service.implementations;

import com.kodilla.customer.dto.AccountDto;
import com.kodilla.customer.provider.AccountsProvider;
import com.kodilla.customer.service.interfaces.ProductService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final AccountsProvider accountProvider;

    @Override
    public List<AccountDto> findCustomerAccounts(Long customerId) {
        return accountProvider.getCustomerAccounts(customerId);
    }
}
