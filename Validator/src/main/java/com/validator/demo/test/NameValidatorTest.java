package com.validator.demo.test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import javax.validation.ConstraintValidatorContext;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.validator.demo.annotation.StudentValidation;
import com.validator.demo.model.Student;
import com.validator.demo.validators.NameValidator;

@RunWith(MockitoJUnitRunner.class)
public class NameValidatorTest{
	
	private Student student;
	
	@InjectMocks
	private NameValidator validator;
	
	@Mock
	private ConstraintValidatorContext context;
	
	@Mock
	private StudentValidation valid;
	
	
	@Before
	public void setup(){
		student = new Student();
		student.setName("Keerthi");
	}
	
	@Test
	public void shouldReturnErrorMessageWhenNameIsInvalid(){
		boolean isValidName = validator.isValid(student.getName(), context);
		System.out.println("Msg : "+valid.message());
		assertFalse(isValidName);
	}
	
	@Test
	public void shouldNotReturnErrorMessageWhenNameIsValid(){
		student.setName("Keerthi Kumar N");
		boolean isValidName = validator.isValid(student.getName(), context);
		assertTrue(isValidName);
	}
	
}
