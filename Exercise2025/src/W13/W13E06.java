package W13;

/**
 * W13E06: Input Validation with Custom Exceptions
 * 
 * LEARNING OBJECTIVES:
 * - Use custom exceptions to validate user input
 * - Create domain-specific validation exceptions
 * - Implement validation methods with exception throwing
 * - Handle validation errors gracefully in loops
 * 
 * KEY CONCEPTS:
 * 1. Validation exception: Thrown when input doesn't meet specific criteria
 * 2. Common validation rules: format, length, allowed characters, range
 * 3. Custom exceptions allow domain-specific validation
 * 4. Validation can be encapsulated in static methods
 * 5. try-catch loops allow users to retry on validation failure
 * 
 * VALIDATION PATTERNS:
 * - Email validation: Must contain '@' and '.'
 * - Password validation: Minimum length, special characters
 * - Phone number validation: Correct format and length
 * - Age validation: Within acceptable range
 * - Username validation: Allowed characters, length constraints
 * 
 * COMMON STRING METHODS:
 * - contains(String): Check if string contains substring
 * - length(): Get string length
 * - matches(String regex): Check if matches pattern
 * - indexOf(char): Find position of character
 * - substring(start, end): Extract portion of string
 * - toUpperCase(), toLowerCase(): Case conversion
 */

/**
 * STEP 1: Define custom validation exceptions
 */

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    private int minimumLength;
    
    public InvalidPasswordException(String message, int minimumLength) {
        super(message);
        this.minimumLength = minimumLength;
    }
    
    public int getMinimumLength() {
        return minimumLength;
    }
}

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

/**
 * STEP 2: Define custom exception with specific format requirements
 */
class InvalidUsernameException extends Exception {
    private String reason;
    
    public InvalidUsernameException(String message, String reason) {
        super(message);
        this.reason = reason;
    }
    
    public String getReason() {
        return reason;
    }
}

/**
 * STEP 3: Main class with validation logic
 */
public class W13E06 {
    
    public static void main(String[] args) {
        // EXAMPLE 1: Email validation
        System.out.println("=== Example 1: Email Validation ===");
        emailValidationExample();
        System.out.println();
        
        // EXAMPLE 2: Password validation with strength checking
        System.out.println("=== Example 2: Password Validation ===");
        passwordValidationExample();
        System.out.println();
        
        // EXAMPLE 3: Phone number validation
        System.out.println("=== Example 3: Phone Number Validation ===");
        phoneValidationExample();
        System.out.println();
        
        // EXAMPLE 4: Username validation with multiple rules
        System.out.println("=== Example 4: Username Validation ===");
        usernameValidationExample();
    }
    
    /**
     * EXAMPLE 1: Email validation
     * 
     * Validation rules:
     * - Must contain '@' symbol
     * - Must contain '.' (dot)
     * - '@' must come before '.'
     * 
     * EMAIL FORMAT: localpart@domain.extension
     * Examples:
     * - Valid: user@example.com, john.doe@company.co.uk
     * - Invalid: invalid-email, user@domain, user.domain
     */
    public static void emailValidationExample() {
        // Array of test emails
        String[] emails = {
            "user@example.com",      // Valid
            "invalid-email-address", // Invalid: no @ or .
            "badrul@wix1002.com",    // Valid
            "student@gmail",         // Invalid: no domain extension
            "no-at-sign.com"         // Invalid: no @ symbol
        };
        
        System.out.println("Validating email addresses:\n");
        
        for (String email : emails) {
            try {
                // Call validation method
                // If invalid, it throws InvalidEmailException
                validateEmail(email);
                System.out.println("✓ VALID: " + email);
                
            } catch (InvalidEmailException e) {
                // Exception caught if validation fails
                System.out.println("✗ INVALID: " + email);
                System.out.println("  Reason: " + e.getMessage());
            }
        }
    }
    
    /**
     * EXAMPLE 2: Password validation
     * 
     * Validation rules:
     * - Minimum length: 8 characters
     * - Must contain at least one digit (0-9)
     * - Must contain at least one letter
     */
    public static void passwordValidationExample() {
        String[] passwords = {
            "Pass123",           // Invalid: too short
            "password",          // Invalid: no digit
            "12345678",          // Invalid: no letter
            "MyPass123",         // Valid
            "SecurePassword2024" // Valid
        };
        
        System.out.println("Validating passwords:\n");
        
        for (String password : passwords) {
            try {
                validatePassword(password);
                System.out.println("✓ VALID: " + password);
                
            } catch (InvalidPasswordException e) {
                System.out.println("✗ INVALID: " + password);
                System.out.println("  Error: " + e.getMessage());
                System.out.println("  Minimum required length: " + e.getMinimumLength());
            }
        }
    }
    
    /**
     * EXAMPLE 3: Phone number validation
     * 
     * Validation rules:
     * - Must be exactly 10 digits
     * - Can optionally contain hyphens or spaces for formatting
     * - No letters or special characters
     */
    public static void phoneValidationExample() {
        String[] phoneNumbers = {
            "0123456789",        // Valid
            "012-345-6789",      // Valid (with hyphens)
            "012 345 6789",      // Valid (with spaces)
            "12345",             // Invalid: too short
            "012345678901",      // Invalid: too long
            "0123456abc",        // Invalid: contains letters
            "not-a-number"       // Invalid: not numeric
        };
        
        System.out.println("Validating phone numbers:\n");
        
        for (String phone : phoneNumbers) {
            try {
                validatePhoneNumber(phone);
                System.out.println("✓ VALID: " + phone);
                
            } catch (InvalidPhoneNumberException e) {
                System.out.println("✗ INVALID: " + phone);
                System.out.println("  Reason: " + e.getMessage());
            }
        }
    }
    
