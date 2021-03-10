Feature: Validate password field

  Scenario Outline: Validate password field for positive combinations
    Given I navigate to Money Gaming site
    When I go to signup page
    And I enter valid information
    And I enter valid "<password>"
    And I select Join Now button
    Then I should successfully signup

    Examples:
    |password|
    |Test123@|
    |12E34%8 |
    |newtest@1|

  Scenario Outline: Validate password field for negative combinations
    Given I navigate to Money Gaming site
    When I go to signup page
    And I enter valid information
    And I enter invalid "<password>"
    And I select Join Now button
    Then I should see an error message

    Examples:
      |password|
      |Test1|
      |12E348|
      |newtes|
      |     |
      | 123@R|
      |123@R |



