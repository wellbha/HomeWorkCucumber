Feature: Computers page
  @computers
  Scenario: User should be able to click on Computers category
    Given user is on the homepage
    When user click on Computers from category list
    Then user should be directed to Computers page