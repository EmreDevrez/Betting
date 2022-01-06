Feature: login



  @GS-1
  Scenario: User can log in successfully
    Given User is on the login webpage
    Then User enter a valid email address
    And User enter a valid password
    Then User click on Login button
    Then Verify User successfully logged in betting page


  @GS-2
  Scenario: User can reset login credentials
    Given  User is on the login webpage
    Then User be able to click the reset password button
    And User should enter the email address and birthdate
    Then User reset the password and click on submit button
    Then verify password reset


  @GS-3
  Scenario: User can not log in with an invalid email address
    Given User is on the login webpage
    Then User enter an invalid email address
    And User enter a valid password
    Then User click on the Login button
    Then verify error message "invalid email address."


  @GS-4
  Scenario: User can not log in with an invalid password
    Given User is on the login webpage
    Then User enter a valid email address
    And User enter an invalid password
    Then User click on the Login button
    Then verify error message "invalid  password."






