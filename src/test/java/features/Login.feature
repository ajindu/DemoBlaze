Feature: Demoblaze Test Login

  @web
  Scenario: User login with valid username and password
    Given opens the web page
    And user click icon login
    When user input username "admin"
    And user input password "admin"
    And user click login button
    Then user will see text welcome

  @web
  Scenario: User login with invalid username and password
    Given opens the web page
    And user click icon login
    When user input username "secretuser"
    And user input password "secretuser"
    And user click login button
    Then user will see message "User does not exist"

  @web
  Scenario: User login with username only
    Given opens the web page
    And user click icon login
    When user input username "secretuser"
    And user click login button
    Then user will see message "Please fill out Username and Password"

  @web
  Scenario: User login with password only
    Given opens the web page
    And user click icon login
    When user input password "secretuser"
    And user click login button
    Then user will see message "Please fill out Username and Password"

  @web
  Scenario: User login without input username and password
    Given opens the web page
    And user click icon login
    When user click login button
    Then user will see message "Please fill out Username and Password"
