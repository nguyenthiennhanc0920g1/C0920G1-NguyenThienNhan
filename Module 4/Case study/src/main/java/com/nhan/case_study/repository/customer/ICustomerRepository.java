package com.nhan.case_study.repository.customer;

import com.nhan.case_study.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findCustomerByCustomerNameContaining(String q);
}
