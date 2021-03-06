package com.kodilla.customer.repository;

import com.kodilla.customer.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Override
    <S extends Customer> S save(S Customer);

}
