package com.nhan.services.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nhan.repository.ICustomerRepository;
import com.nhan.repository.models.CustomerEDM;
import com.nhan.services.ICustomerService;
import com.nhan.services.models.CustomerDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository customerRepository;

    @Override
    public List<CustomerDTO> getListCustomer() {
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        List<CustomerEDM> customerEDMList = customerRepository.getListCustomer();
        for (CustomerEDM edm : customerEDMList) {
            CustomerDTO customerDTO = new CustomerDTO(edm.getId(), edm.getName(), edm.getEmail(), edm.getAddress());
            customerDTOList.add(customerDTO);
        }
        return customerDTOList;
    }

    @Override
    public CustomerDTO getCustomer(int id) {
        CustomerEDM customerEDM = this.customerRepository.getCustomer(id);
        return new CustomerDTO(customerEDM.getId(), customerEDM.getName(), customerEDM.getEmail(),
                customerEDM.getAddress());
    }

    @Override
    public void updateCustomer(int id, String name, String email, String address) {
        this.customerRepository.updateCustomer(id, name, email, address);
    }
}
