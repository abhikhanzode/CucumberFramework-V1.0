@Test
Feature: Testing my Cucumber framework

  Background: To check login module
    Given User Launching the Application
    When User Login the Application
    Then User successfully on the Home Page

  Scenario: To check the Product module
    Given Click on Product
    When Opening the Add Product
    And User filling the following information
      | Type    | Name  | Code   | Category |
      | Service | test1 | pro001 | General  |
    Then Logout the Application
