Feature: Women Test

  @sanity @regression
Scenario: verify the sort by product name filter
    Given  I am on homepage
    When   Mouse Hover on Women Menu
    And    Mouse Hover on Tops
    And    Click on Jackets
   Then   Verify the products name display in alphabetical order



  @smoke @regression
Scenario: verify the sort by price filter
    Given I am on homepage
    When  Mouse Hover on Women Menu
    And   Mouse Hover on Tops
    And   Click on Jackets
    Then  Verify the products price display in Low to High