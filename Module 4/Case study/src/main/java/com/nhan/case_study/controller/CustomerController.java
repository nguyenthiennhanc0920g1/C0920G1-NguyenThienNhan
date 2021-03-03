package com.nhan.case_study.controller;

import com.nhan.case_study.model.Customer;
import com.nhan.case_study.model.CustomerType;
import com.nhan.case_study.repository.customer.ICustomerRepository;
import com.nhan.case_study.service.customer.ICustomerService;
import com.nhan.case_study.service.customer.model.CustomerDTO;
import com.nhan.case_study.service.customertype.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;
    @Autowired
    ICustomerRepository iCustomerRepository;
    @Autowired
    ICustomerTypeService iCustomerTypeService;

//    @GetMapping(value = {"", "/list"})
//    public String showListPage(Model model) {
//        Page<Customer> customerServiceList = iCustomerService.findAll(PageRequest.of(0, 5));
//        int totalPages = customerServiceList.getTotalPages();
//        model.addAttribute("list", customerServiceList);
//        model.addAttribute("totalPage", totalPages);
//        return "/customer/list";
//    }

//    @GetMapping(value = {"", "/list"})
//    public String showList(Model model) {
//        List<Customer> customerServiceList = iCustomerService.findAll();
//        model.addAttribute("list", customerServiceList);
//        return "/customer/list";
//    }

    @GetMapping(value = {"", "/list"})
    public String index(Model model, HttpServletRequest request
            , RedirectAttributes redirect) {
        request.getSession().setAttribute("list", null);

        if (model.asMap().get("success") != null)
            redirect.addFlashAttribute("success", model.asMap().get("success").toString());
        return "redirect:/customer/page/1";
    }

    @GetMapping("/page/{pageNumber}")
    public String showCustomerPage(HttpServletRequest request,
                                   @PathVariable int pageNumber, Model model) {
        PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("list");
        int pageSize = 10;
        List<CustomerDTO> customerServiceList = iCustomerService.findAll();
        List<Customer> customerRepoList = iCustomerRepository.findAll();
        if (pages == null) {
            pages = new PagedListHolder<>(customerServiceList);
            pages.setPageSize(pageSize);
        } else {
            final int goToPage = pageNumber - 1;
            if (goToPage <= pages.getPageCount() && goToPage >= 0) {
                pages.setPage(goToPage);
            }
        }
        request.getSession().setAttribute("list", pages);
        int current = pages.getPage() + 1;
        int begin = Math.max(1, current - customerServiceList.size());
        int end = Math.min(begin + 20, pages.getPageCount());
        int totalPageCount = pages.getPageCount();
        String baseUrl = "/customer/page/";
        int getSize = customerRepoList.size();
        model.addAttribute("sizeListC", getSize);
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        model.addAttribute("totalPageCount", totalPageCount);
        model.addAttribute("baseUrl", baseUrl);
        model.addAttribute("listPage", pages);
        model.addAttribute("listPageEDM", customerRepoList);
        return "customer/list";
    }

    @GetMapping("/new")
    public String showNewCreateForm(Model model) {
        Customer customer = new Customer();
        List<CustomerType> customerTypeList = iCustomerTypeService.findAll();
        model.addAttribute("customer", customer);
        model.addAttribute("customerTypeList", customerTypeList);
        List<Customer> customerList = iCustomerRepository.findAll();
        int getSize = customerList.size();
        model.addAttribute("sizeListC", getSize);
        return "/customer/create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute Customer customer, BindingResult bindingResult, Model model,
                         RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            List<CustomerType> customerTypeList = iCustomerTypeService.findAll();
            model.addAttribute("customerTypeList", customerTypeList);
            return "/customer/create";
        } else {
            iCustomerService.save(customer);
            redirectAttributes.addFlashAttribute("successMsg",
                    "Create customer: " + customer.getCustomerName() + " success!");
            return "redirect:/customer/list";
        }
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute Customer customer, BindingResult bindingResult, Model model,
                         RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            List<CustomerType> customerTypeList = iCustomerTypeService.findAll();
            model.addAttribute("customerTypeList", customerTypeList);
            return "/customer/create";
        } else {
            iCustomerService.save(customer);
            redirectAttributes.addFlashAttribute("successMsg",
                    "Update customer: " + customer.getCustomerName() + " success!");
            return "redirect:/customer/list";
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        iCustomerService.deleteById(id);
        return "redirect:/customer/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        Customer customer = iCustomerService.getById(id);
        List<CustomerType> customerTypeList = iCustomerTypeService.findAll();
        model.addAttribute("customer", customer);
        model.addAttribute("customerTypeList", customerTypeList);
        return "/customer/edit";
    }

    @GetMapping("/search/{pageNumber}")
    public String search(@RequestParam String q, Model model, HttpServletRequest request,
                         @PathVariable int pageNumber) {
        if (q.equals("")) {
            return "redirect:/customer/list";
        }
        List<CustomerDTO> customerList = iCustomerService.search(q);
        if (customerList == null) {
            return "redirect:/customer/list";
        }
        PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("list");
        int pageSize = 5;
        pages = new PagedListHolder<>(customerList);
        pages.setPageSize(pageSize);
        final int goToPage = pageNumber - 1;
        if (goToPage <= pages.getPageCount() && goToPage >= 0) {
            pages.setPage(goToPage);
        }
        request.getSession().setAttribute("list", pages);
        int current = pages.getPage() + 1;
        int begin = Math.max(1, current - customerList.size());
        int end = Math.min(begin + 20, pages.getPageCount());
        int totalPageCount = pages.getPageCount();
        int getSize = customerList.size();
        model.addAttribute("sizeListC", getSize);
        String baseUrl = "/customer/page/";
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        model.addAttribute("totalPageCount", totalPageCount);
        model.addAttribute("baseUrl", baseUrl);
        model.addAttribute("listPage", pages);
        return "customer/list";
    }
}
