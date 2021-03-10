@uiAutomation @signUp

Feature: SignUp
  As an unregistered user I want to sign up to the Money Gaming site

  @dobValidations
  Scenario Outline: Validate error message for blank DoB field
    Given I navigate to Money Gaming site
    When I go to signup page
    And I enter valid "<firstName>" and "<lastName>"
    And I select terms and conditions
    And I select Join Now button
    Then I should see "<errorMessage>" for DoB field

    Examples:
      | firstName | lastName | errorMessage           |
      | Rob       | Brown    | This field is required |

