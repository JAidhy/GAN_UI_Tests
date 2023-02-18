package com.lifeworks.stepdefs;

import com.lifeworks.pages.HomePage;
import com.lifeworks.utility.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefs {

    HomePage homePageObject = new HomePage();
    CommonMethods commonMethods = new CommonMethods();


    @When("I hover mouse over Company link")
    public void iHoverMouseOverCompanyLink() throws InterruptedException {
//        homePageObject.hoverOver();
//        Thread.sleep(20000);
    }

    @And("I accept accept cookies")
    public void iAcceptAcceptCookies() {
        homePageObject.acceptCookies();
    }

    @And("I select the region")
    public void iSelectTheRegion() {
        homePageObject.selectUkRegion();
    }

    @Then("^I should see all company \"([^\"]*)\"$")
    public void iShouldSeeAllCompany(String links) {
        homePageObject.verifyLinks(links);

    }

    @Then("I should see home page")
    public void iShouldSeeHomePage() {
        homePageObject.mainMenuListIsDisplayed();
    }

    @Then("I should see Company sub menu {string}")
    public void iShouldSeeCompanySubMenu(String links) {
        homePageObject.verifyLinks(links);
    }

    @When("I hover mouse over the {string} link")
    public void iHoverMouseOverTheLink(String mainMenu) {
        homePageObject.hoverOver(mainMenu);

    }

    @Then("I should see the sub {string} links")
    public void iShouldSeeTheSubLinks(String mainMenu) {
        homePageObject.verifySubMenuItems(mainMenu);

        }
    }
