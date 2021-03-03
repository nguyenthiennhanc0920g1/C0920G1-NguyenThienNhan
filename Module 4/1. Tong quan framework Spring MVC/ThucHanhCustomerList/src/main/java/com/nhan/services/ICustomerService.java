package com.nhan.services;

import com.nhan.services.models.CustomerDTO;

import java.util.List;

public interface ICustomerService {
    List<CustomerDTO> getListCustomer();
    CustomerDTO getCustomer(int id);
    void updateCustomer(int id, String name, String email, String address);
}
