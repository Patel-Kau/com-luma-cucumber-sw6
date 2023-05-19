Feature: Gear Test
  @sanity @regression
  Scenario: user Should Add Product Success Fully To Shopping Cart
    Given  I am on homepage
    When Mouse Hover on Gear Menu
    And  Click on Bags
    And  Click on Product Name ‘Overnight Duffle’
    Then Verify the product text "Overnight Duffle"
    And  Change Qty "3"
    And  Click on ‘Add to Cart’ Button.
    Then Verify the product text in shopping cart "You added Overnight Duffle to your shopping cart."
    And  Click on ‘shopping cart’ Link into message
    Then Verify the product name in shopping cart "Overnight Duffle"
    Then Verify the Qty is "3"
    Then Verify the product price "$135.00"
    And  Change Qty to "5"
    And  Click on ‘Update Shopping Cart’ button
    Then Verify the product price after updating "$225.00"