package com.kodilla.customer.service.implementations;

import com.kodilla.customer.dto.CardDto;
import com.kodilla.customer.provider.CardsProvider;
import com.kodilla.customer.service.interfaces.CardsService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CardServiceImpl implements CardsService {

    private final CardsProvider cardsProvider;

    @Override
    public List<CardDto> findCustomerCards(Long customerId) {
        return cardsProvider.getCustomerCards(customerId);
    }
}
