Feature: Amazon Login

  Scenario: Invalid Login
    Given I am on the Amazon login page
    And I have entered a valid username and password
    When I click on the signin button
    Then I should be logged in successfully