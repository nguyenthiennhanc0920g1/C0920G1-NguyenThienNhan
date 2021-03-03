package com.nhan.RentBook.service;

import com.nhan.RentBook.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(int id);

    void save(Customer customer);

    void remove(int id);
}
