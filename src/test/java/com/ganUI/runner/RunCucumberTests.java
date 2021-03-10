package com.ganUI.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(glue = {"com.ganUI.stepdefs"},
        tags = {"@signUp"},
        features = "src/test/resources",
        plugin = {"pretty", "html:target/site/cucumber-pretty"})
public class RunCucumberTests {

}

