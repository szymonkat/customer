package com.kodilla.customer.service.interfaces;

import com.kodilla.customer.dto.CardDto;

import java.util.List;

public interface CardsService {
    List<CardDto> findCustomerCards(final Long customerId);
}
