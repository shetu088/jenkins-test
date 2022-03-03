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
@login
Feature: Login Functionality

  @Valid
  Scenario Outline: Validate if user is able to login with valid credentials
    Given user is on the login page
    And user enters the  username "<username>"
    When user enters the  password "<password>"
    And user clicks on the login button
    
    
    @Invalid
  Scenario Outline: Validate if user is able to login with valid credentials
    Given user is on the login page
    And user enters the  username "<username1>"
    When user enters the  password "<password1>"
    And user clicks on the login button

    Examples: 
      | username  | password |
      | Shravi    | Netlife12 |
      | Shreshtha | Netlife12 |
      
      
      
