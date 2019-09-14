Feature: Acceptance testing to validate the Search Cars page is working as expected.

  Scenario: Validate search cars page
    Given User is on the home page "https://www.carsguide.com.au/"
    When I move to the menu
      | Menu       |
      | buy + sell |
      | reviews    |
    And click on Search Cars link
    And select Make as "BMW" from the Any Make dropdown
    And select Car Model as "1 SERIES" from the select Model dropdown
    And select Location as "Australia" from the select Location dropdown
    And select Price as "10000" from the Price dropdown
    And click on the Find My Next Car button
    Then I should see the list of cars
    And the page title should be "BMW 1 SERIES cars under"
