package com.annotation.constraint.validation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.annotation.constraint.validation.enumeration.StringCase;
import com.annotation.constraint.validation.validator.CaseValidator;

@Target({FIELD, METHOD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = CaseValidator.class)
@Documented
public @interface ValidateStringCase {
	 String message();

	 Class<?>[] groups() default {};

	 Class<? extends Payload>[] payload() default {};
	 
	 StringCase value();
	    
}
