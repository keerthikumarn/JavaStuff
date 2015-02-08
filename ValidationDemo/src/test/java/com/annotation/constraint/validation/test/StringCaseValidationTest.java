package com.annotation.constraint.validation.test;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;

import com.annotation.constraint.validation.model.Student;

public class StringCaseValidationTest {

	private static Validator validator;

	@BeforeClass
	public static void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	public void shouldReturnErrorMessageWhenNameIsNotInUpperCase() {
		System.out
				.println("Test - shouldReturnErrorMessageWhenNameIsNotInUpperCase");
		Student student = new Student("keerthi");
		Set<ConstraintViolation<Student>> constraintViolations = validator
				.validate(student);
		assertEquals(1, constraintViolations.size());
		assertEquals("String should be in UPPER case", constraintViolations
				.iterator().next().getMessage());
		System.out.println(constraintViolations.iterator().next().getMessage());
	}

	@Test
	public void shouldNotReturnErrorMessageWhenNameIsNotInUpperCase() {
		System.out.println("Test - shouldNotReturnErrorMessageWhenNameIsNotInUpperCase");
		Student student = new Student("KEERTHI");
		Set<ConstraintViolation<Student>> constraintViolations = validator
				.validate(student);
		assertEquals(0, constraintViolations.size());
	}
}
