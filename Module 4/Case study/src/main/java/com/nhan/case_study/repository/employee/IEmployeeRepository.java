package com.nhan.case_study.repository.employee;

import com.nhan.case_study.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> findEmployeeByEmployeeNameContaining(String q);
}
