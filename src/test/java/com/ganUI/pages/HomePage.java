package com.ganUI.pages;

import com.ganUI.utility.CommonMethods;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage() {

        PageFactory.initElements(driver, this);
    }
    CommonMethods commonObj = new CommonMethods();
    @FindBy(css = "a[class^='newUser']")
    WebElement joinNow_button;

    public void clickJoinNowButton(){
        commonObj.clickWebElement(joinNow_button);

    }




}
