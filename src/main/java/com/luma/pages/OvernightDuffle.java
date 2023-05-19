package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OvernightDuffle extends Utility {
    private  static final Logger log = LogManager.getLogger(OvernightDuffle.class.getName());

    public OvernightDuffle() {
        PageFactory.initElements(driver, this);
    }

    // Verify the text ‘Overnight Duffle’
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement textOvernightDuffle;


    // X-path for Change Qty 3
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement bagQuantity;


    // X path for 'Add to Cart’ Button.
    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCartButton;

    // Verify the text ‘You added Overnight Duffle to your shopping cart.’
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement youAdded_ProductTextMessage;


    // Click on ‘shopping cart’ Link into message
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;


    // Verify the text ‘Overnight Duffle’
    public String verifyTheTextOvernightDuffle() {
        log.info("Verify the text ‘Overnight Duffle’ " + textOvernightDuffle.toString());

        return getTextFromElement(textOvernightDuffle);
    }

    // Change Qty 3
    public void changeBagQuantity(String qty) {
        log.info("Change quantity to 3 " + bagQuantity.toString());

        sendTextToElement(bagQuantity, qty);
    }

    // Click on ‘Add to Cart’ Button.
    public void clickOnAddToCartButton() {
        log.info("Click on add to cart button " + addToCartButton.toString());

        mouseHoverToElementAndClick(addToCartButton);
    }

    // Verify the text ‘You added Overnight Duffle to your shopping cart.’
    public String verifyTextYouAdded_ProductNameMessage() {
        log.info("Verify the text ‘You added Overnight Duffle to your shopping cart.’ " + youAdded_ProductTextMessage.toString());

        return getTextFromElement(youAdded_ProductTextMessage);
    }

    // Click on Product Name ‘Overnight Duffle’
    public void clickOnShoppingCartInToMessage() {
        log.info("Click on shopping cart in to the message " + shoppingCart.toString());

        clickOnElement(shoppingCart);
    }


}
