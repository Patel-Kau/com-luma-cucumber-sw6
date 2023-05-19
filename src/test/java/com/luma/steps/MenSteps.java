package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.MenPage;
import com.luma.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MenSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^Mouse Hover on Men Menu$")
    public void mouseHoverOnMenMenu() throws InterruptedException {
    new HomePage().mouseHoverOnMenMenu();
    }

    @And("^Mouse Hover on Bottoms$")
    public void mouseHoverOnBottoms() throws InterruptedException {
        new HomePage().mouseHoverOnBottom();
    }

    @And("^Click on Pants$")
    public void clickOnPants() throws InterruptedException {
        new HomePage().clickOnPants();
    }

    @And("^Mouse Hover on product name and click on size Cronus Yoga Pant and click on size$")
    public void mouseHoverOnProductNameAndClickOnSizeCronusYogaPantAndClickOnSize() throws InterruptedException {
        new MenPage().pantSize();
    }

    @And("^Mouse Hover on product name and click on colour Cronus Yoga Pant and click on colour Black$")
    public void mouseHoverOnProductNameAndClickOnColourCronusYogaPantAndClickOnColourBlack() throws InterruptedException {
        new MenPage().pantColour();
    }

    @And("^Mouse Hover on product name and click on add to cart button Cronus Yoga Pant and click on Add To Cart Button$")
    public void mouseHoverOnProductNameAndClickOnAddToCartButtonCronusYogaPantAndClickOnAddToCartButton() throws InterruptedException {
        new MenPage().addToCart();

    }

    @Then("^Verify the text You added Cronus Yoga Pant to your shopping cart$")
    public void verifyTheTextYouAddedCronusYogaPantToYourShoppingCart() throws InterruptedException {
        String expectedMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String actualMessage = new MenPage().verifyAddedItemToTheShoppingCart();
        Assert.assertEquals(actualMessage,expectedMessage, "Error: Message not matching");
    }

    @And("^Click on shopping cart Link into message$")
    public void clickOnShoppingCartLinkIntoMessage() {
        new MenPage().clickOnShoppingCartInMessage();
    }

    @Then("^Verify the text \"([^\"]*)\"$")
    public void verifyTheText(String textMessage)  {
     String expectedMessage = textMessage;
     String actualMessage = new ShoppingCartPage().verifyTextShoppingCart();
     Assert.assertEquals(actualMessage,expectedMessage, "Error Message : 'Shopping cart' message not matching");


    }

    @Then("^Verify the product name \"([^\"]*)\"$")
    public void verifyTheProductName(String name)  {
        String expectedMessage = name;
        String actualMessage = new ShoppingCartPage().verifyTheProductName();
        Assert.assertEquals(actualMessage,expectedMessage, "Error Message : 'Product Name' message not matching");



    }

    @Then("^Verify the product size \"([^\"]*)\"$")
    public void verifyTheProductSize(String size)  {
        String expectedMessage = size;
        String actualMessage = new ShoppingCartPage().verifyTheProductSize();
        Assert.assertEquals(actualMessage,expectedMessage, "Error Message : 'Product Size' message not matching");




    }

    @Then("^Verify the product colour \"([^\"]*)\"$")
    public void verifyTheProductColour(String colour)  {
        String expectedMessage = colour;
        String actualMessage = new ShoppingCartPage().verifyTheProductNameColour();
        Assert.assertEquals(actualMessage,expectedMessage, "Error Message : 'Shopping cart' message not matching");




    }
}
