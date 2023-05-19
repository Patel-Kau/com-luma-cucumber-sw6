$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("gear.feature");
formatter.feature({
  "line": 1,
  "name": "Gear Test",
  "description": "",
  "id": "gear-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4173331500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "user Should Add Product Success Fully To Shopping Cart",
  "description": "",
  "id": "gear-test;user-should-add-product-success-fully-to-shopping-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@sanity"
    },
    {
      "line": 2,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Mouse Hover on Gear Menu",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click on Bags",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Product Name ‘Overnight Duffle’",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify the product text \"Overnight Duffle\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Change Qty \"3\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on ‘Add to Cart’ Button.",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Verify the product text in shopping cart \"You added Overnight Duffle to your shopping cart.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on ‘shopping cart’ Link into message",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verify the product name in shopping cart \"Overnight Duffle\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Verify the Qty is \"3\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Verify the product price \"$135.00\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Change Qty to \"5\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Click on ‘Update Shopping Cart’ button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Verify the product price after updating \"$225.00\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MenSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 77294300,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.mouseHoverOnGearMenu()"
});
formatter.result({
  "duration": 2182453800,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.clickOnBags()"
});
formatter.result({
  "duration": 2922831600,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.clickOnProductNameOvernightDuffle()"
});
formatter.result({
  "duration": 3154760700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Overnight Duffle",
      "offset": 25
    }
  ],
  "location": "GearSteps.verifyTheProductText(String)"
});
formatter.result({
  "duration": 165937600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 12
    }
  ],
  "location": "GearSteps.changeQty(String)"
});
formatter.result({
  "duration": 175687700,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.clickOnAddToCartButton()"
});
formatter.result({
  "duration": 192010000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You added Overnight Duffle to your shopping cart.",
      "offset": 42
    }
  ],
  "location": "GearSteps.verifyTheProductTextInShoppingCart(String)"
});
formatter.result({
  "duration": 1394270600,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.clickOnShoppingCartLinkIntoMessage()"
});
formatter.result({
  "duration": 1439615400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Overnight Duffle",
      "offset": 42
    }
  ],
  "location": "GearSteps.verifyTheProductNameInShoppingCart(String)"
});
formatter.result({
  "duration": 141117500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 19
    }
  ],
  "location": "GearSteps.verifyTheQtyIs(String)"
});
formatter.result({
  "duration": 3055272600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$135.00",
      "offset": 26
    }
  ],
  "location": "GearSteps.verifyTheProductPrice(String)"
});
formatter.result({
  "duration": 22910100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 15
    }
  ],
  "location": "GearSteps.changeQtyTo(String)"
});
formatter.result({
  "duration": 102717100,
  "status": "passed"
});
formatter.match({
  "location": "GearSteps.clickOnUpdateShoppingCartButton()"
});
formatter.result({
  "duration": 115514900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$225.00",
      "offset": 41
    }
  ],
  "location": "GearSteps.verifyTheProductPriceAfterUpdating(String)"
});
formatter.result({
  "duration": 5369533500,
  "status": "passed"
});
formatter.after({
  "duration": 834047200,
  "status": "passed"
});
formatter.uri("men.feature");
formatter.feature({
  "line": 1,
  "name": "Men Test",
  "description": "",
  "id": "men-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3056589500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "userShouldAddProductSuccessFullyToShoppingCart",
  "description": "",
  "id": "men-test;usershouldaddproductsuccessfullytoshoppingcart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Mouse Hover on Men Menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Mouse Hover on Bottoms",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on Pants",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Mouse Hover on product name and click on size Cronus Yoga Pant and click on size",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Mouse Hover on product name and click on colour Cronus Yoga Pant and click on colour Black",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Mouse Hover on product name and click on add to cart button Cronus Yoga Pant and click on Add To Cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Verify the text You added Cronus Yoga Pant to your shopping cart",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Click on shopping cart Link into message",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Verify the text \"Shopping Cart\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Verify the product name \"Cronus Yoga Pant\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Verify the product size \"32\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Verify the product colour \"Black\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MenSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 16400,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.mouseHoverOnMenMenu()"
});
formatter.result({
  "duration": 2160506000,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.mouseHoverOnBottoms()"
});
formatter.result({
  "duration": 2151639300,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.clickOnPants()"
});
formatter.result({
  "duration": 4354470100,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.mouseHoverOnProductNameAndClickOnSizeCronusYogaPantAndClickOnSize()"
});
formatter.result({
  "duration": 1357798800,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.mouseHoverOnProductNameAndClickOnColourCronusYogaPantAndClickOnColourBlack()"
});
formatter.result({
  "duration": 1195517600,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.mouseHoverOnProductNameAndClickOnAddToCartButtonCronusYogaPantAndClickOnAddToCartButton()"
});
formatter.result({
  "duration": 1369019100,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.verifyTheTextYouAddedCronusYogaPantToYourShoppingCart()"
});
formatter.result({
  "duration": 2249211000,
  "status": "passed"
});
formatter.match({
  "location": "MenSteps.clickOnShoppingCartLinkIntoMessage()"
});
formatter.result({
  "duration": 3735524800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping Cart",
      "offset": 17
    }
  ],
  "location": "MenSteps.verifyTheText(String)"
});
formatter.result({
  "duration": 42502100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cronus Yoga Pant",
      "offset": 25
    }
  ],
  "location": "MenSteps.verifyTheProductName(String)"
});
formatter.result({
  "duration": 33012500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "32",
      "offset": 25
    }
  ],
  "location": "MenSteps.verifyTheProductSize(String)"
});
formatter.result({
  "duration": 28438300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Black",
      "offset": 27
    }
  ],
  "location": "MenSteps.verifyTheProductColour(String)"
});
formatter.result({
  "duration": 34576800,
  "status": "passed"
});
formatter.after({
  "duration": 813867100,
  "status": "passed"
});
formatter.uri("women.feature");
formatter.feature({
  "line": 1,
  "name": "Women Test",
  "description": "",
  "id": "women-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2613956600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "verify the sort by product name filter",
  "description": "",
  "id": "women-test;verify-the-sort-by-product-name-filter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    },
    {
      "line": 3,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Mouse Hover on Women Menu",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Mouse Hover on Tops",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on Jackets",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify the products name display in alphabetical order",
  "keyword": "Then "
});
formatter.match({
  "location": "MenSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 79200,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.mouseHoverOnWomenMenu()"
});
formatter.result({
  "duration": 2149913900,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.mouseHoverOnTops()"
});
formatter.result({
  "duration": 2151187900,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.clickOnJackets()"
});
formatter.result({
  "duration": 3347017000,
  "status": "passed"
});
formatter.match({
  "location": "WomenSteps.verifyTheProductsNameDisplayInAlphabeticalOrder()"
});
formatter.result({
  "duration": 4036390100,
  "status": "passed"
});
formatter.after({
  "duration": 793424600,
  "status": "passed"
});
});