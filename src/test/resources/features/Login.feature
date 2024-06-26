@login @regression

Feature: WebDriver University - Login Page

  Background:
    Given I access the webdriver university login page
  @login1
  Scenario: Validate Successful Login
    When I enter a username webdriver
    And I enter a password webdriver123
    And I click on the login button
    Then I should be presented with the successful login message

  Scenario:  Validate Unsuccessful Login with incorrect username
    When I enter a username webdriver1
    And I enter a password webdriver123
    And I click on the login button
    Then I should be presented with the unsuccessful login message


  Scenario:  Validate Unsuccessful Login with incorrect password
    When I enter a username webdriver
    And I enter a password password123
    And I click on the login button
    Then I should be presented with the unsuccessful login message
  @smoke @ignore
  Scenario Outline: Validate - Successful & Unsuccessful Login
    When  I enter a username <username>
    And I enter a password <password>
    And I click on the login button
    Then I should be presented with the following login validation message <loginValidationMessage>

    Examples:
    | username | password      | loginValidationMessage |
    | webdriver | webdriver123 | validation succeeded   |
    | webdriver | webriver1    | validation failed      |
    | joe_blog  | password1    | validation failed      |
