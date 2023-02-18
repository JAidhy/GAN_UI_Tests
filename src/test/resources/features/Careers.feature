@CareersUI
Feature: Careers
  As an unregistered user I want to navigate to Lifeworks Careers and search for the current vacancies

  Background:
    Given I navigate to Lifeworks home page
    And I accept accept cookies
    And I select the region

  Scenario: Search job with a valid job title
    And I navigate to Careers page
    When I search for "<role>"
    Then valid search results should be displayed
