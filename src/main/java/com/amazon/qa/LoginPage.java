package com.amazon.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);

    }

    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    WebElement phoneEmailInputBox;

    @FindBy(xpath = "//*[@id='continue']")
    WebElement continueBtn;

    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    WebElement passwordInputBox;

    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    WebElement signInBtn;


    public boolean isPhoneEmailInputBox() {
        return phoneEmailInputBox.isDisplayed();
    }

    public void enterEmail(String email) {
        phoneEmailInputBox.click();
        phoneEmailInputBox.sendKeys(email);
    }

    public void clickContinueBtn() {
        continueBtn.click();
    }

    public void enterPassword(String password){
        passwordInputBox.click();
        passwordInputBox.sendKeys(password);
    }

    public  void clickSignInBtn(){
        signInBtn.click();
    }

}