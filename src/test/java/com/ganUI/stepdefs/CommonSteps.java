package com.ganUI.stepdefs;

import com.ganUI.pages.BasePage;
import com.ganUI.pages.HomePage;
import com.ganUI.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;

public class CommonSteps {

    HomePage homePage;

    @Given("I navigate to Money Gaming site")
    public void iNavigateToMoneyGaminSite() {
        homePage = new BasePage().navigateToWebsite();
    }

    @After
    public void afterScenario() {
        BaseTest.getBaseClassInstance().getDriver().close();
        BaseTest.getBaseClassInstance().setBaseTestInstance();

    }

}
