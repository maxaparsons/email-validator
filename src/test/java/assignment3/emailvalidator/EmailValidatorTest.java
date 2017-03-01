package assignment3.emailvalidator;

import static org.junit.Assert.*;

import org.junit.Test;

/*
 * Stage 2 Acceptance Test:
 * Given an email address,
 * When the validate method is called,
 * Then the return value is the correct number of rules the email satisfies
 */
public class EmailValidatorTest {

	@Test
	/* all rules pass
	 * the email had exactly 1 "@" characters
	 * the email had at least 1 "." characters
	 * the email began with alphabetical characters
	 * the email ends with "com"
	 */
	public void testAllRulesPassed() {
		EmailValidator validator = new EmailValidator();
		assertEquals(4, validator.validateEmail("example123@example.com"));
	}
	
	@Test
	//only rule one passes
	public void testRuleOnePassedOnly() {
		EmailValidator validator = new EmailValidator();
		assertEquals(1, validator.validateEmail("#example@exampleca"));
	}
	
	@Test
	//only rule two passes
	public void testRuleTwoPassedOnly() {
		EmailValidator validator = new EmailValidator();
		assertEquals(1, validator.validateEmail("#@@666....ca"));
	}
	
	@Test
	//only rule three passes
	public void testRuleThreePassedOnly() {
		EmailValidator validator = new EmailValidator();
		assertEquals(1, validator.validateEmail("example@@exampleca"));
	}
	
	@Test
	//only rule four passes
	public void testRuleFourPassedOnly() {
		EmailValidator validator = new EmailValidator();
		assertEquals(1, validator.validateEmail("#examplecom"));
	}
	
	@Test
	//rules one and two pass
	public void testRuleOneAndTwoPassed() {
		EmailValidator validator = new EmailValidator();
		assertEquals(2, validator.validateEmail("#example@example.ca"));
	}
	
	@Test
	//rules one and three pass
	public void testRuleOneAndThreePassed() {
		EmailValidator validator = new EmailValidator();
		assertEquals(2, validator.validateEmail("example@exampleca"));
	}
	
	@Test
	//rules one and four pass
	public void testRuleOneAndFourPassed() {
		EmailValidator validator = new EmailValidator();
		assertEquals(2, validator.validateEmail("#example@examplecom"));
	}
	
	@Test
	//rules two and three pass
	public void testRuleTwoAndThreePassed() {
		EmailValidator validator = new EmailValidator();
		assertEquals(2, validator.validateEmail("example@@example.ca"));
	}
	
	@Test
	//rules two and four pass
	public void testRuleTwoAndFourPassed() {
		EmailValidator validator = new EmailValidator();
		assertEquals(2, validator.validateEmail("#@@example.com"));
	}
	
	@Test
	//rules three and four pass
	public void testRuleThreeAndFourPassed() {
		EmailValidator validator = new EmailValidator();
		assertEquals(2, validator.validateEmail("exampleexamplecom"));
	}
	
	@Test
	//only rule four fails
	public void testRuleFourFails() {
		EmailValidator validator = new EmailValidator();
		assertEquals(3, validator.validateEmail("example@example.ca"));
	}
	
	@Test
	//only rule three fails
	public void testRuleThreeFails() {
		EmailValidator validator = new EmailValidator();
		assertEquals(3, validator.validateEmail("#example@example.com"));
	}
	
	@Test
	//only rule two fails
	public void testRuleTwoFails() {
		EmailValidator validator = new EmailValidator();
		assertEquals(3, validator.validateEmail("example@examplecom"));
	}
	
	@Test
	//only rule one fails
	public void testRuleOneFails() {
		EmailValidator validator = new EmailValidator();
		assertEquals(3, validator.validateEmail("exampleexample.com"));
	}
	
	@Test
	//no rule passes
	public void testNoRulesPassed() {
		EmailValidator validator = new EmailValidator();
		assertEquals(0, validator.validateEmail("#example@@exampleca"));
	}

}
