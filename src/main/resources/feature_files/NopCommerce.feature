@Regression
Feature: Nopcommerce
  @nop
    @smoke
  Scenario: Demonstrate use of mouse hoover
    Given I am on the nopcommerce website "https://demo.nopcommerce.com/"
    When I navigate to the Desktop page via mouse hoover
    Then Desktop page is disapled

  Scenario: Demonstrate use of mouse hoover 2
    Given I am on the nopcommerce website "https://demo.nopcommerce.com/"
    When I navigate to the Desktop page via
    Then Desktop page is disapled