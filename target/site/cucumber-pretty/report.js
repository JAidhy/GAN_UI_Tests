$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/HomePage.feature");
formatter.feature({
  "name": "HomePage",
  "description": "  As an unregistered user I want to navigate to Lifeworks home page",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@HomePageUI"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I navigate to Lifeworks home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.CommonSteps.iNavigateToLifeworksHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I accept accept cookies",
  "keyword": "And "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iAcceptAcceptCookies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the region",
  "keyword": "And "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iSelectTheRegion()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify links on home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@HomePageUI"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I should see home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iShouldSeeHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Sub menu links on homepage",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I hover mouse over the \"\u003cmenu\u003e\" link",
  "keyword": "When "
});
formatter.step({
  "name": "I should see the sub \"\u003cmenu\u003e\" links",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "menu"
      ]
    },
    {
      "cells": [
        "Company"
      ]
    },
    {
      "cells": [
        "Mental health"
      ]
    },
    {
      "cells": [
        "Benefits administration"
      ]
    },
    {
      "cells": [
        "Retirement \u0026 financial"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I navigate to Lifeworks home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.CommonSteps.iNavigateToLifeworksHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I accept accept cookies",
  "keyword": "And "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iAcceptAcceptCookies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the region",
  "keyword": "And "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iSelectTheRegion()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Sub menu links on homepage",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@HomePageUI"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I hover mouse over the \"Company\" link",
  "keyword": "When "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iHoverMouseOverTheLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the sub \"Company\" links",
  "keyword": "Then "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iShouldSeeTheSubLinks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I navigate to Lifeworks home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.CommonSteps.iNavigateToLifeworksHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I accept accept cookies",
  "keyword": "And "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iAcceptAcceptCookies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the region",
  "keyword": "And "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iSelectTheRegion()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Sub menu links on homepage",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@HomePageUI"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I hover mouse over the \"Mental health\" link",
  "keyword": "When "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iHoverMouseOverTheLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the sub \"Mental health\" links",
  "keyword": "Then "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iShouldSeeTheSubLinks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I navigate to Lifeworks home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.CommonSteps.iNavigateToLifeworksHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I accept accept cookies",
  "keyword": "And "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iAcceptAcceptCookies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the region",
  "keyword": "And "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iSelectTheRegion()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Sub menu links on homepage",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@HomePageUI"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I hover mouse over the \"Benefits administration\" link",
  "keyword": "When "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iHoverMouseOverTheLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the sub \"Benefits administration\" links",
  "keyword": "Then "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iShouldSeeTheSubLinks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I navigate to Lifeworks home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.CommonSteps.iNavigateToLifeworksHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I accept accept cookies",
  "keyword": "And "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iAcceptAcceptCookies()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select the region",
  "keyword": "And "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iSelectTheRegion()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Sub menu links on homepage",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@HomePageUI"
    },
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I hover mouse over the \"Retirement \u0026 financial\" link",
  "keyword": "When "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iHoverMouseOverTheLink(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the sub \"Retirement \u0026 financial\" links",
  "keyword": "Then "
});
formatter.match({
  "location": "com.lifeworks.stepdefs.HomePageStepDefs.iShouldSeeTheSubLinks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});