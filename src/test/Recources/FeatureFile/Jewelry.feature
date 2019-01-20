Feature: Jewelry page
  @jewelry
  Scenario: User should be able to click on Jewelry category
    Given user is on the homepage
    When user click on Jewelry from category list
    Then user should be directed to Jewelry page