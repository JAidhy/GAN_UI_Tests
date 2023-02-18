package com.lifeworks.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(glue = {"com.lifeworks.stepdefs"},
        tags = {"@test"},
        features = "src/test/resources",
        plugin = {"pretty", "html:target/site/cucumber-pretty"})
public class RunCucumberTests {

}

