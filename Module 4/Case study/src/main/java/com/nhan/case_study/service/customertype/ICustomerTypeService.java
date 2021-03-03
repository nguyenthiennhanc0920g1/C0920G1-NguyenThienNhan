package com.nhan.case_study.service.customertype;

import com.nhan.case_study.model.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> findAll();
    CustomerType getById(int id);
    void save(CustomerType customerType);
    void deleteById(int id);
}
