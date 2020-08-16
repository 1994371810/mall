package com.mt.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = FlagValidatorConstraint.class)
public @interface FlagValidator {

    String[] value() ;

    String message() default "参数错误";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };



}
