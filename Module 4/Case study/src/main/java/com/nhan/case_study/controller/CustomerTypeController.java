package com.nhan.case_study.controller;

import com.nhan.case_study.model.CustomerType;
import com.nhan.case_study.service.customertype.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/customertype")
public class CustomerTypeController {
    @Autowired
    ICustomerTypeService iCustomerTypeService;

    @GetMapping(value = {"", "/list"})
    public String showList(Model model) {
        List<CustomerType> customerTypeList = iCustomerTypeService.findAll();
        model.addAttribute("list", customerTypeList);
        return "/customertype/list";
    }

    @GetMapping("/new")
    public String showNewCreateForm(Model model) {
        CustomerType customerType = new CustomerType();
        model.addAttribute("customertype", customerType);
        return "/customertype/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute CustomerType customerType, RedirectAttributes redirectAttributes) {
        iCustomerTypeService.save(customerType);
        redirectAttributes.addFlashAttribute("successMsg",
                "Create customer type: " + customerType.getCustomerTypeName() + " success!");
        return "redirect:/customertype/list";
    }

    @GetMapping("/getById/{id}")
    public ModelAndView showEditForm(@PathVariable int id){
        CustomerType customerType = iCustomerTypeService.getById(id);
        return new ModelAndView("customertype/edit", "customerType", customerType);
    }

    @PostMapping("/update")
    public String update(@ModelAttribute CustomerType customerType, RedirectAttributes redirectAttributes) {
        iCustomerTypeService.save(customerType);
        redirectAttributes.addFlashAttribute("successMsg",
                "Update customer type: " + customerType.getCustomerTypeName() + " success!");
        return "redirect:/customertype/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        iCustomerTypeService.deleteById(id);
        return "redirect:/customertype/list";
    }
}
