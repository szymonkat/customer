package com.kodilla.customer.domain;

import com.kodilla.customer.dto.CardDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCardsResponse {

    private List<CardDto> cardDtoList;
}
