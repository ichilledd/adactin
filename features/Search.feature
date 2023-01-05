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
Feature: Search hotel feature
  I want to use this template for my feature file

  @hotel
  Scenario: Hotel search scenario
    Given as a user login into the application
    When user the hotel search page 
    And select location drop down to select the desired location
    And user select the hotel dropdown and select
    And user select the room type and number of room
    And user select the check in date and check out date
    And user the select the number of adult and number of children
    Then user clicks the search button and it should navigate to next page
    

 