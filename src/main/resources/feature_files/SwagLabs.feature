Feature: SwagLabs
  Purchasing items in swaglab

  @Swag
  Scenario: 1. Happy path to purchase an item
#    Given I am on the swag lab home page "https://www.saucedemo.com/"
    Given I am on the swag lab home page
    When I enter valid username and valid password
    And I click on Login button
    And I click on the first item on the Products page
    And I click on Add to cart button
    And I click on Shopping cart
    And I click on Checkout
    And I complete all the required fields
    And I click on Continue button
    And I click on Finish button
    Then "THANK YOU FOR YOUR ORDER!" message is displayed on the order confirmation page

  Scenario: 2. Error msg should be displayed if postcode field is not populated on the checkout page
    Given I am on the swag lab home page "https://www.saucedemo.com/"
    When I enter valid username and valid password
    And I click on Login button
    And I click on the first item on the Products page
    And I click on Add to cart button
    And I click on Shopping cart
    And I click on Checkout
    And I enter details for only firstname and lastname
    And I click on Continue button
    Then error msg "Error: Postal Code is required" is displayed
#    Then error msg "Error: Postal Code is required" is displayed under postcode field

  Scenario: 3-Error msg should be displayed if Firstname field is not populated on the checkout page
    Given I am on the swag lab home page "https://www.saucedemo.com/"
    When I enter valid username and valid password
    And I click on Login button
    And I click on the first item on the Products page
    And I click on Add to cart button
    And I click on Shopping cart
    And I click on Checkout
    And I enter details for only lastname and postcode
    And I click on Continue button
    Then error msg "Error: First Name is required" is displayed
#    Then error msg "Error: First Name is required" is displayed under firstname field

  Scenario:4 Error msg should be displayed if Lastname field is not populated on the checkout page
    Given I am on the swag lab home page "https://www.saucedemo.com/"
    When I enter valid username and valid password
    And I click on Login button
    And I click on the first item on the Products page
    And I click on Add to cart button
    And I click on Shopping cart
    And I click on Checkout
    And I enter details for only firstname and postcode
    And I click on Continue button
    Then error msg "Error: Last Name is required" is displayed
#    Then error msg "Error: Last Name is required" is displayed under lastname field


  Scenario:5 Error msg should be displayed invalid password is entered for login
    Given I am on the swag lab home page "https://www.saucedemo.com/"
    When I enter valid username
    And I enter invalid password
    And I click on Login button
    Then error message is displayed and I am not logged in

  Scenario:6 Check that items can be added and removed from the cart
    Given I am on the swag lab home page "https://www.saucedemo.com/"
    When I enter valid username and valid password
    And I click on Login button
    And I click on the first item on the Products page
    And I click on Add to cart button
    Then 1 item is added to the cart
    When I click remove button
    Then cart should have no itme in it
