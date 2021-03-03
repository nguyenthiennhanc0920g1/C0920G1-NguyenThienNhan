package com.nhan.case_study.service.employee.model;

import com.nhan.case_study.model.Division;
import com.nhan.case_study.model.EducationDegree;
import com.nhan.case_study.model.Position;
import com.nhan.case_study.model.User;

public class EmployeeDTO {
    private String employeeIdString;
    private int employeeId;
    private String employeeName;
    private String employeeBirthday;
    private String gender;
    private String employeeIdCard;
    private String employeeSalary;
    private String employeePhone;
    private String employeeEmail;
    private String employeeAddress;
    private Division division;
    private Position position;
    private EducationDegree educationDegree;
    private User user;

    public EmployeeDTO(String employeeIdString, int employeeId, String employeeName, String employeeBirthday,
                       String gender, String employeeIdCard, String employeeSalary, String employeePhone,
                       String employeeEmail, String employeeAddress, Division division, Position position,
                       EducationDegree educationDegree, User user) {
        this.employeeIdString = employeeIdString;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.gender = gender;
        this.employeeIdCard = employeeIdCard;
        this.employeeSalary = employeeSalary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.division = division;
        this.position = position;
        this.educationDegree = educationDegree;
        this.user = user;
    }

    public String getEmployeeIdString() {
        return employeeIdString;
    }

    public void setEmployeeIdString(String employeeIdString) {
        this.employeeIdString = employeeIdString;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
}
