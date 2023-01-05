#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login feature

  @tag1
  Scenario Outline: Login scenario
    Given user opens the browser and login into the url
    When the user enter the username "ajith2810"
    And the user enter the password "user1234"
    Then the user clicks the login button

    Examples: 
      |username|password|status|
      | ajith2810 | user12345| success |
   
