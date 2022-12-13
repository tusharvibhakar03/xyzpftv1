package com.xyz.bank.pages;


import com.xyz.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='addCustomer()']")
    WebElement addCustomerTab;
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='openAccount()']")
    WebElement openAccountTab;
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='showCustomer()']")
    WebElement customersTab;

    public void clickOnAddCustomerTab() {
        Reporter.log("Clicked on add customer tab " + addCustomerTab.toString());
        clickOnElement(addCustomerTab);
    }

    public void clickOnOpenAccountTab() {
        Reporter.log("Clicked on open account tab " + openAccountTab.toString());
        clickOnElement(openAccountTab);
    }

    public void clickOnCustomersTab() {
        Reporter.log("Clicked on customers tab " + customersTab.toString());
        clickOnElement(customersTab);
    }

    public String getPopupMsg() {
        return getTextFromAlert();
    }

    public void clickOKOnPopup() {
        Reporter.log("Accepted popup");
        acceptAlert();
    }
}
