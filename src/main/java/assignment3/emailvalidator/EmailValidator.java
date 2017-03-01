package assignment3.emailvalidator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	//constants
	private final String rule1 = "^[^@]*(@)[^@]*$"; //email has exactly one "@"
	private final String rule2 = "\\.+"; //email has at least one "."
	
	//attributes
	private String email;
	private int rulesPassed;
	private boolean validity;
	private Pattern pattern;
	private Matcher matcher;
	
	//constructors
	public EmailValidator()
	{
		
	}
	
	//getters
	public String getEmail()
	{
		return email;
	}
	public int getRulesPassed()
	{
		return rulesPassed;
	}
	
	//setters
	public void setEmail(String email)
	{
		this.email = email;
	}
	public void setPattern(final String rule)
	{
		pattern = Pattern.compile(rule);
	}
	public void setMatcher(String email)
	{
		matcher = pattern.matcher(email);
	}
	
	//toString
	public String toString()
	{
		return "Email: " + email + "\nValid: " + validity;
	}
	
	//methods
	public int validateEmail(String email)
	{
		//check if email passes rule 1
		setPattern(rule1);
		setMatcher(email);
		if (matcher.find())
		{
			rulesPassed++; //rule 1 passed
		}
		
		//check if email passes rule 2
		setPattern(rule2);
		setMatcher(email);
		if (matcher.find())
		{
			rulesPassed++; //rule 2 passed
		}
		
		return rulesPassed;
	}
}
