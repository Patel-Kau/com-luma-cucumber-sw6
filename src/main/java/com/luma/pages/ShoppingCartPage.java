package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {

    private  static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }
    // Verify the text ‘Shopping Cart'.
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement verifyTextShoppingCart;

    // Verify the product name ‘Cronus Yoga Pant’
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productName;

    // Verify the product size ‘32’
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement productSize;

    // Verify the product colour ‘Black’
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement productColour;

    // Verify the product name ‘Overnight Duffle’
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement verifyProductName;

    //Verify the Qty is ‘3’
       By verifyProductQuantity = By.xpath("//input[@title='Qty']");

    // Verify the product price ‘$135.00’
    @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement verifyProductPrice;

    // Change Qty to ‘5’
    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement changeQuantity;

    // Click on ‘Update Shopping Cart’ button
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement shoppingCartButton;

    // Verify the product price ‘$225.00’
    @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    WebElement newProductPrice;

    public String verifyTextShoppingCart() {
        log.info("verify the text shopping cart " + verifyTextShoppingCart.toString());

        return getTextFromElement(verifyTextShoppingCart);
    }

    public String verifyTheProductName() {
        log.info("Verify the product name " + productName.toString());

        return getTextFromElement(productName);
    }
    public String verifyTheProductSize() {
        log.info("Verify the product size " + productSize.toString());

        return getTextFromElement(productSize);
    }

    public String verifyTheProductNameColour() {
        log.info("Verify the product colour " + productColour.toString());

        return getTextFromElement(productColour);
    }

    // Verify the product name ‘Overnight Duffle’
    public String verifyTheBagProductName() {
        log.info("Verify the Bag name ‘Overnight Duffle’ " + verifyProductName.toString());

        return getTextFromElement(verifyProductName);
    }
    //Verify the Qty is ‘3’
    public String verifyTheProductQuantity() throws InterruptedException {
        Thread.sleep(3000);
        log.info("Verify the Bag Quantity '3' " + verifyProductQuantity.toString());

        return getAttributeValueFromElement(verifyProductQuantity);
    }
    // Verify the product price ‘$135.00’
    public String verifyTheProductPrice() {
        log.info("Verify the Bag price ‘$135.00’ " + verifyProductPrice.toString());


        return getTextFromElement(verifyProductPrice);
    }
    // Change Qty to ‘5’
    public void changeShoppingCartQuantity(String cartQty){
        log.info("Change shopping cart quantity to 5 " + changeQuantity.toString());

        sendTextToElement(changeQuantity, cartQty);
    }
    // Click on ‘Update Shopping Cart’ button
    public void updateShoppingCartButton(){
        log.info("Click on ‘Update Shopping Cart’ button " + shoppingCartButton.toString());

        clickOnElement(shoppingCartButton);
    }
    // Verify the product price ‘$225.00’
    public String verifyTheFinalProductPrice() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Verify the product price ‘$225.00’ " + newProductPrice.toString());

        return getTextFromElement(newProductPrice);
    }






}
