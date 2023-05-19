Feature: Men Test

  @sanity @regression
Scenario: userShouldAddProductSuccessFullyToShoppingCart
  Given   I am on homepage
  When    Mouse Hover on Men Menu
  And     Mouse Hover on Bottoms
  And     Click on Pants
  And     Mouse Hover on product name and click on size Cronus Yoga Pant and click on size
  And     Mouse Hover on product name and click on colour Cronus Yoga Pant and click on colour Black
  And     Mouse Hover on product name and click on add to cart button Cronus Yoga Pant and click on Add To Cart Button
  Then    Verify the text You added Cronus Yoga Pant to your shopping cart
  And     Click on shopping cart Link into message
 Then     Verify the text "Shopping Cart"
 Then     Verify the product name "Cronus Yoga Pant"
 Then     Verify the product size "32"
  Then    Verify the product colour "Black"
