@Login
Feature: Login

  @LOGIN01
  Scenario:  Ensure the error message is displayed when username and password invalid
    Given Navigate to the website
    When Input username field with invalid username
    And Input password field with invalid password
    And Click the login button
    Then Error message is displayed for invalid state

  @LOGIN02
  Scenario: Ensure the error message is displayed when username and password empty
    Given Navigate to the website
    When Click the login button
    Then Error message is displayed for empty state

  @LOGIN03
  Scenario: Successfully logged in using valid account
    Given Navigate to the website
    When Input username field with valid username
    And Input password field with valid password
    And Click the login button
    When The text Dashboard is visible in the page header

  @LOGIN04
  Scenario: Successfully logged out
    When Click the profile
    And Click the logoutbutton
    Then The text login is visible in the login page