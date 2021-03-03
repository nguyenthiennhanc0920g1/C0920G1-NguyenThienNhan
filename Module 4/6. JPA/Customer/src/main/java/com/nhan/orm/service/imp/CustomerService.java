package com.nhan.orm.service.imp;

import com.nhan.orm.repository.ICustomerRepository;
import com.nhan.orm.repository.model.CustomerEDM;
import com.nhan.orm.service.ICustomerService;
import com.nhan.orm.service.model.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository iCustomerRepository;

    @Override
    public List<CustomerDTO> findAll() {
        List<CustomerEDM> customerEDMList = this.iCustomerRepository.findAll();
        List<CustomerDTO> customerDTOList = new ArrayList<>();
        for (CustomerEDM edm : customerEDMList) {
            CustomerDTO dto = new CustomerDTO(edm.getId(), edm.getName(), edm.getGender());
            customerDTOList.add(dto);
        }
        return customerDTOList;
    }

    @Override
    public void save(CustomerDTO customerDTO) {
        this.iCustomerRepository.save
                (new CustomerEDM(customerDTO.getId(), customerDTO.getName(), customerDTO.getGender()));
    }

    @Override
    public void update(CustomerDTO customerDTO) {
        this.iCustomerRepository.update
                (new CustomerEDM(customerDTO.getId(), customerDTO.getName(), customerDTO.getGender()));
    }

    @Override
    public CustomerDTO findById(int id) {
        CustomerEDM customerEDM = this.iCustomerRepository.findById(id);
        return new CustomerDTO(customerEDM.getId(), customerEDM.getName(), customerEDM.getGender());
    }
}
