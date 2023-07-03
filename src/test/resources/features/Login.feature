@Login
Feature: Login
  As a user I want to login website sauce demo

  Scenario: Normal login
    Given User already on website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on product page

  Scenario Outline: Invalid Login
    Given User already on website sauce demo
    When User input "<userName>" as userName and input "<password>" as password
    Then User see error "<erorText>" on login page

    Examples:
      |userName     |password     |erorText                                                                 |
      |standard_user|             |Epic sadface: Password is required                                       |
      |             |secret_sauce |Epic sadface: Username is required                                       |
      |arum         |123          |Epic sadface: Username and password do not match any user in this service|