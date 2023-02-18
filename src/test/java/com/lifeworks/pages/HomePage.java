package com.lifeworks.pages;

import com.lifeworks.utility.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePage extends BasePage {

    CommonMethods commonObj = new CommonMethods();
    @FindBy(css = "a[class^='newUser']")
    WebElement joinNow_button;
    @FindBy(xpath = "(.//span[contains(text(), 'Company')])[2]")
    WebElement company_link;
    @FindBy(linkText = "Company")
    WebElement company;
    @FindBy(xpath = "(.//span[contains(text(), 'Accept')])")
    WebElement accept_cookies;
    @FindBy(xpath = ".//span[contains(text(), 'Canada - English')]")
    WebElement region_canada;

    @FindBy(className = "m-menu-main__list--level-0")
    WebElement mainMenu_list;

    public HomePage() {

        PageFactory.initElements(driver, this);
    }

    public void clickJoinNowButton() {
        commonObj.clickWebElement(joinNow_button);

    }

    public void hoverOver(String mainMenu) {
        Actions actions = new Actions(driver);
        WebElement menu = driver.findElement(By.linkText(mainMenu));
        actions.moveToElement(menu).perform();
    }

    public void acceptCookies() {
        commonObj.clickWebElement(accept_cookies);
    }

    public void selectUkRegion() {
        commonObj.clickWebElement(region_canada);
    }

    public void verifyLinks(String links) {
//        assertThat(driver
//                .findElement(By.xpath(".//span[contains(text(), '" + links + "')]")).isDisplayed())
//                .withFailMessage("Links on homepage are not displayed");

//        List<WebElement> company_links = driver.findElements(By.xpath(".//span[contains(text(), '" + links + "')]"));
        WebElement company_links = driver.findElement(By.xpath(".//span[contains(text(), '" + links + "')]"));
//        assertThat(company_links.size()).isEqualTo(7);
        assertThat(company_links.isDisplayed());

    }

    public void mainMenuListIsDisplayed() {
        assertThat(mainMenu_list.isDisplayed());
    }

    public void verifySubMenuItems(String mainMenu) {
        switch (mainMenu) {
            case "Company":
                List<WebElement> companySubMenu = driver.findElements(By
                        .xpath("(.//li[@class='m-menu-main__item--level-0'])[1]/descendant::div/a"));
                assertThat(companySubMenu.size()).isEqualTo(8);
                break;

            case "Mental health":
                List<WebElement> mentalHealthSubMenu = driver.findElements(By
                        .xpath("(.//li[@class='m-menu-main__item--level-0'])[2]/descendant::div/a"));
                assertThat(mentalHealthSubMenu.size()).isEqualTo(10);
                break;

            case "Benefits administration":
                List<WebElement> benefitsAdministrationSubMenu = driver.findElements(By
                        .xpath("(.//li[@class='m-menu-main__item--level-0'])[3]/descendant::div/a"));
                assertThat(benefitsAdministrationSubMenu.size()).isEqualTo(3);
                break;

            case "Retirement & financial":
                List<WebElement> retirementFinancianSubMenu = driver.findElements(By
                        .xpath("(.//li[@class='m-menu-main__item--level-0'])[4]/descendant::div/a"));
                assertThat(retirementFinancianSubMenu.size()).isEqualTo(15);
                break;
        }


    }
}
