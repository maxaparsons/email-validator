package assignment3.emailvalidator;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Stage 1 Acceptance Test:
 * Given a valid email address,
 * When the validate method is called,
 * Then the return value is 2.
 */
public class EmailValidatorTest {

	@Test
	public void stageOneTest() {
		EmailValidator validator = new EmailValidator();
		assertEquals(2, validator.validateEmail("example@example.com"));
	}

}
