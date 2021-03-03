package com.nhan.case_study.model;

import com.nhan.case_study.anotation.CheckAge;
import com.nhan.case_study.anotation.CheckAge18;
import com.nhan.case_study.anotation.OnlyNumber;
import com.nhan.case_study.anotation.PhoneNumber;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "customer_name")
    @NotNull(message = "Tên không được để rỗng")
    @Size(min = 5, max = 30, message = "Tên phải từ 5 đến 30 ký tự")
    private String customerName;

    @Column(name = "customer_birthday")
    @NotNull(message = "Ngày sinh không được để rỗng")
    @CheckAge
    @CheckAge18
    private String customerBirthday;

    @Column(name = "customer_gender")
    @NotNull(message = "Chọn giới tính")
    private String gender;

    @Column(name = "customer_id_card")
    @Size(min = 9, max = 9, message = "Id card phải đủ 9 số")
    @OnlyNumber
    private String customerIdCard;

    @Column(name = "customer_phone")
    @Size(min = 10, max = 10, message = "Số điện thoại phải đủ 10 số")
    @PhoneNumber
    private String customerPhone;

    @Column(name = "customer_email")
    @NotNull(message = "Email không được để rỗng")
    @Email(message = "Sai định dạng email", regexp = "[A-Za-z0-9]+@[A-Za-z0-9]+.[A-Za-z]+")
    private String customerEmail;

    @Column(name = "customer_address")
    @NotNull(message = "Tên không được để rỗng")
    @Size(min = 5, max = 100, message = "Địa chỉ phải từ 5 đến 50 ký tự")
    private String customerAddress;

    @ManyToOne
    @JoinColumn(name = "customer_type_id", referencedColumnName = "customer_type_id")
    @NotNull(message = "Loại khách hàng không được để rỗng")
    private CustomerType customerType;

    @OneToMany(mappedBy = "customer")
    private Set<Contract> contractSet;

    public Customer() {
    }

    public Customer(String idString, String customerName, String customerBirthday, String gender, String customerIdCard,
                    String customerPhone, String customerEmail, String customerAddress, CustomerType customerType) {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Set<Contract> getContractSet() {
        return contractSet;
    }

    public void setContractSet(Set<Contract> contractSet) {
        this.contractSet = contractSet;
    }
}
