package com.nhan.case_study.service.employee;

import com.nhan.case_study.model.Employee;
import com.nhan.case_study.service.employee.model.EmployeeDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEmployeeService {
    Page<Employee> findAll(Pageable pageable);
    List<EmployeeDTO> findAll();
    void save(Employee employee);
    Employee getById(int id);
    void deleteById(int id);
    List<EmployeeDTO> search(String q);
}
