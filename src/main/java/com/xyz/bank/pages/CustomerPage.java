package com.xyz.bank.pages;

import com.xyz.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerPage extends Utility {
    @CacheLookup
    @FindBy(id = "userSelect")
    WebElement nameDropdown;

    public void searchAndSelectNameFormDropdown(String text) {
        Reporter.log("Selected " + text + " from " + nameDropdown.toString());
        selectByVisibleTextFromDropDown(nameDropdown, text);
    }
}
