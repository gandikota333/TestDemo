package com.amazon.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage {

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']/span[contains(text(),'toys')]")
    WebElement searchResultTextToys;


    public boolean isToysTxtDisplayed(){
        return searchResultTextToys.isDisplayed();
    }
}
