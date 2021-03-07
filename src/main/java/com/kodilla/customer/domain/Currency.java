package com.kodilla.customer.domain;

public enum Currency {
        USD("USD"),
        BTC("BTC"),
        PLN("PLN"),
        XMR("XMR");
        private final String name;

    Currency(String name) {
        this.name = name;
    }
}
