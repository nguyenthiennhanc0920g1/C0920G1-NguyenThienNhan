package com.nhan.text.anotation;

import com.nhan.text.utilites_regex_exception_read_write_file.regex.RegexToBoolean;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckPhoneNumber implements ConstraintValidator<PhoneNumber, String> {

   public boolean isValid(String value, ConstraintValidatorContext context) {

      return RegexToBoolean.regexPhoneNumber(value);
   }
}
