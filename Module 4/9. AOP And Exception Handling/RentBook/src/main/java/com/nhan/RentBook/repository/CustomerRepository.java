package com.nhan.RentBook.repository;

import com.nhan.RentBook.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
