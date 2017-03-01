package assignment3.emailvalidator;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Stage 1 Acceptance Test:
 * Given an email address,
 * When the validate method is called,
 * Then the return value is the correct number of rules the email satisfies
 */
public class EmailValidatorTest {

	@Test
	/* both rules pass
	 * meaning the email had exactly 1 "@" characters
	 * and the email had at least 1 "." characters
	 */
	public void bothRulesPassed() {
		EmailValidator validator = new EmailValidator();
		assertEquals(2, validator.validateEmail("example@example.com"));
	}
	
	@Test
	/* only rule one passes
	 * meaning the email had exactly 1 "@" characters
	 * and the email had 0 "." characters
	 */
	public void ruleOnePassedOnly() {
		EmailValidator validator = new EmailValidator();
		assertEquals(1, validator.validateEmail("example@examplecom"));
	}
	
	@Test
	/* only rule two passes
	 * meaning the email had more than 1 or 0 "@" characters
	 * and the email had at least 1 "." characters
	 */
	public void ruleTwoPassedOnly() {
		EmailValidator validator = new EmailValidator();
		assertEquals(1, validator.validateEmail("example@@example.com"));
	}
	
	@Test
	/* no rule passes
	 * meaning the email had more than 1 or 0 "@" characters
	 * and the email had 0 "." characters
	 */
	public void noRulesPassed() {
		EmailValidator validator = new EmailValidator();
		assertEquals(0, validator.validateEmail("exampleexamplecom"));
	}

}
