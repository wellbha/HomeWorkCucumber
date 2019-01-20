Feature: Books page
  @books
  Scenario: User should be able to click on Books category
    Given user is on the homepage
    When user click on Books from category list
    Then user should be directed to Books page