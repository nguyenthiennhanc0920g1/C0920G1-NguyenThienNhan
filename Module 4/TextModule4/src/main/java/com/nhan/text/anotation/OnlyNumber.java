package com.nhan.text.anotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = CheckNumber.class)
@Documented
public @interface OnlyNumber {
    String message() default "Chỉ được nhập số";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}