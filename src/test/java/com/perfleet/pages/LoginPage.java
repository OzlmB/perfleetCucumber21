package com.perfleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(id="prependedInput")
    public WebElement userName;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;

    @FindBy(xpath = " //*[@class = 'alert alert-error']/div")
    public WebElement passErrorMsg;

    @FindBy(xpath = "//a[@href='/user/reset-request']")
    public WebElement forgotPassword;

    @FindBy(css = "[type=text]")
    public WebElement forgotPasswordInputBox;

    @FindBy(css = "[type=submit]")
    public WebElement request;

    @FindBy(xpath = "//div[@class='alert alert-warn']")
    public WebElement emailSentMsg;

    @FindBy(xpath = "//span[@class='custom-checkbox__text']")
    public WebElement remembermeCheckbox;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]")
    public WebElement name;

    @FindBy(xpath = "//a[@class='no-hash']")
    public WebElement logOut;



    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

}
