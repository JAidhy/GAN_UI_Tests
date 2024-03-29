package com.lifeworks.pages;

import com.lifeworks.utility.CommonMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BasePage {

    public SignUpPage() {
        PageFactory.initElements(driver, this);
    }

    CommonMethods commonObject = new CommonMethods();

    @FindBy(id = "title")
    WebElement title_dropDown;

    @FindBy(id = "forename")
    WebElement firstName_textBox;

    @FindBy(css = "input[name^='map(last']")
    WebElement lastName_textBox;

    @FindBy(css = "input[name='map(terms)']")
    WebElement tAndC_checkbox;

    @FindBy(css = "input[id='form']")
    WebElement joinNowSignUpPage_button;

    @FindBy(css = "label[for='dob']")
    WebElement dobErrorMessage_label;

    public void enterFirstName(String firstName) {
        firstName_textBox.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastName_textBox.sendKeys(lastName);
    }

    public void selectTitle() {
        Select select = new Select(title_dropDown);
        select.selectByValue("Mr");
    }

    public void clickTAndC() {
        commonObject.clickWebElement(tAndC_checkbox);
    }

    public void clickJoinNowSignUp() {
        commonObject.clickWebElement(joinNowSignUpPage_button);
    }

    public void verifyDobErrorMessage(String errorMessage) {

        Assert.assertEquals(errorMessage, dobErrorMessage_label.getText());

    }

}
