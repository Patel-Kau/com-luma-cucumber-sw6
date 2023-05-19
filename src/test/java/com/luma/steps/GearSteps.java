package com.luma.steps;

import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.pages.OvernightDuffle;
import com.luma.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GearSteps {
    @When("^Mouse Hover on Gear Menu$")
    public void mouseHoverOnGearMenu() throws InterruptedException {
        new HomePage().mouseHoverOnGearMenu();
    }

    @And("^Click on Bags$")
    public void clickOnBags() throws InterruptedException {
        new HomePage().clickOnBags();
    }

    @And("^Click on Product Name ‘Overnight Duffle’$")
    public void clickOnProductNameOvernightDuffle() throws InterruptedException {
        new GearPage().clickOnBagProductName();
    }

    @Then("^Verify the product text \"([^\"]*)\"$")
    public void verifyTheProductText(String gearProductName) {
        String expectedMessage = gearProductName;
        String actualMessage = new OvernightDuffle().verifyTheTextOvernightDuffle();
        Assert.assertEquals(actualMessage, expectedMessage, "Error Message : Product Name is not Matching");
    }

    @And("^Change Qty \"([^\"]*)\"$")
    public void changeQty(String quantityOnGearProduct) {
        new OvernightDuffle().changeBagQuantity(quantityOnGearProduct);

    }

    @And("^Click on ‘Add to Cart’ Button\\.$")
    public void clickOnAddToCartButton() {
        new OvernightDuffle().clickOnAddToCartButton();

    }

    @Then("^Verify the product text in shopping cart \"([^\"]*)\"$")
    public void verifyTheProductTextInShoppingCart(String productTextInShoppingCart) {
        String expectedMessage = productTextInShoppingCart;
        String actualMessage = new OvernightDuffle().verifyTextYouAdded_ProductNameMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Error Message : You added Product Name to your shopping cart  is not Matching");

    }

    @And("^Click on ‘shopping cart’ Link into message$")
    public void clickOnShoppingCartLinkIntoMessage() {
        new OvernightDuffle().clickOnShoppingCartInToMessage();
    }

    @Then("^Verify the product name in shopping cart \"([^\"]*)\"$")
    public void verifyTheProductNameInShoppingCart(String productNameInShoppingCart) {
        String expectedMessage = productNameInShoppingCart;
        String actualMessage = new ShoppingCartPage().verifyTheBagProductName();
        Assert.assertEquals(actualMessage, expectedMessage, "Error Message : Product Name Overnight Duffle in shopping cart  is not Matching");

    }

    @Then("^Verify the Qty is \"([^\"]*)\"$")
    public void verifyTheQtyIs(String expectedMessage) throws InterruptedException {

        String actualMessage = new ShoppingCartPage().verifyTheProductQuantity();
//        Assert.assertTrue(actualMessage.contains(expectedMessage), "Error Message : Product quantity in shopping cart  is not matching");
        Assert.assertEquals(actualMessage,expectedMessage,"Error message");
    }

    @Then("^Verify the product price \"([^\"]*)\"$")
    public void verifyTheProductPrice(String productPriceInShoppingCart) {
        String expectedMessage = productPriceInShoppingCart;
        String actualMessage = new ShoppingCartPage().verifyTheProductPrice();
        Assert.assertEquals(actualMessage, expectedMessage, "Error Message : Product Name Overnight Duffle in shopping cart  is not matching");

    }

    @And("^Change Qty to \"([^\"]*)\"$")
    public void changeQtyTo(String changeQuantityInShoppingCart) {
        new ShoppingCartPage().changeShoppingCartQuantity(changeQuantityInShoppingCart);
    }

    @And("^Click on ‘Update Shopping Cart’ button$")
    public void clickOnUpdateShoppingCartButton() {

        new ShoppingCartPage().updateShoppingCartButton();
    }


    @Then("^Verify the product price after updating \"([^\"]*)\"$")
    public void verifyTheProductPriceAfterUpdating(String priceAfterUpdatingCart) throws InterruptedException {
        new ShoppingCartPage().verifyTheFinalProductPrice();
Assert.assertEquals(new ShoppingCartPage().verifyTheFinalProductPrice(),priceAfterUpdatingCart,"Error Message : Expected and actual Price not matching");
    }
}
