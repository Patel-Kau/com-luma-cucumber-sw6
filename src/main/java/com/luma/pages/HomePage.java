package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    // Mouse Hover on Men Menu
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menMenu;

    // Mouse Hover on Bottoms
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement menBottoms;


    // Click on Pants
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement clickOnPants;

    // Mouse Hover on Gear Menu
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearMenu;

    // Click on Bags
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement clickOnBags;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement womenTops;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement clickOnJackets;


    public void mouseHoverOnWomenMenu() throws InterruptedException {
        Thread.sleep(2000);
       log.info("Mouse hover on Women menu " + womenMenu.toString());

        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() throws InterruptedException {
        Thread.sleep(2000);
       log.info("Mouse hover on Women Tops "+ womenTops.toString());

        mouseHoverToElement(womenTops);
    }

    public void clickOnJackets() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Click on Jackets " + clickOnJackets.toString());

        clickOnElement(clickOnJackets);

    }

    public void mouseHoverOnMenMenu() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Mouse hover on Men menu " + menMenu.toString());
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottom() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Mouse hover on Men Bottoms " + menBottoms.toString());

        mouseHoverToElement(menBottoms);
    }

    public void clickOnPants() throws InterruptedException {
        Thread.sleep(3000);
        log.info("Click on Pants " + clickOnPants.toString());

        clickOnElement(clickOnPants);
    }

    public void mouseHoverOnGearMenu() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Mouse hover on Gear menu " + gearMenu.toString());

        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags() throws InterruptedException {
        Thread.sleep(2000);
        log.info("Click on Bags " + clickOnBags.toString());

        clickOnElement(clickOnBags);
    }


}

