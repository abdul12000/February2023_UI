Feature: SwagLabs
  Purchasing items in swaglab
  @Swag
  Scenario: Happy path to purchase an item
    Given I am on the swag lab home page "https://www.saucedemo.com/"
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




