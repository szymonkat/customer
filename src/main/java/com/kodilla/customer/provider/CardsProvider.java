package com.kodilla.customer.provider;

import com.kodilla.customer.connector.CardsConnector;
import com.kodilla.customer.dto.CardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CardsProvider {
    private final CardsConnector cardsConnector;

    public List<CardDto> getCustomerCards(Long customerId) {
        return cardsConnector.getCards(customerId)
                .getCardDtoList()
                .stream()
                .map(cardDto -> new CardDto(
                        cardDto.getId(),
                        cardDto.getName(),
                        cardDto.getCreditValue(),
                        cardDto.getCardNumber(),
                        cardDto.getCustomerId()))
                .collect(Collectors.toList());
    }
}
