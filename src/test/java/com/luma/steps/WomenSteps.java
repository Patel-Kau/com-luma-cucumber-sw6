package com.luma.steps;

import com.luma.pages.HomePage;
import com.luma.pages.WomenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class WomenSteps {
    @When("^Mouse Hover on Women Menu$")
    public void mouseHoverOnWomenMenu() throws InterruptedException {
        new HomePage().mouseHoverOnWomenMenu();
    }

    @And("^Mouse Hover on Tops$")
    public void mouseHoverOnTops() throws InterruptedException {
        new HomePage().mouseHoverOnTops();
    }

    @And("^Click on Jackets$")
    public void clickOnJackets() throws InterruptedException {
        new HomePage().clickOnJackets();
    }


    @Then("^Verify the products name display in alphabetical order$")
    public void verifyTheProductsNameDisplayInAlphabeticalOrder() throws InterruptedException {
        Assert.assertEquals(new WomenPage().productListAfterSorting(),new WomenPage().productListBeforeSorting(),"Error Message: Product List before and after sorting is not matching");
    }

       @Then("^Verify the products price display in Low to High$")
    public void verifyTheProductsPriceDisplayInLowToHigh() throws InterruptedException {
        Assert.assertEquals(new  WomenPage().priceListAfterSorting(),new WomenPage().priceListBeforeSorting(), "Error Message: Product Price before and after sorting is not matching");
    }
}
