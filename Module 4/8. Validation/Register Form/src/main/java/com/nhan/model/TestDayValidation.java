package com.nhan.model;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class TestDayValidation implements ConstraintValidator<TestDay, String> {
   List<String> authors = Arrays.asList("Santideva", "Marie Kondo", "Martin Fowler", "levunguyen");

   @Override
   public boolean isValid(String value, ConstraintValidatorContext context) {

      return authors.contains(value);

   }
}
