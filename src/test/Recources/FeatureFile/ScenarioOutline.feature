Feature: tesing different pages
  @scenriooutline
  Scenario Outline: use should be able to test the different pages on url
    Given user is on the homepage
    When user click on the "<category>" link
    Then user should be directed to "<categoryPageUrl>" successfully
    Examples:
      | category    | categoryPageUrl                          |
      | Computers   | https://demo.nopcommerce.com/computers   |
      | Books       | https://demo.nopcommerce.com/books       |
      | Electronics | https://demo.nopcommerce.com/electronics |
      | Gift Cards  | https://demo.nopcommerce.com/gift-cards  |
      | Jewelry     | https://demo.nopcommerce.com/jewelry     |
      | Apparel     | https://demo.nopcommerce.com/apparel     |