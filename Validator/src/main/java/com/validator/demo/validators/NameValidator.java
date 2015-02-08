package com.validator.demo.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.validator.demo.annotation.StudentValidation;

@Component
public class NameValidator implements ConstraintValidator<StudentValidation, String> {

	private StudentValidation valid;

	public boolean isValid(String str, ConstraintValidatorContext context) {
		if (valid.caseSensitive()) {
			return str.endsWith("Keerthi Kumar N");
		} else {
			return str.equalsIgnoreCase("Keerthi Kumar N");
		}
	}

	public void initialize(StudentValidation valid) {
		this.valid = valid;
	}

}
