package com.nhan.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Register implements Validator {
    @NotNull
    @Size(min = 5, max = 45, message = "khong du size")
    private String firstName;
    @NotNull
    @Size(min = 5, max = 45)
    private String lastName;
    private String phone;
    @NotNull
    @Email(message = "nhap sai email")
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Register.class.isAssignableFrom(clazz);
    }


    @Override
    public void validate(Object target, Errors errors) {

        Register phone = (Register) target;
        String number = phone.getPhone();
        ValidationUtils.rejectIfEmpty(errors, "phone", "phone.empty");
        if (number.length() > 11 || number.length() < 10) {
            errors.rejectValue("phone", "phone.length");
        }
        if (!number.startsWith("0")) {
            errors.rejectValue("phone", "phone.startsWith");
        }
        if (!number.matches("(^$|[0-9]*$)")) {
            errors.rejectValue("phone", "phone.matches");
        }
    }
}
