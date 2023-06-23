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
Feature: Login Dan Menambah User Baru
  I want to use this template for my feature file

  Scenario Outline: masuk berhasil
    Given User navigate to login OrangeHRM
    When Masukan <Username> Dan <Password>
    And Klik button login

    Examples: 
      | Username | Password                 |
      | Admin    | hUKwJTbofgPU9eVlw/CnDQ== |

  Scenario: Menambahkan User Admin
    Given User navigate to Admin Page
    When click Button Add
    And User Select User Role
    And User Select Status
    And User Enter Employee Name
    And User Enter Username, Password And Confirm Password
    When User Click Button Save
    Then User Navigate To User Management
