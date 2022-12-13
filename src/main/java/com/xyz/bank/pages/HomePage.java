package com.xyz.bank.pages;

import com.xyz.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankManagerLoginTab;
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='customer()']")
    WebElement customerLoginTab;

    public void clickOnBankManagerLoginTab() {
        Reporter.log("Clicked on bank manager login tab " + bankManagerLoginTab.toString());
        clickOnElement(bankManagerLoginTab);
    }

    public void clickOnCustomerLoginTab() {
        Reporter.log("Clicked on customer login tab " + customerLoginTab.toString());
        clickOnElement(customerLoginTab);
    }
}



