Feature: Apparel page
  @apparel
  Scenario: User should be able to click on Apparel category
    Given user is on the homepage
    When user click on Apparel from category list
    Then user should be directed to Apparel page