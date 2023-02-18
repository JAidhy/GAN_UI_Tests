#Lifeworks Automation Test
Added scenario in BDD format 
1. Scenarios to verify homepage
2. Scenario to verify careers

#Prerequisite to run the tests
- Java 8 and above.
- Maven~~~~

##Run Test
Tests can be executed in following way

- By executing `RunCucumberTests.java` file

#Project description
1. `Maven` is used as the build tool
2. `Cucumber` is used to write feature files
3. `Page Object` and `Page Factory pattern` is implemented
4. `Singleton pattern` implemented to initialise the WebDriver
5. `config.properties` is used for configuration

##Reports
Pretty format report is generated at `target/site/cucumber-pretty/index.html`. 
Default format of cucumber report is currently used, this can be further enhanced using Extent reports plugins.
