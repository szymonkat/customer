package com.kodilla.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardDto {

    private Long id;
    private String name;
    private BigInteger creditValue;
    private String cardNumber;
    private Long customerId;

}
