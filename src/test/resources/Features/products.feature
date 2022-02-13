Feature: To validate search functionality of user page

  @sanity
  Scenario: To search the Searchability of desired product
    Given user needs to been in amazon page
    When User will enter product name in search box
      | products |
      | iphone   |
      | Shoes    |
    And User clicks the search button
    Then User will redirect to product page
