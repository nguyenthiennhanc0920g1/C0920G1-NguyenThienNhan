package com.nhan.case_study.anotation;

import com.nhan.case_study.utilites_regex_exception_read_write_file.regex.RegexToBoolean;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckAgeValidator implements ConstraintValidator<CheckAge, String> {

    public boolean isValid(String value, ConstraintValidatorContext context) {
        return RegexToBoolean.regexDate(value);
    }
}
