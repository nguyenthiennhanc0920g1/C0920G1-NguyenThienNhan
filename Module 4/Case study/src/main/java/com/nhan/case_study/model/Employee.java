package com.nhan.case_study.model;

import com.nhan.case_study.anotation.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employeeId;

    @Column(name = "employee_name")
    @NotNull(message = "Tên không được để rỗng")
    @Size(min = 5, max = 30, message = "Tên phải từ 5 đến 30 ký tự")
    private String employeeName;

    @Column(name = "employee_birthday")
    @NotNull(message = "Ngày sinh không được để rỗng")
    @CheckAge
    @CheckAge18
    private String employeeBirthday;

    @Column(name = "employee_gender")
    @NotNull(message = "Chọn giới tính")
    private String gender;

    @Column(name = "employee_id_card")
    @Size(min = 9, max = 9, message = "Id card phải đủ 9 số")
    @OnlyNumber
    private String employeeIdCard;

    @Column(name = "employee_salary")
    @OnlyNumberDouble
    private String employeeSalary;

    @Column(name = "employee_phone")
    @Size(min = 10, max = 10, message = "Số điện thoại phải đủ 10 số")
    @PhoneNumber
    private String employeePhone;

    @Column(name = "employee_email")
    @NotNull(message = "Email không được để rỗng")
    @Email(message = "Sai định dạng email", regexp = "[A-Za-z0-9]+@[A-Za-z0-9]+.[A-Za-z]+")
    private String employeeEmail;

    @Column(name = "employee_address")
    @NotNull(message = "Tên không được để rỗng")
    @Size(min = 5, max = 100, message = "Địa chỉ phải từ 5 đến 50 ký tự")
    private String employeeAddress;

    @ManyToOne
    @JoinColumn(name = "division_id", referencedColumnName = "division_id")
    private Division division;

    @ManyToOne
    @JoinColumn(name = "position_id", referencedColumnName = "position_id")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "education_degree_id", referencedColumnName = "education_degree_id")
    private EducationDegree educationDegree;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

    @OneToMany(mappedBy = "employee")
    private Set<Contract> contractSet;

    public Employee() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(String employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Contract> getContractSet() {
        return contractSet;
    }

    public void setContractSet(Set<Contract> contractSet) {
        this.contractSet = contractSet;
    }
}
