package com.nhan.controllers;

import com.nhan.viewmodels.CustomerViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.nhan.services.ICustomerService;
import com.nhan.services.models.CustomerDTO;

import java.util.List;

@Controller
public class CustomerServlet {
    @Autowired
    ICustomerService iCustomerService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView customerList() {
        List<CustomerDTO> customerDTOList = iCustomerService.getListCustomer();
        return new ModelAndView("list", "customerList", customerDTOList);
    }

    @RequestMapping(value = "/showCustomerByID/${id}", method = RequestMethod.GET)
    public ModelAndView customer(@PathVariable int id) {
        CustomerDTO customerDTO = this.iCustomerService.getCustomer(id);
        return new ModelAndView("edit", "customer", customerDTO);
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView updateCustomer(CustomerViewModel customerViewModel) {
        this.iCustomerService.updateCustomer(customerViewModel.getId(), customerViewModel.getName(),
                customerViewModel.getEmail(), customerViewModel.getAddress());
        List<CustomerDTO> customerDTOList = iCustomerService.getListCustomer();
        return new ModelAndView("list", "customerList", customerDTOList);
    }
}
