package com.nhan.orm.service;

import com.nhan.orm.service.model.CustomerDTO;

import java.util.List;

public interface ICustomerService {
    List<CustomerDTO> findAll();
    void save(CustomerDTO customerDTO);
    void update(CustomerDTO customerDTO);
    CustomerDTO findById(int id);
}
