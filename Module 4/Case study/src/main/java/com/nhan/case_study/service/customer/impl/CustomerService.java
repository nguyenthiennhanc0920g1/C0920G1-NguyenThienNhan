package com.nhan.case_study.service.customer.impl;

import com.nhan.case_study.model.Customer;
import com.nhan.case_study.repository.customer.ICustomerRepository;
import com.nhan.case_study.service.customer.ICustomerService;
import com.nhan.case_study.service.customer.model.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return iCustomerRepository.findAll(PageRequest.of(0, 5));
    }

    @Override
    public List<CustomerDTO> findAll() {
        List<Customer> customerListEDM = iCustomerRepository.findAll();
        List<CustomerDTO> customerListDTO = new ArrayList<>();
        int idInt = 0;
        String idString = "";
        for (Customer EDM : customerListEDM) {
            idInt = EDM.getCustomerId();
            if (idInt < 10) {
                idString = "KH-00" + idInt;
            } else if (idInt < 100) {
                idString = "KH-0" + idInt;
            } else {
                idString = "KH-" + idInt;
            }
            CustomerDTO customerDTO = new CustomerDTO(EDM.getCustomerId(),idString, EDM.getCustomerName(), EDM.getCustomerBirthday(),
                    EDM.getGender(), EDM.getCustomerIdCard(), EDM.getCustomerPhone(), EDM.getCustomerEmail(),
                    EDM.getCustomerAddress(), EDM.getCustomerType());
            customerListDTO.add(customerDTO);
        }
        return customerListDTO;
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public Customer getById(int id) {
        return iCustomerRepository.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        iCustomerRepository.deleteById(id);
    }

    @Override
    public List<CustomerDTO> search(String q) {
        List<Customer> customerListEDM = iCustomerRepository.findCustomerByCustomerNameContaining(q);
        List<CustomerDTO> customerListDTO = new ArrayList<>();
        int idInt = 0;
        String idString = "";
        for (Customer EDM : customerListEDM) {
            idInt = EDM.getCustomerId();
            if (idInt < 10) {
                idString = "KH-00" + idInt;
            } else if (idInt < 100) {
                idString = "KH-0" + idInt;
            } else {
                idString = "KH-" + idInt;
            }
            CustomerDTO customerDTO = new CustomerDTO(EDM.getCustomerId(),idString, EDM.getCustomerName(), EDM.getCustomerBirthday(),
                    EDM.getGender(), EDM.getCustomerIdCard(), EDM.getCustomerPhone(), EDM.getCustomerEmail(),
                    EDM.getCustomerAddress(), EDM.getCustomerType());
            customerListDTO.add(customerDTO);
        }
        return customerListDTO;
    }
}
