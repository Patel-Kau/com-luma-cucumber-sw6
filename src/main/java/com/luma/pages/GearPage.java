package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GearPage extends Utility {

    private  static final Logger log = LogManager.getLogger(GearPage.class.getName());

    public GearPage() {
        PageFactory.initElements(driver, this);
    }
    // Bag Product Name ‘Overnight Duffle’
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement bagProductName;


    // Click on Product Name ‘Overnight Duffle’
    public void clickOnBagProductName() throws InterruptedException {
        Thread.sleep(2000);
        log.info(" Click on Product Name ‘Overnight Duffle’" + bagProductName.toString());

        clickOnElement(bagProductName);
    }


}
