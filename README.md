# POE Part 1 - Login and Registration System

 Features Implemented

Registration System:
- Username validation: Must contain an underscore (`_`) and be no longer than 5 characters
- Password complexity validation:
  - Minimum 8 characters
  - At least 1 capital letter
  - At least 1 number
  - At least 1 special character
- South African cell phone number validation (`+27` followed by 9 digits)
- Detailed success/error messages for each field

**Login System:**
- Secure login using stored credentials
- Welcome message with user’s first and last name on successful login
- Error message for incorrect credentials

Class Structure

**`Login.java`** contains all required methods:

| Method                        | Functionality |
|------------------------------|-------------|
| `checkUserName()`            | Validates username format |
| `checkPasswordComplexity()`  | Checks password rules |
| `checkCellPhoneNumber()`     | Validates +27 South African number |
| `registerUser()`             | Handles full registration + returns messages |
| `loginUser()`                | Verifies login credentials |
| `returnLoginStatus()`        | Returns welcome or error message |

How to Run

1. Open the project in **NetBeans** (or any Java IDE)
2. Run `Main.java` (recommended for manual testing)
3. Or run `LoginTest.java` to execute all unit tests
4.  Unit Tests Included
- Username correct / incorrect
- Password complexity correct / incorrect
- Cell number correct / incorrect
- Login successful / failed

### Technologies
- Java
- Regular Expressions (Regex) for validation
- JUnit 4 (for testing)

### Author
ST10538891 Marcus Ikotela Mpongo
Independent Institute of Education (IIE)  
April 2026



