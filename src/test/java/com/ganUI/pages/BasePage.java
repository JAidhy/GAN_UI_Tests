package com.ganUI.pages;

import com.ganUI.utility.BaseTest;
import com.ganUI.utility.PropertiesUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver = BaseTest.getBaseClassInstance().getDriver();

    public HomePage navigateToWebsite() {
        final PropertiesUtil propertiesUtil = PropertiesUtil.getInstance();
        driver.navigate().to(propertiesUtil.getWebURL());
        return PageFactory.initElements(driver, HomePage.class);
    }
}
