package com.kodilla.customer.dto;

import com.kodilla.customer.domain.Currency;
import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class AccountDto {

    private Long id;
    private String nrb;
    private Currency currency;
    private BigDecimal availableFunds;

/*    public AccountDto(String nrb, Currency currency, BigDecimal availableFunds) {
        this.nrb = nrb;
        this.currency = currency;
        this.availableFunds = availableFunds;
    }*/
}
