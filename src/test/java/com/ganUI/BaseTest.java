package com.ganUI;

import com.ganUI.utility.PropertiesUtil;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


import java.util.concurrent.TimeUnit;

//Singleton pattern is used to create single instance of this class
public class BaseTest {

        private static BaseTest baseTest = null;
        private WebDriver driver;
        PropertiesUtil propertiesUtil = PropertiesUtil.getInstance();

        private BaseTest() {

            if (propertiesUtil.getBrowser().equalsIgnoreCase("chrome")) {

                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);

                WebDriverManager.chromedriver().setup();
                ChromeDriverManager.chromedriver();

                driver = new ChromeDriver(chromeOptions);



            } else if (propertiesUtil.getBrowser().equalsIgnoreCase("firefox")) {

                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);

                WebDriverManager.firefoxdriver().setup();
                FirefoxDriverManager.firefoxdriver();

                driver = new FirefoxDriver(firefoxOptions);


            }

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }

        public static BaseTest getBaseClassInstance() {
            if (baseTest == null) {
                baseTest = new BaseTest();
            }
            return baseTest;
        }

        // To get the driver
        public WebDriver getDriver() {

            return driver;
        }

        //To set the instance as null
        public void setBaseTestInstance() {

            baseTest = null;
        }


    }


