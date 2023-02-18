@HomePageUI
Feature: HomePage
  As an unregistered user I want to navigate to Lifeworks home page

  Background:
    Given I navigate to Lifeworks home page
    And I accept accept cookies
    And I select the region

  @test
  Scenario: Verify links on home page
    Then I should see home page

  @test
  Scenario Outline: Sub menu links on homepage
    When I hover mouse over the "<menu>" link
    Then I should see the sub "<menu>" links
    Examples:
      | menu                    |
      | Company                 |
      | Mental health           |
      | Benefits administration |
      | Retirement & financial  |

