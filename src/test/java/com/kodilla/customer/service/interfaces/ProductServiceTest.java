package com.kodilla.customer.service.interfaces;

import com.kodilla.customer.dto.AccountDto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureStubRunner(
        stubsMode = StubRunnerProperties.StubsMode.LOCAL,
        ids = {
                "com.kodilla:account:+:stubs:9000"
        }
)
class ProductServiceTest {

    @Autowired
    private ProductService productService;


    @Test
    void findCustomerAccounts() {
        //Given
        Long customerId = 1L;

        //When
        List<AccountDto> accounts = productService.findCustomerAccounts(customerId);

        //Then
        assertEquals(1, accounts.size());
//        assertEquals(95213, accounts.get(0).getId());
//        assertEquals(1, accounts.get(0).getCurrency());
//        assertEquals(1, accounts.get(0).getNrb());
//        assertEquals(1, accounts.get(0).getAvailableFunds());
    }

}