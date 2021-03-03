package com.nhan.case_study.service.employee.impl;

import com.nhan.case_study.model.Employee;
import com.nhan.case_study.repository.employee.IEmployeeRepository;
import com.nhan.case_study.service.employee.IEmployeeService;
import com.nhan.case_study.service.employee.model.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    IEmployeeRepository iEmployeeRepository;

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return iEmployeeRepository.findAll(PageRequest.of(0, 5));
    }

    @Override
    public List<EmployeeDTO> findAll() {
        List<Employee> employeeListEDM = iEmployeeRepository.findAll();
        List<EmployeeDTO> employeeListDTO = new ArrayList<>();
        int idInt = 0;
        String idStr = "";
        for (Employee EDM : employeeListEDM) {
            if (EDM.getDivision().getDivisionId() == 2){
                idInt = EDM.getEmployeeId();
                if (idInt < 10){
                    idStr = "AD-00" + idInt;
                }
                else if (idInt < 100){
                    idStr = "AD-0" + idInt;
                }
                else {
                    idStr = "AD-" + idInt;
                }
            }
            else {
                if (idInt < 10){
                    idStr = "EM-00" + idInt;
                }
                else if (idInt < 100){
                    idStr = "EM-0" + idInt;
                }
                else {
                    idStr = "EM-" + idInt;
                }
            }
            EmployeeDTO DTO = new EmployeeDTO(idStr, EDM.getEmployeeId(), EDM.getEmployeeName(),
                    EDM.getEmployeeBirthday(), EDM.getGender(), EDM.getEmployeeIdCard(), EDM.getEmployeeSalary(),
                    EDM.getEmployeePhone(), EDM.getEmployeeEmail(), EDM.getEmployeeAddress(),
                    EDM.getDivision(), EDM.getPosition(), EDM.getEducationDegree(), EDM.getUser());
            employeeListDTO.add(DTO);
        }
        return employeeListDTO;
    }

    @Override
    public void save(Employee employee) {
        iEmployeeRepository.save(employee);
    }

    @Override
    public Employee getById(int id) {
        return iEmployeeRepository.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        iEmployeeRepository.deleteById(id);
    }

    @Override
    public List<EmployeeDTO> search(String q) {
        List<Employee> employeeListEDM = iEmployeeRepository.findEmployeeByEmployeeNameContaining(q);
        List<EmployeeDTO> employeeListDTO = new ArrayList<>();
        int idInt = 0;
        String idStr = "";
        for (Employee EDM : employeeListEDM) {
            if (EDM.getDivision().getDivisionId() == 2){
                idInt = EDM.getEmployeeId();
                if (idInt < 10){
                    idStr = "AD-00" + idInt;
                }
                else if (idInt < 100){
                    idStr = "AD-0" + idInt;
                }
                else {
                    idStr = "AD-" + idInt;
                }
            }
            else {
                if (idInt < 10){
                    idStr = "EM-00" + idInt;
                }
                else if (idInt < 100){
                    idStr = "EM-0" + idInt;
                }
                else {
                    idStr = "EM-" + idInt;
                }
            }
            EmployeeDTO DTO = new EmployeeDTO(idStr, EDM.getEmployeeId(), EDM.getEmployeeName(),
                    EDM.getEmployeeBirthday(), EDM.getGender(), EDM.getEmployeeIdCard(), EDM.getEmployeeSalary(),
                    EDM.getEmployeePhone(), EDM.getEmployeeEmail(), EDM.getEmployeeAddress(),
                    EDM.getDivision(), EDM.getPosition(), EDM.getEducationDegree(), EDM.getUser());
            employeeListDTO.add(DTO);
        }
        return employeeListDTO;
    }
}
