package com.lifeworks.stepdefs;

import com.lifeworks.BaseTest;
import com.lifeworks.pages.BasePage;
import com.lifeworks.pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;

public class CommonSteps {
    HomePage homePage;

    @Given("I navigate to Money Gaming site")
    public void iNavigateToMoneyGaminSite() {
        homePage = new BasePage().navigateToWebsite();
    }

    @Given("I navigate to Lifeworks home page")
    public void iNavigateToLifeworksHomePage() {
        homePage = new BasePage().navigateToWebsite();
    }


    @After
    public void afterScenario() {
        BaseTest.getBaseClassInstance().getDriver().close();
        BaseTest.getBaseClassInstance().setBaseTestInstance();

    }
}
