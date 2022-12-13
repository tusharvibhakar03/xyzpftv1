package com.xyz.bank.pages;

import com.xyz.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomersLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logoutText;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logoutButton;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement yourNameTextAfterLogout;

    public void clickOnLoginButton() {
        Reporter.log("Clicked on login button " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getLogoutText() {
        return getTextFromElement(logoutText);
    }

    public void clickOnLogoutButton() {
        Reporter.log("Clicked on logout button " + logoutButton.toString());
        clickOnElement(logoutButton);
    }

    public String getNameTextAfterLogout() {
        return getTextFromElement(yourNameTextAfterLogout);
    }
}
