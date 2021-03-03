package com.nhan.case_study.service.customer;

import com.nhan.case_study.model.Customer;
import com.nhan.case_study.service.customer.model.CustomerDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    Page<Customer> findAll(Pageable pageable);
    List<CustomerDTO> findAll();
    void save(Customer customer);
    Customer getById(int id);
    void deleteById(int id);
    List<CustomerDTO> search(String q);
}
