Feature: Demoblaze Test Signup

  @web
  Scenario: User sign up with valid format username and password
    Given opens the web page
    And user click icon sign up
    When user input sign up username "userx1"
    And user input sign up password "userx1"
    And user click sign up button
    Then user will see message "Sign up successful."

  @web
  Scenario: User sign up with special character
    Given opens the web page
    And user click icon sign up
    When user input sign up username ")(*,&^%$#,@!^&*"
    And user input sign up password "!@#$%^&*()"
    And user click sign up button
    Then user will see message "Sign up successful."

  @web
  Scenario: User sign up only fill username
    Given opens the web page
    And user click icon sign up
    When user input sign up username "admin"
    And user click sign up button
    Then user will see message "Please fill out Username and Password"

  @web
  Scenario: User sign up only fill password
    Given opens the web page
    And user click icon sign up
    When user input sign up password "admin"
    And user click sign up button
    Then user will see message "Please fill out Username and Password"

  @web
  Scenario: User sign up without fill username and password
    Given opens the web page
    When user click icon sign up
    And user click sign up button
    Then user will see message "Please fill out Username and Password"
