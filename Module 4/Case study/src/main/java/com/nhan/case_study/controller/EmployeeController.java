package com.nhan.case_study.controller;

import com.nhan.case_study.model.*;
import com.nhan.case_study.repository.employee.IEmployeeRepository;
import com.nhan.case_study.service.Division.IDivisionService;
import com.nhan.case_study.service.Position.IPositionService;
import com.nhan.case_study.service.customer.model.CustomerDTO;
import com.nhan.case_study.service.educationDegree.IEducationDegreeService;
import com.nhan.case_study.service.employee.IEmployeeService;
import com.nhan.case_study.service.employee.model.EmployeeDTO;
import com.sun.xml.bind.v2.TODO;
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
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    IEmployeeRepository iEmployeeRepository;
    @Autowired
    IEmployeeService iEmployeeService;
    @Autowired
    IPositionService iPositionService;
    @Autowired
    IEducationDegreeService iEducationDegreeService;
    @Autowired
    IDivisionService iDivisionService;

    @GetMapping(value = {"", "/list"})
    public String index(Model model, HttpServletRequest request
            , RedirectAttributes redirect) {
        request.getSession().setAttribute("list", null);

        if (model.asMap().get("success") != null)
            redirect.addFlashAttribute("success", model.asMap().get("success").toString());
        return "redirect:/employee/page/1";
    }

    @GetMapping("/page/{pageNumber}")
    public String showEmployeePage(HttpServletRequest request,
                                   @PathVariable int pageNumber, Model model) {
        PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("list");
        int pageSize = 10;
        List<EmployeeDTO> employeeDTOList = iEmployeeService.findAll();
        List<Employee> employeeListEDM = iEmployeeRepository.findAll();
        if (pages == null) {
            pages = new PagedListHolder<>(employeeDTOList);
            pages.setPageSize(pageSize);
        } else {
            final int goToPage = pageNumber - 1;
            if (goToPage <= pages.getPageCount() && goToPage >= 0) {
                pages.setPage(goToPage);
            }
        }
        request.getSession().setAttribute("list", pages);
        int current = pages.getPage() + 1;
        int begin = Math.max(1, current - employeeDTOList.size());
        int end = Math.min(begin + 20, pages.getPageCount());
        int totalPageCount = pages.getPageCount();
        String baseUrl = "/employee/page/";
        int getSize = employeeListEDM.size();
        model.addAttribute("sizeListE", getSize);
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        model.addAttribute("totalPageCount", totalPageCount);
        model.addAttribute("baseUrl", baseUrl);
        model.addAttribute("listPage", pages);
        model.addAttribute("listPageEDM", employeeListEDM);
        return "employee/list";
    }

    @GetMapping("/new")
    public String showNewCreateForm(Model model) {
        Employee employee = new Employee();
        List<Division> divisionList = iDivisionService.findAll();
        List<Position> positionList = iPositionService.findAll();
        List<EducationDegree> educationDegreeList = iEducationDegreeService.findAll();
        model.addAttribute("employee", employee);
        model.addAttribute("position", positionList);
        model.addAttribute("division", divisionList);
        model.addAttribute("educationDegree", educationDegreeList);
        List<Employee> employeeList = iEmployeeRepository.findAll();
        int getSize = employeeList.size();
        model.addAttribute("sizeListE", getSize);
        return "/employee/create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute Employee employee, BindingResult bindingResult, Model model,
                         RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            List<Division> divisionList = iDivisionService.findAll();
            List<Position> positionList = iPositionService.findAll();
            List<EducationDegree> educationDegreeList = iEducationDegreeService.findAll();
            model.addAttribute("position", positionList);
            model.addAttribute("division", divisionList);
            model.addAttribute("educationDegree", educationDegreeList);
            return "/employee/create";
        } else {
            iEmployeeService.save(employee);
            redirectAttributes.addFlashAttribute("successMsg",
                    "Create employee: " + employee.getEmployeeName() + " success!");
            return "redirect:/employee/list";
        }
    }

    @PostMapping("/update")
    public String update(@Valid @ModelAttribute Employee employee, BindingResult bindingResult, Model model,
                         RedirectAttributes redirectAttributes) {
        if (bindingResult.hasFieldErrors()) {
            List<Division> divisionList = iDivisionService.findAll();
            List<Position> positionList = iPositionService.findAll();
            List<EducationDegree> educationDegreeList = iEducationDegreeService.findAll();
            model.addAttribute("position", positionList);
            model.addAttribute("division", divisionList);
            model.addAttribute("educationDegree", educationDegreeList);
            return "/employee/create";
        } else {
            iEmployeeService.save(employee);
            redirectAttributes.addFlashAttribute("successMsg",
                    "Update employee: " + employee.getEmployeeName() + " success!");
            return "redirect:/employee/list";
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        iEmployeeService.deleteById(id);
        return "redirect:/employee/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        Employee employee = iEmployeeService.getById(id);
        List<Division> divisionList = iDivisionService.findAll();
        List<Position> positionList = iPositionService.findAll();
        List<EducationDegree> educationDegreeList = iEducationDegreeService.findAll();
        model.addAttribute("employee", employee);
        model.addAttribute("position", positionList);
        model.addAttribute("division", divisionList);
        model.addAttribute("educationDegree", educationDegreeList);
        return "/employee/edit";
    }

    @GetMapping("/search/{pageNumber}")
    public String search(@RequestParam String q, Model model, HttpServletRequest request,
                         @PathVariable int pageNumber) {
        if (q.equals("")) {
            return "redirect:/employee/list";
        }
        List<EmployeeDTO> employeeDTOList = iEmployeeService.search(q);
        if (employeeDTOList == null) {
            return "redirect:/employee/list";
        }
        PagedListHolder<?> pages = (PagedListHolder<?>) request.getSession().getAttribute("list");
        int pageSize = 5;
        pages = new PagedListHolder<>(employeeDTOList);
        pages.setPageSize(pageSize);
        final int goToPage = pageNumber - 1;
        if (goToPage <= pages.getPageCount() && goToPage >= 0) {
            pages.setPage(goToPage);
        }
        request.getSession().setAttribute("list", pages);
        int current = pages.getPage() + 1;
        int begin = Math.max(1, current - employeeDTOList.size());
        int end = Math.min(begin + 20, pages.getPageCount());
        int totalPageCount = pages.getPageCount();
        int getSize = employeeDTOList.size();
        model.addAttribute("sizeListE", getSize);
        String baseUrl = "/employee/page/";
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);
        model.addAttribute("totalPageCount", totalPageCount);
        model.addAttribute("baseUrl", baseUrl);
        model.addAttribute("listPage", pages);
        return "employee/list";
    }
}
