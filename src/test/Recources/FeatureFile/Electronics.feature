Feature: Electronics page
  @electronics
  Scenario: User should be able to click on Electronics category
    Given user is on the homepage
    When user click on Electronics from category list
    Then user should be directed to Electronics page