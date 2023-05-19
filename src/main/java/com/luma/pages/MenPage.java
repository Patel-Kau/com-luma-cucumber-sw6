package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class MenPage extends Utility {

    private  static final Logger log = LogManager.getLogger(MenPage.class.getName());

    public MenPage() {
        PageFactory.initElements(driver, this);
    }

    // X-path for Mouse Hover on product name Cronus Yoga Pant and click on size 32.

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement hoverOnPantSize;

    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option text'])[1]")
    WebElement clickOnPantSize;

    // X-path for Mouse Hover on product name Cronus Yoga Pant and click on colour Black.

    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
    WebElement pantColour;

    // Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement hoverOnAddToCartButton;

     @CacheLookup
    @FindBy(xpath = "(//span[contains(text(),'Add to Cart')])[1]")
    WebElement clickOnAddToCartButton;

    // Verify the text You added Cronus Yoga Pant to your shopping cart.
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyAddedToShoppingCart;

    // Click on ‘shopping cart’ Link into message
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement clickOnShoppingCart;


    public void pantSize() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Mouse hover on Pant Size " + hoverOnPantSize.toString());

        mouseHoverToElement(hoverOnPantSize);

        log.info("Click on Pant Size " + clickOnPantSize.toString());

        mouseHoverToElementAndClick(clickOnPantSize);
    }

    public void pantColour() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Mouse hover and click on Pant Colour " + pantColour.toString());


        mouseHoverToElementAndClick(pantColour);
    }

    public void addToCart() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Mouse hover On Add To Cart Button " + hoverOnAddToCartButton.toString());

        mouseHoverToElement(hoverOnAddToCartButton);

        log.info("Click on Add To Cart Button " + clickOnAddToCartButton.toString());

        mouseHoverToElementAndClick(clickOnAddToCartButton);
    }

    public String verifyAddedItemToTheShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        log.info("verify added item to the Shopping Cart " + verifyAddedToShoppingCart.toString());

        return getTextFromElement(verifyAddedToShoppingCart);
    }

    public void clickOnShoppingCartInMessage() {
        log.info("Mouse hover and click on Shopping Cart " + clickOnShoppingCart.toString());

        mouseHoverToElementAndClick(clickOnShoppingCart);
    }

}
