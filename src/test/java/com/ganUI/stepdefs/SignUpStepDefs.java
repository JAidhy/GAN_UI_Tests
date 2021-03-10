package com.ganUI.stepdefs;

import com.ganUI.pages.HomePage;
import com.ganUI.pages.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;

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

    @And("I select terms and conditions checkbox")
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
