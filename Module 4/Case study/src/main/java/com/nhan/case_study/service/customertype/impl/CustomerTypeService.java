package com.nhan.case_study.service.customertype.impl;

import com.nhan.case_study.model.CustomerType;
import com.nhan.case_study.repository.customertype.ICustomerTypeRepository;
import com.nhan.case_study.service.customertype.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    ICustomerTypeRepository iCustomerTypeRepository;
    @Override
    public List<CustomerType> findAll() {
        return iCustomerTypeRepository.findAll();
    }

    @Override
    public CustomerType getById(int id) {
        return iCustomerTypeRepository.findById(id).get();
    }

    @Override
    public void save(CustomerType customerType) {
        iCustomerTypeRepository.save(customerType);
    }

    @Override
    public void deleteById(int id) {
        iCustomerTypeRepository.deleteById(id);
    }
}