    /**
     * EXAMPLE 4: Username validation with multiple rules
     * 
     * Validation rules:
     * - Length: 3-15 characters
     * - Must start with a letter
     * - Can contain letters, numbers, underscores, and hyphens
     * - Cannot contain spaces
     */
    public static void usernameValidationExample() {
        String[] usernames = {
            "john_doe",          // Valid
            "user123",           // Valid
            "a_b",               // Valid (minimum length)
            "ab",                // Invalid: too short
            "this_is_a_very_long_username_here",  // Invalid: too long
            "123start",          // Invalid: starts with number
            "user@domain",       // Invalid: contains @
            "user name",         // Invalid: contains space
            "_underscore",       // Invalid: starts with underscore
            "ValidUser-01"       // Valid
        };
        
        System.out.println("Validating usernames:\n");
        
        for (String username : usernames) {
            try {
                validateUsername(username);
                System.out.println("✓ VALID: " + username);
                
            } catch (InvalidUsernameException e) {
                System.out.println("✗ INVALID: " + username);
                System.out.println("  Error: " + e.getMessage());
                System.out.println("  Reason: " + e.getReason());
            }
        }
    }
    
    /**
     * VALIDATION METHOD 1: Email Validation
     * 
     * Rules:
     * - Must contain '@' character
     * - Must contain '.' character
     * - '@' must come before '.'
     * 
     * @param email The email address to validate
     * @throws InvalidEmailException if email format is invalid
     */
    public static void validateEmail(String email) throws InvalidEmailException {
        // Check for @ symbol
        if (!email.contains("@")) {
            throw new InvalidEmailException(
                "Email '" + email + "' is invalid. Missing '@' symbol."
            );
        }
        
        // Check for . (dot)
        if (!email.contains(".")) {
            throw new InvalidEmailException(
                "Email '" + email + "' is invalid. Missing domain extension (no '.')."
            );
        }
        
        // Check @ comes before .
        int atIndex = email.indexOf("@");
        int dotIndex = email.indexOf(".");
        
        if (atIndex > dotIndex) {
            throw new InvalidEmailException(
                "Email '" + email + "' is invalid. '.' must come after '@'."
            );
        }
    }
    
    /**
     * VALIDATION METHOD 2: Password Validation
     * 
     * Rules:
     * - Minimum 8 characters
     * - Must contain at least one letter (A-Z, a-z)
     * - Must contain at least one digit (0-9)
     * 
     * @param password The password to validate
     * @throws InvalidPasswordException if password doesn't meet requirements
     */
    public static void validatePassword(String password) throws InvalidPasswordException {
        int minLength = 8;
        
        // Check length
        if (password.length() < minLength) {
            throw new InvalidPasswordException(
                "Password is too short. Current length: " + password.length(),
                minLength
            );
        }
        
        // Check for at least one letter
        boolean hasLetter = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
                break;
            }
        }
        
        if (!hasLetter) {
            throw new InvalidPasswordException(
                "Password must contain at least one letter (A-Z, a-z).",
                minLength
            );
        }
        
        // Check for at least one digit
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        
        if (!hasDigit) {
            throw new InvalidPasswordException(
                "Password must contain at least one digit (0-9).",
                minLength
            );
        }
    }
    
    /**
     * VALIDATION METHOD 3: Phone Number Validation
     * 
     * Rules:
     * - Must contain exactly 10 digits
     * - Can contain optional formatting (hyphens, spaces)
     * - No letters or special characters except - and space
     * 
     * @param phoneNumber The phone number to validate
     * @throws InvalidPhoneNumberException if format is invalid
     */
    public static void validatePhoneNumber(String phoneNumber) 
            throws InvalidPhoneNumberException {
        
        // Remove formatting characters (hyphens and spaces)
        String digitsOnly = phoneNumber.replaceAll("[\\s-]", "");
        
        // Check if exactly 10 digits
        if (digitsOnly.length() != 10) {
            throw new InvalidPhoneNumberException(
                "Phone number must contain exactly 10 digits. Found: " + digitsOnly.length()
            );
        }
        
        // Check if all are digits
        for (char c : digitsOnly.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new InvalidPhoneNumberException(
                    "Phone number contains non-digit character: " + c
                );
            }
        }
    }
    
    /**
     * VALIDATION METHOD 4: Username Validation
     * 
     * Rules:
     * - Length: 3-15 characters
     * - Must start with a letter
     * - Can contain letters, digits, underscores, hyphens
     * - No spaces or other special characters
     * 
     * @param username The username to validate
     * @throws InvalidUsernameException if format is invalid
     */
    public static void validateUsername(String username) throws InvalidUsernameException {
        // Check length
        if (username.length() < 3) {
            throw new InvalidUsernameException(
                "Username is too short. Minimum: 3 characters.",
                "Length less than 3"
            );
        }
        
        if (username.length() > 15) {
            throw new InvalidUsernameException(
                "Username is too long. Maximum: 15 characters.",
                "Length greater than 15"
            );
        }
        
        // Check first character is a letter
        if (!Character.isLetter(username.charAt(0))) {
            throw new InvalidUsernameException(
                "Username must start with a letter.",
                "First character is not a letter"
            );
        }
        
        // Check all characters are valid (letters, digits, underscore, hyphen)
        for (char c : username.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '_' && c != '-') {
                throw new InvalidUsernameException(
                    "Username contains invalid character: " + c,
                    "Invalid character '" + c + "' (only letters, digits, _, - allowed)"
                );
            }
        }
    }
}
