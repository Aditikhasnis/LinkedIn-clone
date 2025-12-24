package com.linkedin.linkedin.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    
    private static final String EMAIL_PATTERN = 
        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    
    /**
     * Validate an email address against RFC 5322 standard
     * 
     * @param email The email to validate
     * @return true if the email is valid, false otherwise
     */
    public static boolean isValid(String email) {
        if (email == null) {
            return false;
        }
        
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    /**
     * Validate an email and throw an exception if invalid
     * 
     * @param email The email to validate
     * @throws IllegalArgumentException if the email is invalid
     */
    public static void validate(String email) throws IllegalArgumentException {
        if (!isValid(email)) {
            throw new IllegalArgumentException("Invalid email format: " + email);
        }
    }
}