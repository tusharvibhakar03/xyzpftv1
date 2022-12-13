package com.xyz.bank.pages;

import com.xyz.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postcodeField;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement addCustomerButton;

    public void enterFirstName(String text) {
        Reporter.log("Entered first name " + text + " in first name field " + firstNameField.toString());
        sendTextToElement(firstNameField, text);
    }

    public void enterLastName(String text) {
        Reporter.log("Entered last name " + text + " in last name field " + lastNameField.toString());
        sendTextToElement(lastNameField, text);
    }

    public void enterPostcode(String text) {
        Reporter.log("Entered Postcode " + text + " in postcode field " + postcodeField.toString());
        sendTextToElement(postcodeField, text);
    }

    public void clickOnAddCustomerButton() {
        Reporter.log("Clicked on add customer button " + addCustomerButton.toString());
        clickOnElement(addCustomerButton);
    }

}
