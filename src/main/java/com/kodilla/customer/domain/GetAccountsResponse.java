package com.kodilla.customer.domain;

import com.kodilla.customer.dto.AccountDto;
import lombok.Data;

import java.util.List;

@Data
public class GetAccountsResponse {

    private List<AccountDto> accounts;

}
