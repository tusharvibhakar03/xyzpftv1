package com.xyz.bank.pages;

import com.xyz.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='deposit()']")
    WebElement depositTab;
    @CacheLookup
    @FindBy(xpath = "//input[@ng-model='amount']")
    WebElement amountField;
    @CacheLookup
    @FindBy(xpath = "//button[text()='Deposit']")
    WebElement depositButton;
    @CacheLookup
    @FindBy(xpath = "//span[text()='Deposit Successful']")
    WebElement depositMsg;
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='withdrawl()']")
    WebElement withdrawTab;
    @CacheLookup
    @FindBy(xpath = "//button[text()='Withdraw']")
    WebElement withdrawButton;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement withdrawMsg;

    public void clickOnDepositTab() {
        Reporter.log("Clicked on desktop tab " + depositTab.toString());
        clickOnElement(depositTab);
    }

    public void enterAmountToDeposit(String text) {
        Reporter.log("Entered amount to deposit " + text + " in deipsit field " + amountField.toString());
        sendTextToElement(amountField, text);
    }

    public void clickOnDepositButton() {
        Reporter.log("Clicked on deposit button " + depositButton.toString());
        clickOnElement(depositButton);
    }

    public String getDepositMsg() {
        return getTextFromElement(depositMsg);
    }

    public void clickOnWithdrawTab() {
        Reporter.log("Clicked on withdraw tab " + withdrawTab.toString());
        clickOnElement(withdrawTab);
    }

    public void enterAmountToWithdraw(String text) {
        Reporter.log("Entered amount to withdraw " + text + " in withdraw field " + amountField.toString());
        sendTextToElement(amountField, text);
    }

    public void clickOnWithdrawButton() {
        Reporter.log("Clicked withdraw button " + withdrawButton.toString());
        clickOnElement(withdrawButton);
    }

    public String getWithdrawMsg() {
        return getTextFromElement(withdrawMsg);
    }
}
