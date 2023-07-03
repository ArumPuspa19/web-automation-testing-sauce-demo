@Sales
Feature: Sales Product
  As a user I want to buy product

  Scenario: User sort product cart
    Given User already on website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on product page
    When User sort product list by "Name (Z to A)"
    And User click item "Test.allTheThings() T-Shirt (Red)"
    And User click item "Sauce Labs Onesie"
    Then User clicks cart button
    When User already on cart page
    And User clicks remove product "Test.allTheThings() T-Shirt (Red)"
    And User click Checkout button
    Then User already on Checkout Information Page
    When User input "Arum" as firstName , input "Puspa" as lastName and input "19293" as posCode
    And User click Continue Button
    Then User already on Checkout Overview
    Then Verify button finish
    Then User already on Checkout: Complete! page