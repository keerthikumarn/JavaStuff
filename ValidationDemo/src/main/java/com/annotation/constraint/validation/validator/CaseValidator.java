package com.annotation.constraint.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.annotation.constraint.validation.ValidateStringCase;
import com.annotation.constraint.validation.enumeration.StringCase;

public class CaseValidator implements ConstraintValidator<ValidateStringCase, String>{
	
	private StringCase strCase;

	public void initialize(ValidateStringCase strCase) {
		this.strCase = strCase.value();
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value == null){
			return true;
		}
		
		if(strCase == StringCase.UPPER){
			return value.equals(value.toUpperCase());
		}else{
			return value.equals(value.toLowerCase());
		}
	}

}
