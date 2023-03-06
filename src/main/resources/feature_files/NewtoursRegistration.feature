Feature:
@NT
  Scenario: Demonstrate use of Selenium Keys.ENTER
    Given I am on the Newtours website "https://demo.guru99.com/selenium/newtours"
    When I click on the register link
    And I enter Username, pword and confPWord as "lateef", "pppWord" and "pppWord"
  And I enter random email into the email addres field
    And I press enter on the Submit button
    Then account is created