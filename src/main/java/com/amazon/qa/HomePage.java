package com.amazon.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    //variables
    private WebDriverWait wait;
    private WebDriver driver;

    //constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);

    }
  //web element locators
    @FindBy(xpath = "//*[@id=\"nav-logo-sprites\"]")
    WebElement logoIcon;

    @FindBy(xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
    private WebElement signinbtn;

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    WebElement searchInputBox;

    @FindBy(id = "nav-logo-sprites")
    WebElement homePageLogo;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList-nav-line-1\"]")
    WebElement helloSignInText;

    @FindBy(xpath="//*[@id=\"glow-ingress-line1\"]")
    WebElement deliverToText;

    //methods(actions)

    public void clicksearchInputBox() {
        searchInputBox.click();
    }

    public boolean isLogoDisplayed() {
        return wait.until(ExpectedConditions.visibilityOf(logoIcon)).isDisplayed();
    }

    public void clickSignIn() {
        Actions action = new Actions(driver);
        action.moveToElement(helloSignInText).perform();
        wait.until(ExpectedConditions.elementToBeClickable(signinbtn)).click();
    }

    public void enterSearchItem(String searcItemName) {
        searchInputBox.sendKeys(searcItemName);
    }

    public boolean isHomePageLogoDisplayed() {
        return homePageLogo.isDisplayed();
    }


    // AFTER LOGIN

    public boolean isDeliverTOText(){
        return  wait.until(ExpectedConditions.visibilityOf(deliverToText)).isDisplayed();
    }
}
