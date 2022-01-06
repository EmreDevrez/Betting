Feature: login



  @GS-1
  Scenario: User can log in successfully
    When User on the login webpage
    Then User enter a valid email address
    And User enter a valid password
    Then User click on Login button
    Then User successfully logged in betting page


  @GS-2
  Scenario: User can reset login credentials
    When User is on the login webpage
    Then User be able to click the reset password button
    And User enter the email address
    Then User click on submit button


  @GS-3
  Scenario: User can not log in with an invalid email address
    When User is on the login webpage
    Then User enter an invalid email address
    And User enter a valid password
    Then User click on the Login button
    Then User is not able to log in betting page


  @GS-4
  Scenario: User can not log in with an invalid password
    When User is on the login webpage
    Then User enter a valid email address
    And User enter an invalid password
    Then User click on the Login button
    Then User is not able to log in betting page

