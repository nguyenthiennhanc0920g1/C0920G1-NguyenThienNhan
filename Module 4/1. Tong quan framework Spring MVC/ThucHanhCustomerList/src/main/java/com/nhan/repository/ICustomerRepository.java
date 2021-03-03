package com.nhan.repository;

import com.nhan.repository.models.CustomerEDM;

import java.util.List;
import java.util.SplittableRandom;

public interface ICustomerRepository {
    List<CustomerEDM> getListCustomer();
    CustomerEDM getCustomer(int id);
    void updateCustomer(int id, String name, String email, String address);
}
