package com.xyz.bank.pages;

import com.xyz.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    @CacheLookup
    @FindBy(id = "userSelect")
    WebElement customerDropdown;
    @CacheLookup
    @FindBy(id = "currency")
    WebElement currencyDropdown;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processButton;

    public void searchAndSelectCreatedCustomer(String text) {
        Reporter.log("Selected " + text + " from " + customerDropdown.toString());
        selectByVisibleTextFromDropDown(customerDropdown, text);
    }

    public void selectPoundInCurrency(String text) {
        Reporter.log("Selected " + text + " from " + currencyDropdown.toString());
        selectByVisibleTextFromDropDown(currencyDropdown, text);
    }

    public void clickOnProcessButton() {
        Reporter.log("Clicked on process button " + processButton.toString());
        clickOnElement(processButton);
    }

}
