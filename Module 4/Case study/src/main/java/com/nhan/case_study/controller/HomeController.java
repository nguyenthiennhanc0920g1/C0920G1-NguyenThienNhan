package com.nhan.case_study.controller;

import com.nhan.case_study.model.Customer;
import com.nhan.case_study.model.Employee;
import com.nhan.case_study.repository.customer.ICustomerRepository;
import com.nhan.case_study.repository.employee.IEmployeeRepository;
import com.sun.org.apache.xpath.internal.objects.XNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    ICustomerRepository iCustomerRepository;
    @Autowired
    IEmployeeRepository iEmployeeRepository;

    @GetMapping("")
    public String home(Model model) {
        List<Customer> customerList = iCustomerRepository.findAll();
        int getSizeC = customerList.size();
        List<Employee> employeeList = iEmployeeRepository.findAll();
        int getSizeE = employeeList.size();
        model.addAttribute("sizeListC", getSizeC);
        model.addAttribute("sizeListE", getSizeE);
        return "interview/home";
    }

    @GetMapping("/login")
    public String login() {
    return "interview/login";
}
}
