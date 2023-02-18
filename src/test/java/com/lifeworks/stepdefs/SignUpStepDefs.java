package com.lifeworks.stepdefs;

import com.lifeworks.pages.HomePage;
import com.lifeworks.pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpStepDefs {


    HomePage homePageObject = new HomePage();
    SignUpPage signUpObject = new SignUpPage();


    @When("I go to signup page")
    public void iGoToSignupPage() {
        homePageObject.clickJoinNowButton();
    }

    @And("I enter valid {string} and {string}")
    public void iEnterValidAnd(String firstName, String lastName) {
        signUpObject.selectTitle();
        signUpObject.enterFirstName(firstName);
        signUpObject.enterLastName(lastName);
    }

    @And("I select terms and conditions")
    public void iSelectTermsAndConditionsCheckbox() {
        signUpObject.clickTAndC();
    }

    @And("I select Join Now button")
    public void iSelectJoinNowButton() {

        signUpObject.clickJoinNowSignUp();
    }

    @Then("I should see {string} for DoB field")
    public void iShouldSeeForDoBField(String errorMessage) {

        signUpObject.verifyDobErrorMessage(errorMessage);
    }
}
