package com.nhan.orm.repository;

import com.nhan.orm.repository.model.CustomerEDM;

import java.util.List;

public interface ICustomerRepository {
    List<CustomerEDM> findAll();
    void save(CustomerEDM customerEDM);
    void update(CustomerEDM customerEDM);
    void deleteCustomer(CustomerEDM customerEDM);
    CustomerEDM findById(int id);
}
