package com.ganUI.utility;

import com.ganUI.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

    public void clickWebElement(WebElement webElement) {

        webElement.click();

    }

    //Method for explicit wait of a WebElement
    public boolean waitForWebElement(WebElement element, int time){
        boolean elementPresent;
        try {

            WebDriverWait wait = new WebDriverWait(BaseTest.getBaseClassInstance().getDriver(), time);
            wait.until(ExpectedConditions.visibilityOf(element));
            elementPresent = element.isDisplayed();
            return elementPresent;
        }
        catch(Exception e){
            elementPresent = false;
            System.out.println(e.getMessage());
            return elementPresent;
        }
        }

    }

