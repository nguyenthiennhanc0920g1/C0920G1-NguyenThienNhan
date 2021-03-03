package com.nhan.case_study.anotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = CheckNumberDouble.class)
@Documented
public @interface OnlyNumberDouble {
    String message() default "Chỉ được nhập số (định dạng 0.0)";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
